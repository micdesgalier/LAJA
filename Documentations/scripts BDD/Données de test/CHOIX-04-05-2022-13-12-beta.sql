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
-- Table structure for table `CHOIX`
--

DROP TABLE IF EXISTS `CHOIX`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CHOIX` (
  `ID_CHOIX` int(11) NOT NULL AUTO_INCREMENT,
  `ID_QUESTION` int(11) NOT NULL,
  `CHOIX` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NB_CHOISI` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`ID_CHOIX`),
  KEY `I_FK_CHOIX_QUESTION` (`ID_QUESTION`),
  CONSTRAINT `FK_CHOIX_QUESTION` FOREIGN KEY (`ID_QUESTION`) REFERENCES `QUESTION` (`ID_QUESTION`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CHOIX`
--

LOCK TABLES `CHOIX` WRITE;
/*!40000 ALTER TABLE `CHOIX` DISABLE KEYS */;
INSERT INTO `CHOIX` VALUES (1,77,'voluptates',0),(2,77,'dolor',0),(3,58,'modi',0),(4,47,'in',0),(5,46,'neque',0),(6,86,'enim',0),(7,81,'perspiciatis',0),(8,87,'amet',0),(9,79,'delectus',0),(10,44,'dolorum',0),(11,20,'facere',0),(12,47,'veniam',0),(13,16,'dolor',0),(14,64,'nihil',0),(15,37,'veniam',0),(16,26,'consequuntur',0),(17,37,'laudantium',0),(18,28,'eligendi',0),(19,19,'nihil',0),(20,86,'optio',0),(21,82,'molestiae',0),(22,93,'veritatis',0),(23,75,'architecto',0),(24,73,'omnis',0),(25,77,'facilis',0),(26,68,'vitae',0),(27,87,'odio',0),(28,85,'qui',0),(29,66,'praesentium',0),(30,43,'in',0),(31,58,'qui',0),(32,94,'nesciunt',0),(33,66,'doloremque',0),(34,73,'non',0),(35,28,'dolore',0),(36,25,'consequuntur',0),(37,44,'voluptas',0),(38,5,'reprehenderit',0),(39,78,'natus',0),(40,29,'ullam',0),(41,61,'voluptas',0),(42,11,'nemo',0),(43,6,'commodi',0),(44,51,'dolor',0),(45,57,'quibusdam',0),(46,1,'assumenda',0),(47,88,'qui',0),(48,57,'nam',0),(49,14,'inventore',0),(50,22,'voluptates',0);
/*!40000 ALTER TABLE `CHOIX` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-04 13:12:05
