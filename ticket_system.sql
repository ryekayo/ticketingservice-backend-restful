-- MySQL dump 10.13  Distrib 5.6.28, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: ticketing_system
-- ------------------------------------------------------
-- Server version	5.6.28-0ubuntu0.15.10.1

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
/*!40000 ALTER TABLE `case_desc` DISABLE KEYS */;
INSERT INTO `case_desc` VALUES (1,1,'TESTING1','2016-04-27 08:57:13','RKAHIL','RKAHIL'),(2,2,'TESTING2','2016-04-27 09:15:40','THOLMES','RKAHIL'),(3,3,'TESTING3','2016-04-27 09:15:57','THOLMES','THOLMES'),(4,4,'TESTING4','2016-04-27 09:16:08','RKAHIL','THOLMES');
/*!40000 ALTER TABLE `case_desc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_info`
--

DROP TABLE IF EXISTS `customer_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_info` (
  `customerId` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(256) DEFAULT NULL,
  `customer_email` varchar(256) DEFAULT NULL,
  `customer_phone` varchar(256) DEFAULT NULL,
  `company_name` varchar(256) DEFAULT NULL,
  `priority` varchar(256) DEFAULT NULL,
  `escalated` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`customerId`),
  UNIQUE KEY `id_UNIQUE` (`customerId`),
  UNIQUE KEY `company_name_UNIQUE` (`company_name`),
  UNIQUE KEY `customer_phone_UNIQUE` (`customer_phone`),
  UNIQUE KEY `customer_email_UNIQUE` (`customer_email`),
  UNIQUE KEY `customer_name_UNIQUE` (`customer_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_info`
--

LOCK TABLES `customer_info` WRITE;
/*!40000 ALTER TABLE `customer_info` DISABLE KEYS */;
INSERT INTO `customer_info` VALUES (1,'Michael Jordan','mjordan@bulls.com','111-111-1111','Chicago Bulls','HIGH',0),(2,'Larry Bird','lbird@celtics.com','222-222-2222','Boston Celtics','MEDIUM',1),(3,'Kobe Bryant','lbird@lakers.com','333-333-3333','LA Lakers','LOW',0),(4,'Tom Brady','tbrady@patriots.com','444-444-4444','NE Patriots','HIGH',1);
/*!40000 ALTER TABLE `customer_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email_history`
--

DROP TABLE IF EXISTS `email_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email_history` (
  `email_historyid` int(11) NOT NULL AUTO_INCREMENT,
  `ticketId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `email_timestamp` datetime DEFAULT NULL,
  `email_sent` longtext,
  `from_email` varchar(45) DEFAULT NULL,
  `to_email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`email_historyid`),
  UNIQUE KEY `ticketId_UNIQUE` (`ticketId`),
  UNIQUE KEY `id_UNIQUE` (`email_historyid`),
  UNIQUE KEY `userId_UNIQUE` (`userId`),
  CONSTRAINT `fk_emailhistory_ticketId` FOREIGN KEY (`ticketId`) REFERENCES `user_ticket` (`ticketId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_emailhistory_userId` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email_history`
--

LOCK TABLES `email_history` WRITE;
/*!40000 ALTER TABLE `email_history` DISABLE KEYS */;
INSERT INTO `email_history` VALUES (2,1,1,'2016-04-27 09:19:41','THISISATEST','rkahil@test.com','mjordan@bulls.com'),(3,2,2,'2016-04-27 09:22:07','THISISATEST2','drivers@test.com','lbird@celtics.com');
/*!40000 ALTER TABLE `email_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `escalation_status`
--

DROP TABLE IF EXISTS `escalation_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `escalation_status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ticketId` int(11) NOT NULL,
  `is_escalated` tinyint(1) NOT NULL DEFAULT '0',
  `date_escalated` datetime DEFAULT NULL,
  `assigned_to` varchar(256) NOT NULL,
  `notes` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ticketId_UNIQUE` (`ticketId`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  CONSTRAINT `fk_escalationstatus_ticketId` FOREIGN KEY (`ticketId`) REFERENCES `user_ticket` (`ticketId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `escalation_status`
--

LOCK TABLES `escalation_status` WRITE;
/*!40000 ALTER TABLE `escalation_status` DISABLE KEYS */;
INSERT INTO `escalation_status` VALUES (1,6,1,'2016-04-27 10:34:13','RKAHIL','TEST1'),(2,2,1,'2016-04-27 10:35:17','THOLMES','TEST2'),(3,3,1,'2016-04-27 10:36:00','THOLMES','TEST3');
/*!40000 ALTER TABLE `escalation_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL AUTO_INCREMENT,
  `admin_access` tinyint(1) NOT NULL DEFAULT '0',
  `moderator_access` tinyint(1) NOT NULL DEFAULT '0',
  `observer_access` tinyint(1) NOT NULL DEFAULT '0',
  `rolename` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`roleId`),
  KEY `fk_userroles_roleId_idx` (`roleId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (6,1,0,0,'ADMIN'),(7,0,1,0,'MODERATOR'),(8,0,0,1,'OBSERVER');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket_history`
--

DROP TABLE IF EXISTS `ticket_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket_history` (
  `tickethistory_id` int(11) NOT NULL AUTO_INCREMENT,
  `ticketId` int(11) NOT NULL,
  `case_owner` varchar(45) NOT NULL,
  `date_opened` datetime DEFAULT NULL,
  `last_modified` datetime DEFAULT NULL,
  `lastmod_by` varchar(45) NOT NULL,
  `status_change` varchar(45) DEFAULT NULL,
  `is_closed` tinyint(1) NOT NULL DEFAULT '0',
  `email_timestamp` datetime DEFAULT NULL,
  `date_closed` datetime DEFAULT NULL,
  `is_escalated` tinyint(1) NOT NULL DEFAULT '0',
  `date_escalated` datetime DEFAULT NULL,
  PRIMARY KEY (`tickethistory_id`),
  UNIQUE KEY `id_UNIQUE` (`tickethistory_id`),
  KEY `fk_tickethistory_ticketnumber` (`ticketId`),
  CONSTRAINT `fk_tickethistory_ticketnumber` FOREIGN KEY (`ticketId`) REFERENCES `user_ticket` (`ticketId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket_history`
--

LOCK TABLES `ticket_history` WRITE;
/*!40000 ALTER TABLE `ticket_history` DISABLE KEYS */;
INSERT INTO `ticket_history` VALUES (1,1,'RKAHIL','2016-04-27 10:46:00','2016-04-27 10:46:00','RKAHIL','OPEN',0,'2016-04-27 10:46:00','2016-04-27 10:46:00',0,'2016-04-27 10:46:00'),(4,1,'RKAHIL','2016-04-27 10:51:55','2016-04-27 10:51:55','RKAHIL','PENDING',0,'2016-04-27 10:51:55','2016-04-27 10:51:55',0,'2016-04-27 10:51:55'),(5,2,'THOLMES','2016-04-27 10:52:57','2016-04-27 10:52:57','THOLMES','CLOSED',0,'2016-04-27 10:52:57','2016-04-27 10:52:57',0,'2016-04-27 10:52:57'),(6,3,'THOLMES','2016-04-27 10:53:21','2016-04-27 10:53:21','RKAHIL','CLOSED',0,'2016-04-27 10:53:21','2016-04-27 10:53:21',0,'2016-04-27 10:53:21');
/*!40000 ALTER TABLE `ticket_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `title` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `id_UNIQUE` (`userId`),
  UNIQUE KEY `admin_username_UNIQUE` (`username`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `phone_number_UNIQUE` (`phone_number`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'rkahil','RYAN KAHIL','rkahil@test.com','VP','555-555-5555'),(2,'tholmes','TOM HOLMES','tholmes@test.com','VP','666-666-6666'),(3,'drivers','DOC RIVERS','drivers@test.com','TEST','777-777-7777');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userId_UNIQUE` (`userId`,`roleId`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `fk_userroles_roleId` (`roleId`),
  CONSTRAINT `fk_userroles_roleId` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_userroles_userId` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (8,6,1),(14,7,1),(15,8,1),(10,7,2),(11,8,3);
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

-- Dump completed on 2016-04-28 10:36:39
