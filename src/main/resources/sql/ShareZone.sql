/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : sharezone

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-12-07 23:50:53
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
  `create_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '创建时间',
  `image_Url` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '图片地址',
  `video_Url` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '视频地址',
  `user_Id` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户Id',
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
  `login_Name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '登录用户名',
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户密码',
  `user_Name` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  `sex` int(2) DEFAULT NULL COMMENT '用户性别',
  `birthday` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户生日',
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户邮箱',
  `description` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户个性描述信息',
  `reg_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户注册时间',
  `last_Time` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '用户最后一次登录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0f52548f-4246-452c-bb7e-759a7c0143c2', 'ht', 'ht950905', '小王', '0', '2017-12-07 23:38:52', '1109394634@qq.com', '我是一个很好的人，很好很好的那种那种', '2017-12-07 23:38:52', '2017-12-07 23:38:52');
INSERT INTO `user` VALUES ('270466c4-cafe-4ddf-9a4b-d1737ada1ad8', 'ht', 'ht950905', '张三', '0', '2017-12-07 23:19:56', '1109394634@qq.com', '我是一个很好的人，很好很好的那种那种', '2017-12-07 23:19:56', '2017-12-07 23:19:56');
INSERT INTO `user` VALUES ('84c17151-2d03-4a40-9e8e-d54bf3a03659', 'ht', 'ht950905', '小李子', '0', '2017-12-07 23:42:42', '1109394634@qq.com', '我是一个很好的人，很好很好的那种那种', '2017-12-07 23:42:42', '2017-12-07 23:42:42');
INSERT INTO `user` VALUES ('fd5f1de6-266c-4edc-9789-ef32ac3d82b2', 'ht', 'ht950905', '李四', '0', '2017-12-07 23:22:33', '1109394634@qq.com', '我是一个很好的人，很好很好的那种那种', '2017-12-07 23:22:33', '2017-12-07 23:22:33');
