/*
 Navicat Premium Data Transfer

 Source Server         : 123321xpc
 Source Server Type    : MySQL
 Source Server Version : 50739
 Source Host           : localhost:3306
 Source Schema         : music

 Target Server Type    : MySQL
 Target Server Version : 50739
 File Encoding         : 65001

 Date: 30/05/2024 22:58:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for music
-- ----------------------------
DROP TABLE IF EXISTS `music`;
CREATE TABLE `music`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `singer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fullname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of music
-- ----------------------------
INSERT INTO `music` VALUES ('1788119200238690306', '如果当时', '许嵩', '如果当时-许嵩', 'new');
INSERT INTO `music` VALUES ('1788119202411339778', '有何不可', '许嵩', '有何不可-许嵩', 'rise');
INSERT INTO `music` VALUES ('1788119202432311298', '断桥残雪', '许嵩', '断桥残雪-许嵩', 'hot');
INSERT INTO `music` VALUES ('1788163405086494722', '曼陀山庄', '许嵩', '曼陀山庄-许嵩', 'hot');
INSERT INTO `music` VALUES ('1788163407359807490', '灰色头像', '许嵩', '灰色头像-许嵩', 'hot');
INSERT INTO `music` VALUES ('1788166987978375170', '大千世界', '许嵩', '大千世界-许嵩', 'new');
INSERT INTO `music` VALUES ('1788166990184579074', '纸上雪', '许嵩', '纸上雪-许嵩', 'hot');
INSERT INTO `music` VALUES ('1788167169386237953', '半城烟沙', '许嵩', '半城烟沙-许嵩', 'rise');
INSERT INTO `music` VALUES ('1788167171441446914', '惊鸿一面', '许嵩&黄龄', '惊鸿一面-许嵩&黄龄', 'hot');
INSERT INTO `music` VALUES ('1789131646793781249', '关键词', '林俊杰', '关键词-林俊杰', 'hot');
INSERT INTO `music` VALUES ('1789131649431998465', '另一个天堂', '王力宏&张靓颖', '另一个天堂-王力宏&张靓颖', 'hot');
INSERT INTO `music` VALUES ('1789131649431998466', '大城小爱', '王力宏', '大城小爱-王力宏', 'hot');
INSERT INTO `music` VALUES ('1789131649431998467', '小镇姑娘', '王力宏', '小镇姑娘-王力宏', 'hot');
INSERT INTO `music` VALUES ('1789131649431998468', '断桥残雪', '许嵩', '断桥残雪-许嵩', 'hot');
INSERT INTO `music` VALUES ('1789131649499107329', '曼陀山庄', '许嵩', '曼陀山庄-许嵩', 'hot');
INSERT INTO `music` VALUES ('1789131649499107330', '灰色头像', '许嵩', '灰色头像-许嵩', 'hot');
INSERT INTO `music` VALUES ('1789131649499107331', '缘分一道桥', '王力宏&谭维维', '缘分一道桥-王力宏&谭维维', 'hot');
INSERT INTO `music` VALUES ('1789131649499107332', '这么近那么远', '张学友', '这么近那么远-张学友', 'hot');
INSERT INTO `music` VALUES ('1789131649566216194', '龙的传人', '王力宏', '龙的传人-王力宏', 'hot');
INSERT INTO `music` VALUES ('1789131905280315394', 'what do you say', '余佳运&赖冠愉', 'what do you say-余佳运&赖冠愉', 'new');
INSERT INTO `music` VALUES ('1789131907427799042', '大千世界', '许嵩', '大千世界-许嵩', 'new');
INSERT INTO `music` VALUES ('1789131907427799043', '如果当时', '许嵩', '如果当时-许嵩', 'new');
INSERT INTO `music` VALUES ('1789131907427799044', '故乡', '许巍', '故乡-许巍', 'new');
INSERT INTO `music` VALUES ('1789131907499102209', '曾经的你', '许巍', '曾经的你-许巍', 'new');
INSERT INTO `music` VALUES ('1789131907499102210', '永隔一江水', '许巍&朴树', '永隔一江水-许巍&朴树', 'hot');
INSERT INTO `music` VALUES ('1789131907499102211', '纸上雪', '许嵩', '纸上雪-许嵩', 'hot');
INSERT INTO `music` VALUES ('1789131907499102212', '蓝莲花', '许巍', '蓝莲花-许巍', 'new');
INSERT INTO `music` VALUES ('1789131907557822466', '邂逅一夏', '余佳运&王OK', '邂逅一夏-余佳运&王OK', 'hot');
INSERT INTO `music` VALUES ('1789131907557822467', '黑暗骑士(feat. 五月天)', '五月天&林俊杰', '黑暗骑士(feat. 五月天)-五月天&林俊杰', 'new');

SET FOREIGN_KEY_CHECKS = 1;
