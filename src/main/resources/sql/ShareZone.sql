/*
Navicat MySQL Data Transfer

Source Server         : 本机mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : sharezone

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-12-07 09:50:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '内容唯一标识',
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '分享内容标题',
  `detail` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '详细信息',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `imageUrl` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '图片地址',
  `videoUrl` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '视频地址',
  `userId` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of content
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) COLLATE utf8_bin NOT NULL COMMENT '用户唯一标识',
  `loginName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登录用户名',
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户密码',
  `userName` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `sex` int(2) DEFAULT NULL COMMENT '用户性别',
  `birthday` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户生日',
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户邮箱',
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户个性描述信息',
  `regTime` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户注册时间',
  `lastTime` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户最后一次登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'ht', 'ht950905', '黄涛', '1', '1995-10-28', '1109394634@qq.com', '一点点小努力，最后必然大成功', '2017-12-07 08:21:11', '2017-12-07 08:21:21');
