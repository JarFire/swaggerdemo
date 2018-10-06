-- MySQL dump 10.13  Distrib 5.1.45, for Win64 (x86_64)
--
-- Host: 10.153.103.6    Database: swagger
-- ------------------------------------------------------
-- Server version	5.1.45

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8