-- MariaDB dump 10.19  Distrib 10.5.12-MariaDB, for Linux (x86_64)
--
-- Host: mysql.hostinger.ro    Database: u574849695_20
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
-- Table structure for table `SONDEUR`
--

DROP TABLE IF EXISTS `SONDEUR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SONDEUR` (
  `ID_SONDEUR` int(11) NOT NULL AUTO_INCREMENT,
  `LOGIN` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MOT_DE_PASSE` char(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID_SONDEUR`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SONDEUR`
--

LOCK TABLES `SONDEUR` WRITE;
/*!40000 ALTER TABLE `SONDEUR` DISABLE KEYS */;
INSERT INTO `SONDEUR` VALUES (1,'breitenberg.janick','mollitia'),(2,'jack.murray','vero'),(3,'constantin.schmitt','eos'),(4,'ugerhold','eum'),(5,'estefania80','sint'),(6,'retha.marquardt','autem'),(7,'qmohr','nihil'),(8,'okuneva.darron','velit'),(9,'lucius.hagenes','commodi'),(10,'marcelino86','accusantium'),(11,'dallas08','ipsam'),(12,'theron.morar','dignissimos'),(13,'gconsidine','quod'),(14,'aglae.howell','fugiat'),(15,'halle83','ut'),(16,'ellis86','nisi'),(17,'minerva02','exercitationem'),(18,'alphonso.swift','ea'),(19,'mclaughlin.janice','hic'),(20,'friesen.jessy','est'),(21,'fstiedemann','possimus'),(22,'wilkinson.torrance','recusandae'),(23,'travis92','distinctio'),(24,'dickinson.avery','ut'),(25,'angie.raynor','voluptatibus'),(26,'hilpert.jay','sed'),(27,'lonie.gerlach','omnis'),(28,'hauck.carmel','sapiente'),(29,'howell.glenna','sed'),(30,'elsa88','voluptatem'),(31,'abbigail45','dolor'),(32,'ebony72','dicta'),(33,'leffler.cassidy','esse'),(34,'ekeebler','sed'),(35,'hleffler','quis'),(36,'zetta.daniel','et'),(37,'nitzsche.ava','cum'),(38,'rbreitenberg','eum'),(39,'mario20','ducimus'),(40,'bette54','omnis'),(41,'anais84','assumenda'),(42,'jerald34','non'),(43,'lavern20','aliquam'),(44,'sawayn.russ','ea'),(45,'deangelo.sipes','blanditiis'),(46,'bennie90','quam'),(47,'olson.shirley','ea'),(48,'nader.mallory','eligendi'),(49,'janice39','assumenda'),(50,'dickens.heloise','quis'),(51,'jpadberg','repellat'),(52,'ijohns','beatae'),(53,'raul25','sit'),(54,'hane.chelsea','dolores'),(55,'vsauer','deleniti'),(56,'ehammes','autem'),(57,'eritchie','et'),(58,'ida49','quidem'),(59,'mohr.felix','et'),(60,'beer.elmo','dolor'),(61,'kaleigh.howe','facere'),(62,'wiza.savanna','molestias'),(63,'ellie.turcotte','velit'),(64,'candice58','quaerat'),(65,'keeley.skiles','corporis'),(66,'rippin.carli','dignissimos'),(67,'hayley.thompson','ut'),(68,'kwest','neque'),(69,'lorena44','sunt'),(70,'israel.rempel','qui'),(71,'theresia.langosh','cupiditate'),(72,'pziemann','qui'),(73,'howell.deion','vel'),(74,'nakia.kunde','aliquam'),(75,'alford82','possimus'),(76,'ibeatty','corrupti'),(77,'tito96','recusandae'),(78,'adaline62','atque'),(79,'jettie.mertz','cumque'),(80,'dolores48','est'),(81,'joshua09','sed'),(82,'anabelle.kirlin','hic'),(83,'jwiza','sint'),(84,'roberto51','autem'),(85,'fkuhn','mollitia'),(86,'june.daugherty','culpa'),(87,'henriette52','voluptatem'),(88,'devon17','consequatur'),(89,'collins.cathryn','expedita'),(90,'rodriguez.janet','laudantium'),(91,'wilburn.leffler','sed'),(92,'purdy.damien','velit'),(93,'labadie.alyson','sapiente'),(94,'damian63','eius'),(95,'mharber','quis'),(96,'alverta.bernier','voluptatibus'),(97,'tyrique.brakus','recusandae'),(98,'qsmith','nihil'),(99,'rogahn.demond','architecto'),(100,'gutkowski.karine','rerum');
/*!40000 ALTER TABLE `SONDEUR` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-04 12:31:56
