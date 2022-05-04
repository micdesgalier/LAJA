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
-- Table structure for table `SONDE`
--

DROP TABLE IF EXISTS `SONDE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SONDE` (
  `ID_SONDE` int(11) NOT NULL AUTO_INCREMENT,
  `LOGIN` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL,
  `MOT_DE_PASSE` char(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID_SONDE`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SONDE`
--

LOCK TABLES `SONDE` WRITE;
/*!40000 ALTER TABLE `SONDE` DISABLE KEYS */;
INSERT INTO `SONDE` VALUES (1,'toby.weber','omnis'),(2,'goyette.sterling','tempore'),(3,'graham.viva','modi'),(4,'aerdman','in'),(5,'dicki.conor','sunt'),(6,'ndeckow','corrupti'),(7,'ova84','consequatur'),(8,'thompson.kevon','delectus'),(9,'alexie34','ut'),(10,'nikolaus.lawrence','et'),(11,'myrna.kunze','consequatur'),(12,'constantin.johnson','cupiditate'),(13,'george41','deleniti'),(14,'dgutkowski','occaecati'),(15,'rkeeling','et'),(16,'nicklaus87','qui'),(17,'amuller','reprehenderit'),(18,'twila30','consequatur'),(19,'gibson.loraine','sunt'),(20,'iheidenreich','facere'),(21,'gerhold.reymundo','aut'),(22,'royal39','unde'),(23,'jglover','ratione'),(24,'summer.dubuque','et'),(25,'cjones','dolorem'),(26,'clebsack','cumque'),(27,'xschinner','consequuntur'),(28,'obeier','ex'),(29,'jaylin.hoeger','reprehenderit'),(30,'mazie31','maiores'),(31,'felix.gulgowski','omnis'),(32,'javon48','esse'),(33,'shaun51','in'),(34,'tyson.von','provident'),(35,'cole.isom','ipsa'),(36,'miller.noelia','qui'),(37,'kelsi.vonrueden','consequuntur'),(38,'zprohaska','alias'),(39,'adolf34','quos'),(40,'dejah.cassin','consequatur'),(41,'lucile64','modi'),(42,'wilkinson.tod','nulla'),(43,'stracke.kristina','laborum'),(44,'bwisoky','adipisci'),(45,'daphney07','omnis'),(46,'fausto67','nobis'),(47,'howell.frederik','accusantium'),(48,'chesley.dooley','iure'),(49,'penelope.becker','autem'),(50,'lacey40','dolores'),(51,'towne.meghan','cupiditate'),(52,'tkassulke','eaque'),(53,'cschamberger','aspernatur'),(54,'cristal47','vero'),(55,'pacocha.norene','praesentium'),(56,'cecelia37','voluptas'),(57,'zoberbrunner','nihil'),(58,'jena04','reiciendis'),(59,'uankunding','laboriosam'),(60,'d\'amore.elsie','maiores'),(61,'sedrick.littel','impedit'),(62,'wkohler','accusantium'),(63,'gleason.phyllis','et'),(64,'mattie.conn','ab'),(65,'bernier.leonora','laboriosam'),(66,'xlueilwitz','quam'),(67,'collin09','assumenda'),(68,'mcglynn.danyka','sit'),(69,'luisa39','excepturi'),(70,'antonina.runolfsson','odio'),(71,'savannah.baumbach','molestias'),(72,'tromp.chris','ut'),(73,'fay.freddie','nesciunt'),(74,'asha07','veniam'),(75,'swaniawski.domingo','et'),(76,'mdicki','sed'),(77,'brock.halvorson','esse'),(78,'rogahn.evalyn','cumque'),(79,'misty97','aut'),(80,'crystel92','eius'),(81,'manuel.olson','et'),(82,'champlin.adele','velit'),(83,'raymundo.hayes','perferendis'),(84,'kailee.carroll','quae'),(85,'helmer13','rerum'),(86,'toy.cecile','repellat'),(87,'donnelly.melvina','fugiat'),(88,'ereichert','accusantium'),(89,'grayson.hackett','vel'),(90,'cjerde','exercitationem'),(91,'merritt82','labore'),(92,'hildegard.yundt','iure'),(93,'keyon.rath','illo'),(94,'rkoss','quo'),(95,'maud79','magnam'),(96,'bernita.hilll','ipsum'),(97,'srogahn','provident'),(98,'fred84','numquam'),(99,'kiehn.marcelina','magni'),(100,'annamarie.fahey','tempore');
/*!40000 ALTER TABLE `SONDE` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-04 12:34:49
