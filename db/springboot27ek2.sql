-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot27ek2
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bumen`
--

DROP TABLE IF EXISTS `bumen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bumen` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='部门';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bumen`
--

LOCK TABLES `bumen` WRITE;
/*!40000 ALTER TABLE `bumen` DISABLE KEYS */;
INSERT INTO `bumen` VALUES (41,'2021-04-14 07:37:24','部门1'),(42,'2021-04-14 07:37:24','部门2'),(43,'2021-04-14 07:37:24','部门3'),(44,'2021-04-14 07:37:24','部门4'),(45,'2021-04-14 07:37:24','部门5'),(46,'2021-04-14 07:37:24','部门6');
/*!40000 ALTER TABLE `bumen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/springboot27ek2/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/springboot27ek2/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/springboot27ek2/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `luyongxinxi`
--

DROP TABLE IF EXISTS `luyongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `luyongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `zhiwu` varchar(200) DEFAULT NULL COMMENT '职务',
  `kaishishangbanshijian` datetime DEFAULT NULL COMMENT '开始上班时间',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='录用信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `luyongxinxi`
--

LOCK TABLES `luyongxinxi` WRITE;
/*!40000 ALTER TABLE `luyongxinxi` DISABLE KEYS */;
INSERT INTO `luyongxinxi` VALUES (121,'2021-04-14 07:37:25','用户账号1','用户姓名1','部门1','职务1','2021-04-14 15:37:25','备注1'),(122,'2021-04-14 07:37:25','用户账号2','用户姓名2','部门2','职务2','2021-04-14 15:37:25','备注2'),(123,'2021-04-14 07:37:25','用户账号3','用户姓名3','部门3','职务3','2021-04-14 15:37:25','备注3'),(124,'2021-04-14 07:37:25','用户账号4','用户姓名4','部门4','职务4','2021-04-14 15:37:25','备注4'),(125,'2021-04-14 07:37:25','用户账号5','用户姓名5','部门5','职务5','2021-04-14 15:37:25','备注5'),(126,'2021-04-14 07:37:25','用户账号6','用户姓名6','部门6','职务6','2021-04-14 15:37:25','备注6');
/*!40000 ALTER TABLE `luyongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (141,'2021-04-14 07:37:25','标题1','简介1','http://localhost:8080/springboot27ek2/upload/news_picture1.jpg','内容1'),(142,'2021-04-14 07:37:25','标题2','简介2','http://localhost:8080/springboot27ek2/upload/news_picture2.jpg','内容2'),(143,'2021-04-14 07:37:25','标题3','简介3','http://localhost:8080/springboot27ek2/upload/news_picture3.jpg','内容3'),(144,'2021-04-14 07:37:25','标题4','简介4','http://localhost:8080/springboot27ek2/upload/news_picture4.jpg','内容4'),(145,'2021-04-14 07:37:25','标题5','简介5','http://localhost:8080/springboot27ek2/upload/news_picture5.jpg','内容5'),(146,'2021-04-14 07:37:25','标题6','简介6','http://localhost:8080/springboot27ek2/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `peixun`
--

DROP TABLE IF EXISTS `peixun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `peixun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `peixunbiaoti` varchar(200) DEFAULT NULL COMMENT '培训标题',
  `peixunbiaozhun` longtext COMMENT '培训标准',
  `peixunrenyuanxuanbazhidu` longtext COMMENT '培训人员选拔制度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='培训';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `peixun`
--

LOCK TABLES `peixun` WRITE;
/*!40000 ALTER TABLE `peixun` DISABLE KEYS */;
INSERT INTO `peixun` VALUES (81,'2021-04-14 07:37:24','培训标题1','培训标准1','培训人员选拔制度1'),(82,'2021-04-14 07:37:24','培训标题2','培训标准2','培训人员选拔制度2'),(83,'2021-04-14 07:37:24','培训标题3','培训标准3','培训人员选拔制度3'),(84,'2021-04-14 07:37:24','培训标题4','培训标准4','培训人员选拔制度4'),(85,'2021-04-14 07:37:24','培训标题5','培训标准5','培训人员选拔制度5'),(86,'2021-04-14 07:37:24','培训标题6','培训标准6','培训人员选拔制度6');
/*!40000 ALTER TABLE `peixun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `putongyonghu`
--

DROP TABLE IF EXISTS `putongyonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `putongyonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='普通用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `putongyonghu`
--

LOCK TABLES `putongyonghu` WRITE;
/*!40000 ALTER TABLE `putongyonghu` DISABLE KEYS */;
INSERT INTO `putongyonghu` VALUES (11,'2021-04-14 07:37:24','普通用户1','123456','用户姓名1','男','13823888881','773890001@qq.com','http://localhost:8080/springboot27ek2/upload/putongyonghu_touxiang1.jpg'),(12,'2021-04-14 07:37:24','普通用户2','123456','用户姓名2','男','13823888882','773890002@qq.com','http://localhost:8080/springboot27ek2/upload/putongyonghu_touxiang2.jpg'),(13,'2021-04-14 07:37:24','普通用户3','123456','用户姓名3','男','13823888883','773890003@qq.com','http://localhost:8080/springboot27ek2/upload/putongyonghu_touxiang3.jpg'),(14,'2021-04-14 07:37:24','普通用户4','123456','用户姓名4','男','13823888884','773890004@qq.com','http://localhost:8080/springboot27ek2/upload/putongyonghu_touxiang4.jpg'),(15,'2021-04-14 07:37:24','普通用户5','123456','用户姓名5','男','13823888885','773890005@qq.com','http://localhost:8080/springboot27ek2/upload/putongyonghu_touxiang5.jpg'),(16,'2021-04-14 07:37:24','普通用户6','123456','用户姓名6','男','13823888886','773890006@qq.com','http://localhost:8080/springboot27ek2/upload/putongyonghu_touxiang6.jpg');
/*!40000 ALTER TABLE `putongyonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiuzhijianli`
--

DROP TABLE IF EXISTS `qiuzhijianli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiuzhijianli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `zhuanye` varchar(200) DEFAULT NULL COMMENT '专业',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `gongzuonianxian` varchar(200) DEFAULT NULL COMMENT '工作年限',
  `gangweimingcheng` varchar(200) DEFAULT NULL COMMENT '岗位名称',
  `gongzuodidian` varchar(200) DEFAULT NULL COMMENT '工作地点',
  `qiwangxinzi` varchar(200) DEFAULT NULL COMMENT '期望薪资',
  `shifoubiye` varchar(200) DEFAULT NULL COMMENT '是否毕业',
  `biyeyuanxiao` varchar(200) DEFAULT NULL COMMENT '毕业院校',
  `beizhu` longtext COMMENT '备注',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='求职简历';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiuzhijianli`
--

LOCK TABLES `qiuzhijianli` WRITE;
/*!40000 ALTER TABLE `qiuzhijianli` DISABLE KEYS */;
INSERT INTO `qiuzhijianli` VALUES (101,'2021-04-14 07:37:25','用户账号1','用户姓名1','http://localhost:8080/springboot27ek2/upload/qiuzhijianli_touxiang1.jpg','专业1','性别1',1,'工作年限1','岗位名称1','工作地点1','期望薪资1','是','毕业院校1','备注1','是',''),(102,'2021-04-14 07:37:25','用户账号2','用户姓名2','http://localhost:8080/springboot27ek2/upload/qiuzhijianli_touxiang2.jpg','专业2','性别2',2,'工作年限2','岗位名称2','工作地点2','期望薪资2','是','毕业院校2','备注2','是',''),(103,'2021-04-14 07:37:25','用户账号3','用户姓名3','http://localhost:8080/springboot27ek2/upload/qiuzhijianli_touxiang3.jpg','专业3','性别3',3,'工作年限3','岗位名称3','工作地点3','期望薪资3','是','毕业院校3','备注3','是',''),(104,'2021-04-14 07:37:25','用户账号4','用户姓名4','http://localhost:8080/springboot27ek2/upload/qiuzhijianli_touxiang4.jpg','专业4','性别4',4,'工作年限4','岗位名称4','工作地点4','期望薪资4','是','毕业院校4','备注4','是',''),(105,'2021-04-14 07:37:25','用户账号5','用户姓名5','http://localhost:8080/springboot27ek2/upload/qiuzhijianli_touxiang5.jpg','专业5','性别5',5,'工作年限5','岗位名称5','工作地点5','期望薪资5','是','毕业院校5','备注5','是',''),(106,'2021-04-14 07:37:25','用户账号6','用户姓名6','http://localhost:8080/springboot27ek2/upload/qiuzhijianli_touxiang6.jpg','专业6','性别6',6,'工作年限6','岗位名称6','工作地点6','期望薪资6','是','毕业院校6','备注6','是','');
/*!40000 ALTER TABLE `qiuzhijianli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `renshidangan`
--

DROP TABLE IF EXISTS `renshidangan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `renshidangan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `zhiwu` varchar(200) DEFAULT NULL COMMENT '职务',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `ruzhishijian` date DEFAULT NULL COMMENT '入职时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='人事档案';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `renshidangan`
--

LOCK TABLES `renshidangan` WRITE;
/*!40000 ALTER TABLE `renshidangan` DISABLE KEYS */;
INSERT INTO `renshidangan` VALUES (31,'2021-04-14 07:37:24','员工工号1','男','员工姓名1','部门1','职务1','联系方式1','2021-04-14'),(32,'2021-04-14 07:37:24','员工工号2','男','员工姓名2','部门2','职务2','联系方式2','2021-04-14'),(33,'2021-04-14 07:37:24','员工工号3','男','员工姓名3','部门3','职务3','联系方式3','2021-04-14'),(34,'2021-04-14 07:37:24','员工工号4','男','员工姓名4','部门4','职务4','联系方式4','2021-04-14'),(35,'2021-04-14 07:37:24','员工工号5','男','员工姓名5','部门5','职务5','联系方式5','2021-04-14'),(36,'2021-04-14 07:37:24','员工工号6','男','员工姓名6','部门6','职务6','联系方式6','2021-04-14');
/*!40000 ALTER TABLE `renshidangan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `renshidiaodong`
--

DROP TABLE IF EXISTS `renshidiaodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `renshidiaodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `diaodongqianbumen` varchar(200) DEFAULT NULL COMMENT '调动前部门',
  `diaodongqianzhiwu` varchar(200) DEFAULT NULL COMMENT '调动前职务',
  `diaodonghoubumen` varchar(200) DEFAULT NULL COMMENT '调动后部门',
  `diaodonghouzhiwu` varchar(200) DEFAULT NULL COMMENT '调动后职务',
  `diaodongshijian` date DEFAULT NULL COMMENT '调动时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='人事调动';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `renshidiaodong`
--

LOCK TABLES `renshidiaodong` WRITE;
/*!40000 ALTER TABLE `renshidiaodong` DISABLE KEYS */;
INSERT INTO `renshidiaodong` VALUES (61,'2021-04-14 07:37:24','员工工号1','员工姓名1','调动前部门1','调动前职务1','调动后部门1','调动后职务1','2021-04-14'),(62,'2021-04-14 07:37:24','员工工号2','员工姓名2','调动前部门2','调动前职务2','调动后部门2','调动后职务2','2021-04-14'),(63,'2021-04-14 07:37:24','员工工号3','员工姓名3','调动前部门3','调动前职务3','调动后部门3','调动后职务3','2021-04-14'),(64,'2021-04-14 07:37:24','员工工号4','员工姓名4','调动前部门4','调动前职务4','调动后部门4','调动后职务4','2021-04-14'),(65,'2021-04-14 07:37:24','员工工号5','员工姓名5','调动前部门5','调动前职务5','调动后部门5','调动后职务5','2021-04-14'),(66,'2021-04-14 07:37:24','员工工号6','员工姓名6','调动前部门6','调动前职务6','调动后部门6','调动后职务6','2021-04-14');
/*!40000 ALTER TABLE `renshidiaodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-04-14 07:37:25');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xinchou`
--

DROP TABLE IF EXISTS `xinchou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xinchou` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `biaozhunxinchou` varchar(200) DEFAULT NULL COMMENT '标准薪酬',
  `qitaxinchou` longtext COMMENT '其他薪酬',
  `riqi` date DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='薪酬';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xinchou`
--

LOCK TABLES `xinchou` WRITE;
/*!40000 ALTER TABLE `xinchou` DISABLE KEYS */;
INSERT INTO `xinchou` VALUES (51,'2021-04-14 07:37:24','员工工号1','员工姓名1','标准薪酬1','其他薪酬1','2021-04-14'),(52,'2021-04-14 07:37:24','员工工号2','员工姓名2','标准薪酬2','其他薪酬2','2021-04-14'),(53,'2021-04-14 07:37:24','员工工号3','员工姓名3','标准薪酬3','其他薪酬3','2021-04-14'),(54,'2021-04-14 07:37:24','员工工号4','员工姓名4','标准薪酬4','其他薪酬4','2021-04-14'),(55,'2021-04-14 07:37:24','员工工号5','员工姓名5','标准薪酬5','其他薪酬5','2021-04-14'),(56,'2021-04-14 07:37:24','员工工号6','员工姓名6','标准薪酬6','其他薪酬6','2021-04-14');
/*!40000 ALTER TABLE `xinchou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yaoqingmianshi`
--

DROP TABLE IF EXISTS `yaoqingmianshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yaoqingmianshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `mianshishijian` datetime DEFAULT NULL COMMENT '面试时间',
  `mianshididian` varchar(200) DEFAULT NULL COMMENT '面试地点',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='邀请面试';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yaoqingmianshi`
--

LOCK TABLES `yaoqingmianshi` WRITE;
/*!40000 ALTER TABLE `yaoqingmianshi` DISABLE KEYS */;
INSERT INTO `yaoqingmianshi` VALUES (111,'2021-04-14 07:37:25','用户账号1','用户姓名1','2021-04-14 15:37:25','面试地点1','备注1'),(112,'2021-04-14 07:37:25','用户账号2','用户姓名2','2021-04-14 15:37:25','面试地点2','备注2'),(113,'2021-04-14 07:37:25','用户账号3','用户姓名3','2021-04-14 15:37:25','面试地点3','备注3'),(114,'2021-04-14 07:37:25','用户账号4','用户姓名4','2021-04-14 15:37:25','面试地点4','备注4'),(115,'2021-04-14 07:37:25','用户账号5','用户姓名5','2021-04-14 15:37:25','面试地点5','备注5'),(116,'2021-04-14 07:37:25','用户账号6','用户姓名6','2021-04-14 15:37:25','面试地点6','备注6');
/*!40000 ALTER TABLE `yaoqingmianshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangong`
--

DROP TABLE IF EXISTS `yuangong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) NOT NULL COMMENT '员工工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `zhiwu` varchar(200) DEFAULT NULL COMMENT '职务',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `ruzhishijian` date DEFAULT NULL COMMENT '入职时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='员工';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangong`
--

LOCK TABLES `yuangong` WRITE;
/*!40000 ALTER TABLE `yuangong` DISABLE KEYS */;
INSERT INTO `yuangong` VALUES (21,'2021-04-14 07:37:24','员工1','123456','员工姓名1','部门1','职务1','http://localhost:8080/springboot27ek2/upload/yuangong_touxiang1.jpg','2021-04-14'),(22,'2021-04-14 07:37:24','员工2','123456','员工姓名2','部门2','职务2','http://localhost:8080/springboot27ek2/upload/yuangong_touxiang2.jpg','2021-04-14'),(23,'2021-04-14 07:37:24','员工3','123456','员工姓名3','部门3','职务3','http://localhost:8080/springboot27ek2/upload/yuangong_touxiang3.jpg','2021-04-14'),(24,'2021-04-14 07:37:24','员工4','123456','员工姓名4','部门4','职务4','http://localhost:8080/springboot27ek2/upload/yuangong_touxiang4.jpg','2021-04-14'),(25,'2021-04-14 07:37:24','员工5','123456','员工姓名5','部门5','职务5','http://localhost:8080/springboot27ek2/upload/yuangong_touxiang5.jpg','2021-04-14'),(26,'2021-04-14 07:37:24','员工6','123456','员工姓名6','部门6','职务6','http://localhost:8080/springboot27ek2/upload/yuangong_touxiang6.jpg','2021-04-14');
/*!40000 ALTER TABLE `yuangong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangongyingpin`
--

DROP TABLE IF EXISTS `yuangongyingpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangongyingpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `yingpinbumen` varchar(200) DEFAULT NULL COMMENT '应聘部门',
  `yingpinzhiwu` varchar(200) DEFAULT NULL COMMENT '应聘职务',
  `fasongshijian` datetime DEFAULT NULL COMMENT '发送时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='员工应聘';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangongyingpin`
--

LOCK TABLES `yuangongyingpin` WRITE;
/*!40000 ALTER TABLE `yuangongyingpin` DISABLE KEYS */;
INSERT INTO `yuangongyingpin` VALUES (131,'2021-04-14 07:37:25','员工工号1','员工姓名1','应聘部门1','应聘职务1','2021-04-14 15:37:25','是',''),(132,'2021-04-14 07:37:25','员工工号2','员工姓名2','应聘部门2','应聘职务2','2021-04-14 15:37:25','是',''),(133,'2021-04-14 07:37:25','员工工号3','员工姓名3','应聘部门3','应聘职务3','2021-04-14 15:37:25','是',''),(134,'2021-04-14 07:37:25','员工工号4','员工姓名4','应聘部门4','应聘职务4','2021-04-14 15:37:25','是',''),(135,'2021-04-14 07:37:25','员工工号5','员工姓名5','应聘部门5','应聘职务5','2021-04-14 15:37:25','是',''),(136,'2021-04-14 07:37:25','员工工号6','员工姓名6','应聘部门6','应聘职务6','2021-04-14 15:37:25','是','');
/*!40000 ALTER TABLE `yuangongyingpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhaopinxinxi`
--

DROP TABLE IF EXISTS `zhaopinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhaopinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhaopinbianhao` varchar(200) DEFAULT NULL COMMENT '招聘编号',
  `gangweimingcheng` varchar(200) DEFAULT NULL COMMENT '岗位名称',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `zhaopinrenshu` int(11) DEFAULT NULL COMMENT '招聘人数',
  `zhiweiyaoqiu` longtext COMMENT '职位要求',
  `gongzidaiyu` longtext COMMENT '工资待遇',
  `gongzuorenwu` longtext COMMENT '工作任务',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhaopinbianhao` (`zhaopinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='招聘信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhaopinxinxi`
--

LOCK TABLES `zhaopinxinxi` WRITE;
/*!40000 ALTER TABLE `zhaopinxinxi` DISABLE KEYS */;
INSERT INTO `zhaopinxinxi` VALUES (91,'2021-04-14 07:37:25','招聘编号1','岗位名称1','联系方式1','邮箱1',1,'职位要求1','工资待遇1','工作任务1','http://localhost:8080/springboot27ek2/upload/zhaopinxinxi_tupian1.jpg','2021-04-14 15:37:25'),(92,'2021-04-14 07:37:25','招聘编号2','岗位名称2','联系方式2','邮箱2',2,'职位要求2','工资待遇2','工作任务2','http://localhost:8080/springboot27ek2/upload/zhaopinxinxi_tupian2.jpg','2021-04-14 15:37:25'),(93,'2021-04-14 07:37:25','招聘编号3','岗位名称3','联系方式3','邮箱3',3,'职位要求3','工资待遇3','工作任务3','http://localhost:8080/springboot27ek2/upload/zhaopinxinxi_tupian3.jpg','2021-04-14 15:37:25'),(94,'2021-04-14 07:37:25','招聘编号4','岗位名称4','联系方式4','邮箱4',4,'职位要求4','工资待遇4','工作任务4','http://localhost:8080/springboot27ek2/upload/zhaopinxinxi_tupian4.jpg','2021-04-14 15:37:25'),(95,'2021-04-14 07:37:25','招聘编号5','岗位名称5','联系方式5','邮箱5',5,'职位要求5','工资待遇5','工作任务5','http://localhost:8080/springboot27ek2/upload/zhaopinxinxi_tupian5.jpg','2021-04-14 15:37:25'),(96,'2021-04-14 07:37:25','招聘编号6','岗位名称6','联系方式6','邮箱6',6,'职位要求6','工资待遇6','工作任务6','http://localhost:8080/springboot27ek2/upload/zhaopinxinxi_tupian6.jpg','2021-04-14 15:37:25');
/*!40000 ALTER TABLE `zhaopinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiwu`
--

DROP TABLE IF EXISTS `zhiwu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiwu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhiwu` varchar(200) DEFAULT NULL COMMENT '职务',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='职务';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiwu`
--

LOCK TABLES `zhiwu` WRITE;
/*!40000 ALTER TABLE `zhiwu` DISABLE KEYS */;
INSERT INTO `zhiwu` VALUES (71,'2021-04-14 07:37:24','职务1'),(72,'2021-04-14 07:37:24','职务2'),(73,'2021-04-14 07:37:24','职务3'),(74,'2021-04-14 07:37:24','职务4'),(75,'2021-04-14 07:37:24','职务5'),(76,'2021-04-14 07:37:24','职务6');
/*!40000 ALTER TABLE `zhiwu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-15 15:24:00
