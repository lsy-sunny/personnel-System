
var projectName = '人事管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '招聘信息',
	url: './pages/zhaopinxinxi/list.html'
}, 

{
	name: '公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot27ek2/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"普通用户","menuJump":"列表","tableName":"putongyonghu"}],"menu":"普通用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"人事档案","menuJump":"列表","tableName":"renshidangan"}],"menu":"人事档案管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"部门","menuJump":"列表","tableName":"bumen"}],"menu":"部门管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"薪酬","menuJump":"列表","tableName":"xinchou"}],"menu":"薪酬管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"人事调动","menuJump":"列表","tableName":"renshidiaodong"}],"menu":"人事调动管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"职务","menuJump":"列表","tableName":"zhiwu"}],"menu":"职务管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"培训","menuJump":"列表","tableName":"peixun"}],"menu":"培训管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","邀请面试"],"menu":"求职简历","menuJump":"列表","tableName":"qiuzhijianli"}],"menu":"求职简历管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"邀请面试","menuJump":"列表","tableName":"yaoqingmianshi"}],"menu":"邀请面试管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"录用信息","menuJump":"列表","tableName":"luyongxinxi"}],"menu":"录用信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"员工应聘","menuJump":"列表","tableName":"yuangongyingpin"}],"menu":"员工应聘管理"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","投递简历"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"求职简历","menuJump":"列表","tableName":"qiuzhijianli"}],"menu":"求职简历管理"},{"child":[{"buttons":["查看"],"menu":"邀请面试","menuJump":"列表","tableName":"yaoqingmianshi"}],"menu":"邀请面试管理"},{"child":[{"buttons":["查看"],"menu":"录用信息","menuJump":"列表","tableName":"luyongxinxi"}],"menu":"录用信息管理"}],"frontMenu":[{"child":[{"buttons":["查看","投递简历"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"普通用户","tableName":"putongyonghu"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"薪酬","menuJump":"列表","tableName":"xinchou"}],"menu":"薪酬管理"},{"child":[{"buttons":["查看"],"menu":"人事调动","menuJump":"列表","tableName":"renshidiaodong"}],"menu":"人事调动管理"},{"child":[{"buttons":["查看"],"menu":"培训","menuJump":"列表","tableName":"peixun"}],"menu":"培训管理"},{"child":[{"buttons":["查看"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["新增","查看"],"menu":"员工应聘","menuJump":"列表","tableName":"yuangongyingpin"}],"menu":"员工应聘管理"},{"child":[{"buttons":["查看"],"menu":"公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","投递简历"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"员工","tableName":"yuangong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
