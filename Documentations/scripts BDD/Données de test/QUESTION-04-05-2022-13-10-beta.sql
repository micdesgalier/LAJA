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
-- Table structure for table `QUESTION`
--

DROP TABLE IF EXISTS `QUESTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `QUESTION` (
  `ID_QUESTION` int(11) NOT NULL AUTO_INCREMENT,
  `ID_SONDAGE` int(11) NOT NULL,
  `QUESTION` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`ID_QUESTION`),
  KEY `I_FK_QUESTION_SONDAGE` (`ID_SONDAGE`),
  CONSTRAINT `FK_QUESTION_SONDAGE` FOREIGN KEY (`ID_SONDAGE`) REFERENCES `SONDAGE` (`ID_SONDAGE`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `QUESTION`
--

LOCK TABLES `QUESTION` WRITE;
/*!40000 ALTER TABLE `QUESTION` DISABLE KEYS */;
INSERT INTO `QUESTION` VALUES (1,12,'Quia omnis autem expedita laboriosam illo libero sunt.'),(2,17,'Amet facilis rem sunt vitae nemo explicabo.'),(3,7,'Esse et est sit quae qui.'),(4,1,'Nesciunt labore est saepe et.'),(5,17,'Similique eius quo consequatur esse voluptate ea earum.'),(6,7,'Et soluta nihil aut distinctio aut modi.'),(7,15,'Voluptatum ut eveniet reprehenderit atque voluptate.'),(8,20,'Illo velit ipsam et exercitationem.'),(9,10,'Earum dicta asperiores iure cum commodi velit fugiat.'),(10,12,'Earum magni quos dolorem.'),(11,7,'Quos autem voluptas est excepturi velit.'),(12,13,'Iusto recusandae et at fugit dicta.'),(13,19,'Velit nihil error iure.'),(14,11,'Eos dolore reiciendis facilis.'),(15,17,'Et ex dicta nihil facilis et qui qui quisquam.'),(16,16,'Ipsum perspiciatis laudantium nostrum veritatis.'),(17,15,'Maiores labore sit impedit est et ad.'),(18,11,'Consequatur accusamus id doloribus non in ex.'),(19,12,'Vitae accusamus velit nulla pariatur vero similique.'),(20,9,'Rerum cupiditate vel soluta fugit.'),(21,8,'Quia qui id sunt quas sequi.'),(22,15,'Cum facere distinctio non a amet illum enim.'),(23,1,'Et voluptates eum qui similique corporis saepe perspiciatis.'),(24,20,'Perspiciatis nesciunt temporibus explicabo modi asperiores vel.'),(25,11,'Iusto aut sed officiis dolorum quis.'),(26,19,'Repellat ut qui expedita fugiat.'),(27,18,'Eos fugiat ut sint modi.'),(28,3,'Modi inventore debitis hic consequatur deleniti dolor impedit.'),(29,2,'Beatae voluptatem corporis distinctio.'),(30,18,'Molestias quaerat ad consequatur aut.'),(31,20,'Libero quas eum ut illo in.'),(32,20,'Blanditiis voluptatem reiciendis sunt neque.'),(33,3,'Pariatur qui quod unde.'),(34,19,'Voluptate nulla enim quasi accusamus voluptatibus.'),(35,19,'Ullam dolor ut provident tempore ratione iste inventore cumque.'),(36,2,'Velit et iusto recusandae quod.'),(37,18,'Et est porro numquam blanditiis.'),(38,18,'Minima consequatur iure voluptatem laborum earum sit tempora doloribus.'),(39,20,'Vero velit vero ipsa occaecati eos laudantium.'),(40,5,'Et voluptatem voluptatum iste quis explicabo consequatur iusto facere.'),(41,10,'Quia doloribus qui eaque necessitatibus laborum fuga iste facilis.'),(42,19,'Omnis et dolorum voluptatibus eum non aut ex.'),(43,9,'Eum nam qui earum nam fugit illo.'),(44,9,'Dolores voluptas excepturi sit voluptatem quis.'),(45,9,'Quaerat et repudiandae qui ullam rem.'),(46,14,'Expedita rerum explicabo inventore molestiae est suscipit dolorem.'),(47,7,'Et tempora omnis amet vero cupiditate sunt deserunt.'),(48,1,'Maiores maxime et id ut et.'),(49,19,'Nam numquam est magni in ipsam deleniti exercitationem.'),(50,6,'Impedit tempore nam eius quo qui.'),(51,6,'Voluptas nihil et quia eius error ea cupiditate.'),(52,11,'Voluptatem repellendus quis sint dicta blanditiis.'),(53,18,'Dolor esse cupiditate deleniti dolores.'),(54,1,'Totam expedita omnis nostrum est.'),(55,12,'Dolores cumque unde deserunt esse et.'),(56,16,'Quia autem illum repellat aut hic.'),(57,12,'Exercitationem veritatis omnis et beatae voluptatem dolores libero.'),(58,8,'Ea sed beatae debitis laboriosam.'),(59,1,'Optio autem et fuga corporis nostrum qui et.'),(60,7,'Repellat sed beatae est cumque quos voluptatibus eveniet.'),(61,3,'Est voluptatem aut rerum aut quasi a.'),(62,11,'Iste autem sequi temporibus placeat.'),(63,15,'Maxime adipisci quo atque qui cumque.'),(64,8,'Quo repudiandae rem consequuntur iste molestias a officia.'),(65,17,'Praesentium reiciendis tenetur repellendus libero.'),(66,13,'Velit sunt iure esse.'),(67,11,'Sed fugiat quibusdam illo maiores nesciunt expedita dolores.'),(68,8,'Occaecati ex et accusantium molestiae in sed repellat exercitationem.'),(69,4,'Dignissimos id nesciunt non magnam nam.'),(70,19,'Quibusdam odit officiis quia autem et.'),(71,12,'Est tenetur autem nobis quasi nesciunt neque repellat et.'),(72,17,'Quasi animi vel adipisci accusamus aperiam ut.'),(73,14,'Pariatur repellat sapiente nihil culpa.'),(74,10,'Dolor animi maxime nostrum in itaque voluptatem aut.'),(75,10,'Est nihil est ipsa ut est et consequuntur aut.'),(76,3,'Labore nisi temporibus mollitia mollitia aut vero at.'),(77,2,'Sequi ut nobis omnis.'),(78,8,'Quod ut quasi incidunt quisquam laudantium.'),(79,5,'Quia reiciendis maxime fuga distinctio in nobis.'),(80,20,'In labore nihil incidunt aspernatur nemo dolores.'),(81,17,'Commodi nostrum quo explicabo autem non.'),(82,12,'Aut sint in explicabo consequatur numquam.'),(83,17,'Veritatis debitis enim veniam aliquid sit vitae.'),(84,2,'Odio molestiae excepturi molestiae fuga.'),(85,18,'Pariatur aut repellendus ad laudantium excepturi totam in.'),(86,10,'Ipsum odit ex expedita qui ipsum in aperiam.'),(87,11,'Odio ut reiciendis quam culpa est fugit explicabo explicabo.'),(88,14,'Nisi consequatur enim voluptatem minima nihil.'),(89,19,'Dolores in expedita aut saepe ut quis culpa dolorem.'),(90,5,'Deserunt sunt culpa est et.'),(91,16,'Est sint dicta veritatis velit quia quia labore.'),(92,4,'Ratione omnis sapiente eum voluptatem veniam alias quos.'),(93,16,'Natus necessitatibus voluptas quidem omnis voluptas occaecati soluta.'),(94,15,'Quae omnis voluptate accusamus alias accusamus laborum.'),(95,17,'Et nulla optio vitae architecto aliquam quisquam.'),(96,16,'Ipsa quasi incidunt labore non aliquid harum qui.'),(97,7,'Nihil repudiandae qui ea reiciendis cum rerum.'),(98,1,'Sint sequi qui consequatur laborum maiores.'),(99,13,'Ut porro consequuntur perspiciatis ea dolorem.'),(100,5,'Reiciendis et ipsum rerum recusandae nemo quaerat deserunt.');
/*!40000 ALTER TABLE `QUESTION` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-04 13:10:01
