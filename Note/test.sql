CREATE DATABASE  IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `test`;
-- MySQL dump 10.13  Distrib 5.5.40, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: test
-- ------------------------------------------------------
-- Server version	5.5.40-0ubuntu0.14.04.1

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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (2,'Yudi3@prawed','Kampret2','Kampret4'),(3,'Tes@tes.co','seeng','Sedeng'),(4,'Gila','monyet','anjing'),(5,'Tes@tes.co','seeng','Sedeng'),(6,'Tes@tes.co','seeng','Sedeng'),(7,'Tes@tes.co','seeng','Sedeng'),(8,'Tes@tes.co','seeng','Sedeng'),(9,'Tes@tes.co','seeng','Sedeng'),(10,'Tes@tes.co','seeng','Sedeng'),(11,'Tes@tes.co','seeng','Sedeng'),(12,'Tes@tes.co','seeng','Sedeng'),(13,'Tes@tes.co','seeng','Sedeng'),(14,'Tes@tes.co','seeng','Sedeng'),(15,'Tes@tes.co','seeng','Sedeng'),(16,'Tes@tes.co','seeng','Sedeng'),(17,'Tes@tes.co','seeng','Sedeng'),(18,'Tes@tes.co','seeng','Sedeng'),(19,'Tes@tes.co','seeng','Sedeng'),(20,'Tes@tes.co','seeng','Sedeng'),(21,'Tes@tes.co','seeng','Sedeng'),(22,'Tes@tes.co','seeng','Sedeng'),(23,'Tes@tes.co','seeng','Sedeng'),(24,'Tes@tes.co','seeng','Sedeng'),(25,'Tes@tes.co','seeng','Sedeng'),(26,'Tes@tes.co','seeng','Sedeng'),(27,'Tes@tes.co','seeng','Sedeng'),(28,'Tes@tes.co','seeng','Sedeng'),(29,'Tes@tes.co','seeng','Sedeng'),(30,'Tes@tes.co','seeng','Sedeng'),(31,'Tes@tes.co','seeng','Sedeng'),(32,'Tes@tes.co','seeng','Sedeng'),(33,'Tes@tes.co','seeng','Sedeng'),(34,'Tes@tes.co','seeng','Sedeng'),(35,'Tes@tes.co','seeng','Sedeng'),(36,'Tes@tes.co','seeng','Sedeng'),(37,'Tes@tes.co','seeng','Sedeng'),(38,'Tes@tes.co','seeng','Sedeng'),(39,'Tes@tes.co','seeng','Sedeng'),(40,'Tes@tes.co','seeng','Sedeng'),(41,'Tes@tes.co','seeng','Sedeng'),(42,'Tes@tes.co','seeng','Sedeng'),(43,'Tes@tes.co','seeng','Sedeng'),(44,'Tes@tes.co','seeng','Sedeng'),(45,'Tes@tes.co','seeng','Sedeng'),(46,'Tes@tes.co','seeng','Sedeng'),(47,'Tes@tes.co','seeng','Sedeng'),(48,'Tes@tes.co','seeng','Sedeng'),(49,'Tes@tes.co','seeng','Sedeng'),(50,'Tes@tes.co','seeng','Sedeng'),(51,'Tes@tes.co','seeng','Sedeng');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-05  0:31:28
