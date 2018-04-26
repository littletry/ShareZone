/*
Navicat MySQL Data Transfer

Source Server         : 本机mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : sharezone

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-04-26 23:32:02
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
  `image_url` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '图片地址',
  `video_url` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '视频地址',
  `user_id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户Id',
  `check_publish` int(2) DEFAULT NULL COMMENT '审核状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

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
