-- MySQL dump 10.13  Distrib 5.6.28, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: ticketing_system
-- ------------------------------------------------------
-- Server version       5.6.28-0ubuntu0.15.10.1

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
-- Current Database: `ticketing_system`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ticketing_system` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `ticketing_system`;

--
-- Table structure for table `case_desc`
--

DROP TABLE IF EXISTS `case_desc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `case_desc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ticketId` int(11) NOT NULL,
  `description` longtext,
  `last_modified` datetime NOT NULL,
  `opened_by` varchar(256) DEFAULT NULL,
  `last_modified_by` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ticketId_UNIQUE` (`ticketId`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  CONSTRAINT `fk_casedesc_ticketId` FOREIGN KEY (`ticketId`) REFERENCES `user_ticket` (`ticketId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `case_desc`
--

LOCK TABLES `case_desc` WRITE;
"ticketsystem.sql" 331L, 13994C
LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (8,6,1,1,0,0,'ADMIN'),(10,7,2,0,1,0,'MODERATOR'),(11,8,3,0,0,1,'OBSERVER');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_ticket`
--

DROP TABLE IF EXISTS `user_ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_ticket` (
  `ticketId` int(11) NOT NULL AUTO_INCREMENT,
  `customerId` int(11) NOT NULL,
  `opened` datetime NOT NULL,
  `last_modified` datetime NOT NULL,
  `priority` varchar(45) DEFAULT NULL,
  `case_owner` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `is_open` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ticketId`),
  UNIQUE KEY `idtable1_UNIQUE` (`ticketId`),
  KEY `fk_customerinfo_customerID` (`customerId`),
  CONSTRAINT `fk_customerinfo_customerID` FOREIGN KEY (`customerId`) REFERENCES `customer_info` (`customerId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_ticket`
--

LOCK TABLES `user_ticket` WRITE;
/*!40000 ALTER TABLE `user_ticket` DISABLE KEYS */;
INSERT INTO `user_ticket` VALUES (1,1,'2016-04-27 08:49:59','2016-04-27 08:49:59','HIGH','RKAHIL','OPEN',1),(2,2,'2016-04-27 08:54:00','2016-04-27 08:54:00','MEDIUM','THOLMES','PENDING RESPONSE',1),(3,3,'2016-04-27 08:54:53','2016-04-27 08:54:53','LOW','THOLMES','CLOSED',0),(4,4,'2016-04-27 08:55:33','2016-04-27 08:55:33','HIGH','RKAHIL','ON HOLD',1),(6,1,'2016-04-27 10:32:31','2016-04-27 10:32:31','HIGH','RKAHIL','ESCALATED',1),(7,2,'2016-04-27 10:34:59','2016-04-27 10:34:59','HIGH','THOLMES','ESCALATED',0),(8,3,'2016-04-27 10:35:49','2016-04-27 10:35:49','HIGH','THOLMES','ESCALATED',1);
/*!40000 ALTER TABLE `user_ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-27 10:53:46