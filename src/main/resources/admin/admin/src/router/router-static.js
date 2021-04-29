import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yuangong from '@/views/modules/yuangong/list'
    import yaoqingmianshi from '@/views/modules/yaoqingmianshi/list'
    import peixun from '@/views/modules/peixun/list'
    import qiuzhijianli from '@/views/modules/qiuzhijianli/list'
    import yuangongyingpin from '@/views/modules/yuangongyingpin/list'
    import renshidangan from '@/views/modules/renshidangan/list'
    import putongyonghu from '@/views/modules/putongyonghu/list'
    import zhiwu from '@/views/modules/zhiwu/list'
    import zhaopinxinxi from '@/views/modules/zhaopinxinxi/list'
    import luyongxinxi from '@/views/modules/luyongxinxi/list'
    import renshidiaodong from '@/views/modules/renshidiaodong/list'
    import bumen from '@/views/modules/bumen/list'
    import xinchou from '@/views/modules/xinchou/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告',
        component: news
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/yaoqingmianshi',
        name: '邀请面试',
        component: yaoqingmianshi
      }
      ,{
	path: '/peixun',
        name: '培训',
        component: peixun
      }
      ,{
	path: '/qiuzhijianli',
        name: '求职简历',
        component: qiuzhijianli
      }
      ,{
	path: '/yuangongyingpin',
        name: '员工应聘',
        component: yuangongyingpin
      }
      ,{
	path: '/renshidangan',
        name: '人事档案',
        component: renshidangan
      }
      ,{
	path: '/putongyonghu',
        name: '普通用户',
        component: putongyonghu
      }
      ,{
	path: '/zhiwu',
        name: '职务',
        component: zhiwu
      }
      ,{
	path: '/zhaopinxinxi',
        name: '招聘信息',
        component: zhaopinxinxi
      }
      ,{
	path: '/luyongxinxi',
        name: '录用信息',
        component: luyongxinxi
      }
      ,{
	path: '/renshidiaodong',
        name: '人事调动',
        component: renshidiaodong
      }
      ,{
	path: '/bumen',
        name: '部门',
        component: bumen
      }
      ,{
	path: '/xinchou',
        name: '薪酬',
        component: xinchou
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
