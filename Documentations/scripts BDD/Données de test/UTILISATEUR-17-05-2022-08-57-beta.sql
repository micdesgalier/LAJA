-- MariaDB dump 10.19  Distrib 10.5.12-MariaDB, for Linux (x86_64)
--
-- Host: mysql.hostinger.ro    Database: u574849695_22
-- ------------------------------------------------------
-- Server version	10.5.12-MariaDB-cll-lve

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `UTILISATEUR`
--

DROP TABLE IF EXISTS `UTILISATEUR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UTILISATEUR` (
  `ID_UTILISATEUR` int(11) NOT NULL AUTO_INCREMENT,
  `LOGIN` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MOT_DE_PASSE` char(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TYPE` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID_UTILISATEUR`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UTILISATEUR`
--

LOCK TABLES `UTILISATEUR` WRITE;
/*!40000 ALTER TABLE `UTILISATEUR` DISABLE KEYS */;
INSERT INTO `UTILISATEUR` VALUES (1,'marilou27','quis',0),(2,'korbin.larkin','quam',1),(3,'dina.dubuque','nesciunt',1),(4,'brandi84','vel',1),(5,'ottis.bruen','voluptatem',0),(6,'hilpert.natasha','recusandae',0),(7,'marley.kohler','sint',0),(8,'o\'connell.tony','quia',0),(9,'madisen08','hic',1),(10,'domingo.hirthe','beatae',1),(11,'salma46','dolores',1),(12,'chyna.brekke','et',1),(13,'becker.stanford','tenetur',0),(14,'torphy.alexandro','dignissimos',0),(15,'trantow.berta','est',0),(16,'kody.braun','odio',0),(17,'jackeline32','ut',1),(18,'michelle.rohan','blanditiis',1),(19,'pouros.maeve','in',1),(20,'lwest','maxime',0),(21,'lexi61','sit',0),(22,'jerde.arjun','aliquid',1),(23,'gottlieb.asia','excepturi',0),(24,'thurman74','officia',1),(25,'eden.goldner','tempora',0),(26,'angela32','quibusdam',0),(27,'verda72','numquam',0),(28,'icollins','cum',1),(29,'eroob','temporibus',1),(30,'mueller.hailie','facere',0),(31,'dessie06','impedit',1),(32,'smccullough','dignissimos',1),(33,'pdaugherty','similique',0),(34,'mills.tressie','mollitia',0),(35,'johnnie.turner','qui',1),(36,'dudley.heathcote','alias',0),(37,'rfisher','iste',0),(38,'sister.medhurst','officiis',1),(39,'jody.rath','corporis',0),(40,'ullrich.jada','quos',1),(41,'vincenzo59','quidem',1),(42,'scot.o\'conner','pariatur',0),(43,'darrin57','qui',0),(44,'concepcion28','quos',0),(45,'qmohr','aliquam',1),(46,'bridgette.corkery','facilis',1),(47,'destini.graham','voluptate',1),(48,'mills.lydia','sapiente',1),(49,'monahan.annabel','alias',1),(50,'sblock','mollitia',1),(51,'cecile60','dicta',0),(52,'perdman','aut',0),(53,'holden18','voluptatem',0),(54,'obernhard','illo',0),(55,'oliver60','odio',0),(56,'fmuller','autem',1),(57,'kuphal.rosamond','nemo',1),(58,'ebechtelar','consectetur',0),(59,'madelyn.wilkinson','eos',0),(60,'willms.madie','similique',1),(61,'eveline73','qui',1),(62,'ethan.farrell','illum',1),(63,'aweimann','vel',0),(64,'weber.dagmar','quia',1),(65,'lindgren.louie','officia',0),(66,'breanne07','dolor',0),(67,'dietrich.guillermo','expedita',0),(68,'kris.warren','dolor',0),(69,'aurelie37','deleniti',0),(70,'jedidiah.towne','officia',1),(71,'herminia62','cumque',0),(72,'okohler','et',1),(73,'ppowlowski','et',1),(74,'lillie.rosenbaum','sint',1),(75,'gerson.stokes','voluptate',1),(76,'connelly.jodie','quia',0),(77,'melvina45','est',0),(78,'pfannerstill.angelita','et',0),(79,'chelsea68','autem',1),(80,'hoppe.rhoda','voluptatibus',0),(81,'vella.zemlak','ut',1),(82,'feeney.vesta','provident',0),(83,'rledner','mollitia',0),(84,'ukutch','doloremque',0),(85,'waters.collin','maiores',1),(86,'victor.trantow','voluptatem',1),(87,'xheathcote','perspiciatis',1),(88,'jermain.pagac','aut',1),(89,'frederic89','optio',0),(90,'twila.carroll','et',0),(91,'lamont47','aut',1),(92,'randy46','earum',0),(93,'axel.dibbert','quasi',0),(94,'owilliamson','harum',1),(95,'ilehner','porro',0),(96,'ujacobi','eos',1),(97,'margret.kshlerin','et',1),(98,'ozella.lockman','et',1),(99,'vleffler','vero',1),(100,'cleffler','hic',1);
/*!40000 ALTER TABLE `UTILISATEUR` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-17  8:57:34
