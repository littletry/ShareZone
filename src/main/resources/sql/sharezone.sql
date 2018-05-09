/*
Navicat MySQL Data Transfer

Source Server         : 本机mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : sharezone

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-05-10 03:04:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '内容唯一标识',
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '分享内容标题',
  `detail` varchar(2555) COLLATE utf8_bin DEFAULT NULL COMMENT '详细信息',
  `create_time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '创建时间',
  `user_id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户Id',
  `check_publish` int(2) DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of content
-- ----------------------------
INSERT INTO `content` VALUES ('0ff84c86-781b-430d-bce7-312ed4924351', 'spring', 'Spring是一个开放源代码的设计层面框架，他解决的是业务逻辑层和其他各层的松耦合问题，因此它将面向接口的编程思想贯穿整个系统应用。Spring是于2003 年兴起的一个轻量级的Java 开发框架，由Rod Johnson创建。简单来说，Spring是一个分层的JavaSE/EE full-stack(一站式) 轻量级开源框架。', '2018-04-06 18:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc11', '0');
INSERT INTO `content` VALUES ('105f0a41-baad-4e92-8ed9-53ea62062751', 'spring MVC', 'Spring MVC属于SpringFrameWork的后续产品，已经融合在Spring Web Flow里面。Spring 框架提供了构建 Web 应用程序的全功能 MVC 模块。使用 Spring 可插入的 MVC 架构，从而在使用Spring进行WEB开发时，可以选择使用Spring的SpringMVC框架或集成其他MVC开发框架，如Struts1(现在一般不用)，Struts2等。', '2018-04-06 17:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc11', '1');
INSERT INTO `content` VALUES ('1269ab8a-7084-494a-8ff2-74799458c0da', 'MyBatis', 'iBatis 本是apache的一个开源项目iBatis, 2010年这个项目由apache software foundation 迁移到了google code，并且改名为MyBatis 。2013年11月迁移到Github。iBATIS一词来源于“internet”和“abatis”的组合，是一个基于Java的持久层框架。iBATIS提供的持久层框架包括SQL Maps和Data Access Objects（DAOs）', '2018-04-06 16:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc11', '2');
INSERT INTO `content` VALUES ('2076bb35-651c-42d5-a7b5-d59663938678', 'tomcat1', 'Tomcat是Apache 软件基金会（Apache Software Foundation）的Jakarta 项目中的一个核心项目，由Apache、Sun 和其他一些公司及个人共同开发而成。由于有了Sun 的参与和支持，最新的Servlet 和JSP 规范总是能在Tomcat 中得到体现，Tomcat 5支持最新的Servlet 2.4 和JSP 2.0 规范。因为Tomcat 技术先进、性能稳定，而且免费，因而深受Java 爱好者的喜爱并得到了部分软件开发商的认可，成为目前比较流行的Web 应用服务器。', '2018-04-06 15:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc11', '0');
INSERT INTO `content` VALUES ('2be32e6c-8eeb-4f3e-a8d9-81ba3fb32c8e', 'tomcat2', 'Tomcat 服务器是一个免费的开放源代码的Web 应用服务器，属于轻量级应用服务器，在中小型系统和并发访问用户不是很多的场合下被普遍使用，是开发和调试JSP 程序的首选。对于一个初学者来说，可以这样认为，当在一台机器上配置好Apache 服务器，可利用它响应HTML（标准通用标记语言下的一个应用）页面的访问请求。实际上Tomcat是Apache 服务器的扩展，但运行时它是独立运行的，所以当你运行tomcat 时，它实际上作为一个与Apache 独立的进程单独运行的。', '2018-04-06 14:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc11', '1');
INSERT INTO `content` VALUES ('43d0d142-926d-4d05-9389-21eab4888760', 'tomcat3', '诀窍是，当配置正确时，Apache 为HTML页面服务，而Tomcat 实际上运行JSP 页面和Servlet。另外，Tomcat和IIS等Web服务器一样，具有处理HTML页面的功能，另外它还是一个Servlet和JSP容器，独立的Servlet容器是Tomcat的默认模式。不过，Tomcat处理静态HTML的能力不如Apache服务器。目前Tomcat最新版本为9.0。', '2018-04-06 13:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc13', '2');
INSERT INTO `content` VALUES ('4c689bee-6b47-4c96-98bd-4c0897a0f7ff', 'Hibernate', 'Hibernate是一个开放源代码的对象关系映射框架，它对JDBC进行了非常轻量级的对象封装，它将POJO与数据库表建立映射关系，是一个全自动的orm框架，hibernate可以自动生成SQL语句，自动执行，使得Java程序员可以随心所欲的使用对象编程思维来操纵数据库。 Hibernate可以应用在任何使用JDBC的场合，既可以在Java的客户端程序使用，也可以在Servlet/JSP的Web应用中使用，最具革命意义的是，Hibernate可以在应用EJB的J2EE架构中取代CMP，完成数据持久化的重任。', '2018-04-06 12:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc13', '0');
INSERT INTO `content` VALUES ('52eee118-7589-420b-ab8d-06e219de2480', 'linux1', 'Linux是一套免费使用和自由传播的类Unix操作系统，是一个基于POSIX和UNIX的多用户、多任务、支持多线程和多CPU的操作系统。它能运行主要的UNIX工具软件、应用程序和网络协议。它支持32位和64位硬件。Linux继承了Unix以网络为核心的设计思想，是一个性能稳定的多用户网络操作系统。', '2018-04-06 11:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc13', '1');
INSERT INTO `content` VALUES ('72b9d468-ff14-4407-a030-a04df41e7572', 'linux2', 'Linux操作系统诞生于1991 年10 月5 日（这是第一次正式向外公布时间）。Linux存在着许多不同的Linux版本，但它们都使用了Linux内核。Linux可安装在各种计算机硬件设备中，比如手机、平板电脑、路由器、视频游戏控制台、台式计算机、大型机和超级计算机。严格来讲，Linux这个词本身只表示Linux内核，但实际上人们已经习惯了用Linux来形容整个基于Linux内核，并且使用GNU 工程各种工具和数据库的操作系统。', '2018-04-06 10:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc13', '2');
INSERT INTO `content` VALUES ('98f91c84-5cab-458a-a4d1-aacacf993160', 'react', 'React 起源于 Facebook 的内部项目，因为该公司对市场上所有 JavaScript MVC 框架，都不满意，就决定自己写一套，用来架设Instagram 的网站。做出来以后，发现这套东西很好用，就在2013年5月开源了。', '2018-04-06 09:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc13', '0');
INSERT INTO `content` VALUES ('a72e8a92-94a6-4cc6-9d3d-5400a85bf4d3', 'AntUI', 'AntUI目标在于降低开发门槛、提高开发效率、减少代码量，在RIA崭露头角的时代此类特点显得尤为重要，同JQuery的推崇的Write less,Do more思想类似，在UI开发方面的提供UI基类、底层统一的API及风格统一的界面，让设计师也可构建成熟的用户界面系统、模块化的开发方式让开发者更专注于业务层的处理，提升开发效率及用户体验。', '2018-04-06 08:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc13', '1');
INSERT INTO `content` VALUES ('a931223f-a128-4b3f-a011-bb350a150674', 'AntUI', 'AntUI了诸如、ExtJS、Dojo、JQuery现今流行框架的精髓（JQuery的简单易用、YUI3、Dojo等优秀的企业级应用架构管理、ExtJs的丰富组件及组件工作模式），尽量缩减体积并向标准靠拢，试图打造轻量级的Web前端及RIA应用框架，如其名，它拥有优雅易用的API、轻量级的身材、功能丰富的插件、简单易扩展的机制，旨在创建一个功能丰富但又轻量级同时又兼顾企业级应用开发的系统。', '2018-04-06 07:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc13', '2');
INSERT INTO `content` VALUES ('aee78fcb-701c-49c6-aab5-73046a53fe03', 'idea', 'IDEA 全称IntelliJ IDEA，是java语言开发的集成环境，IntelliJ在业界被公认为最好的java开发工具之一，尤其在智能代码助手、代码自动提示、重构、J2EE支持、Ant、JUnit、CVS整合、代码审查、 创新的GUI设计等方面的功能可以说是超常的。IDEA是JetBrains公司的产品，这家公司总部位于捷克共和国的首都布拉格，开发人员以严谨著称的东欧程序员为主。', '2018-04-06 06:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc13', '0');
INSERT INTO `content` VALUES ('ca7526c2-cbf3-47cf-82a5-944c3ca5f003', 'Java', 'Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程', '2018-04-06 05:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc12', '1');
INSERT INTO `content` VALUES ('dae341eb-8503-4957-acbf-078f779ca798', 'HTML', '超文本标记语言，标准通用标记语言下的一个应用。“超文本”就是指页面内可以包含图片、链接，甚至音乐、程序等非文字元素。超文本标记语言的结构包括“头”部分（英语：Head）、和“主体”部分（英语：Body），其中“头”部提供关于网页的信息，“主体”部分提供网页的具体内容。', '2018-04-06 04:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc12', '2');
INSERT INTO `content` VALUES ('e73e7560-c320-44f8-adca-e54a25ec33e1', 'CSS', '层叠样式表(英文全称：Cascading Style Sheets)是一种用来表现HTML（标准通用标记语言的一个应用）或XML（标准通用标记语言的一个子集）等文件样式的计算机语言。CSS不仅可以静态地修饰网页，还可以配合各种脚本语言动态地对网页各元素进行格式化。CSS能够对网页中元素位置的排版进行像素级精确控制，支持几乎所有的字体字号样式，拥有对网页对象和模型样式编辑的能力。', '2018-04-06 03:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc12', '0');
INSERT INTO `content` VALUES ('ea5d7765-7942-4343-af85-2bc642593a3d', 'javascript', 'JavaScript一种直译式脚本语言，是一种动态类型、弱类型、基于原型的语言，内置支持类型。它的解释器被称为JavaScript引擎，为浏览器的一部分，广泛用于客户端的脚本语言，最早是在HTML（标准通用标记语言下的一个应用）网页上使用，用来给HTML网页增加动态功能。在1995年时，由Netscape公司的Brendan Eich，在网景导航者浏览器上首次设计实现而成。因为Netscape与Sun合作，Netscape管理层希望它外观看起来像Java，因此取名为JavaScript。但实际上它的语法风格与Self及Scheme较为接近。为了取得技术优势，微软推出了JScript，CEnvi推出ScriptEase，与JavaScript同样可在浏览器上运行。为了统一规格，因为JavaScript兼容于ECMA标准，因此也称为ECMAScript。', '2018-04-06 02:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc12', '1');
INSERT INTO `content` VALUES ('ef830da6-721c-4aac-b0b6-8529b800c675', 'jdk', 'JDK是 Java 语言的软件开发工具包，主要用于移动设备、嵌入式设备上的java应用程序。JDK是整个java开发的核心，它包含了JAVA的运行环境（JVM+Java系统类库）和JAVA工具。', '2018-04-06 01:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc12', '2');
INSERT INTO `content` VALUES ('f007dc76-1438-48b1-a0c2-08bc012d8ef1', 'Windows操作系统', 'Microsoft Windows,是美国微软公司研发的一套操作系统，它问世于1985年，起初仅仅是Microsoft-DOS模拟环境，后续的系统版本由于微软不断的更新升级，不但易用，也慢慢的成为家家户户人们最喜爱的操作系统。Windows采用了图形化模式GUI，比起从前的DOS需要键入指令使用的方式更为人性化。随着电脑硬件和软件的不断升级，微软的Windows也在不断升级，从架构的16位、32位再到64位， 系统版本从最初的Windows 1.0 到大家熟知的Windows 95、Windows 98、Windows ME、Windows 2000、Windows 2003、Windows XP、Windows Vista、Windows 7、Windows 8、Windows 8.1、Windows 10 和 Windows Server服务器企业级操作系统，不断持续更新，微软一直在致力于Windows操作系统的开发和完善。', '2018-04-06 00:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc12', '0');
INSERT INTO `content` VALUES ('fced5584-8c61-4086-af45-ed4597815f46', 'layui', 'layui（谐音：类UI) 是一款采用自身模块规范编写的前端 UI 框架，遵循原生 HTML/CSS/JS 的书写与组织形式，门槛极低，拿来即用。其外在极简，却又不失饱满的内在，体积轻盈，组件丰盈，从核心代码到 API 的每一处细节都经过精心雕琢，非常适合界面的快速开发。layui 首个版本发布于2016年金秋，她区别于那些基于 MVVM 底层的 UI 框架，却并非逆道而行，而是信奉返璞归真之道。准确地说，她更多是为服务端程序员量身定做，你无需涉足各种前端工具的复杂配置，只需面对浏览器本身，让一切你所需要的元素与交互，从这里信手拈来。', '2018-04-06 19:07:38', 'e1b8b07f-d089-496b-a728-e91e6a5ebc12', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '用户唯一标识',
  `login_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登录用户名',
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户密码',
  `user_name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `sex` int(2) DEFAULT NULL COMMENT '用户性别（男0女1保密2）',
  `birthday` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户生日',
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户邮箱',
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户个性描述信息',
  `reg_time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户注册时间',
  `last_time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户最后一次登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('85510db5-c2af-49f9-93c4-79349e9b634b', '1', '665f644e43731ff9db3d341da5c827e1', '1', '1', '893431633310', '1', '1231312312', '2018-04-24 23:27:20', '2018-04-24 23:28:55');
INSERT INTO `user` VALUES ('e1b8b07f-d089-496b-a728-e91e6a5ebc11', 'ht', '14e1b600b1fd579f47433b88e8d85291', '黄涛', '0', '814809600000', '1109394634@qq.com', '啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦', '2018-04-16 19:22:05', '2018-05-07 16:02:23');
INSERT INTO `user` VALUES ('e1b8b07f-d089-496b-a728-e91e6a5ebc12', 'zs', '14e1b600b1fd579f47433b88e8d85291', '张三', '1', '814809600000', '1109394643@qq.com', '哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈', '2018-04-16 19:22:05', '2018-04-17 17:30:02');
INSERT INTO `user` VALUES ('e1b8b07f-d089-496b-a728-e91e6a5ebc13', 'ls', '14e1b600b1fd579f47433b88e8d85291', '李四', '2', '814809600000', '1659522714@qq.com', '恩恩嫩嗯嗯嗯嗯嗯嗯嗯嗯嗯嗯嗯嗯嗯嗯嗯嗯嗯嫩恩恩', '2018-04-16 19:22:05', '2018-04-17 17:30:13');
