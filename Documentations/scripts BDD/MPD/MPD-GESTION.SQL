DROP DATABASE IF EXISTS LAJA_GESTION;

CREATE DATABASE IF NOT EXISTS LAJA_GESTION;
USE LAJA_GESTION;
# -----------------------------------------------------------------------------
#       TABLE : UTILISATEUR
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS UTILISATEUR
 (
   ID_UTILISATEUR INTEGER NOT NULL AUTO_INCREMENT ,
   LOGIN VARCHAR(128) NOT NULL  ,
   MOT_DE_PASSE CHAR(255) NOT NULL  ,
   TYPE BOOL NOT NULL  
   , PRIMARY KEY (ID_UTILISATEUR) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : CODE
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS CODE
 (
   ID_CODE INTEGER NOT NULL AUTO_INCREMENT ,
   ID_SONDAGE INTEGER NOT NULL  ,
   ID_UTILISATEUR INTEGER NOT NULL  ,
   CODE CHAR(255) NOT NULL  
   , PRIMARY KEY (ID_CODE) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE CODE
# -----------------------------------------------------------------------------


CREATE  INDEX I_FK_CODE_SONDAGE
     ON CODE (ID_SONDAGE ASC);

CREATE  INDEX I_FK_CODE_UTILISATEUR
     ON CODE (ID_UTILISATEUR ASC);

# -----------------------------------------------------------------------------
#       TABLE : QUESTION
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS QUESTION
 (
   ID_QUESTION INTEGER NOT NULL AUTO_INCREMENT ,
   ID_SONDAGE INTEGER NOT NULL  ,
   QUESTION VARCHAR(128) NOT NULL  
   , PRIMARY KEY (ID_QUESTION) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE QUESTION
# -----------------------------------------------------------------------------


CREATE  INDEX I_FK_QUESTION_SONDAGE
     ON QUESTION (ID_SONDAGE ASC);

# -----------------------------------------------------------------------------
#       TABLE : CHOIX
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS CHOIX
 (
   ID_CHOIX INTEGER NOT NULL AUTO_INCREMENT ,
   ID_QUESTION INTEGER NOT NULL  ,
   CHOIX VARCHAR(100) NOT NULL  ,
   NB_CHOISI INTEGER NOT NULL  
      DEFAULT 0
   , PRIMARY KEY (ID_CHOIX) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE CHOIX
# -----------------------------------------------------------------------------


CREATE  INDEX I_FK_CHOIX_QUESTION
     ON CHOIX (ID_QUESTION ASC);

# -----------------------------------------------------------------------------
#       TABLE : SONDAGE
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS SONDAGE
 (
   ID_SONDAGE INTEGER NOT NULL AUTO_INCREMENT ,
   ID_UTILISATEUR INTEGER NOT NULL  ,
   SUJET VARCHAR(100) NOT NULL  ,
   OUVERT BOOL NOT NULL  ,
   BLOQUE BOOL NOT NULL  
   , PRIMARY KEY (ID_SONDAGE) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE SONDAGE
# -----------------------------------------------------------------------------


CREATE  INDEX I_FK_SONDAGE_UTILISATEUR
     ON SONDAGE (ID_UTILISATEUR ASC);

# -----------------------------------------------------------------------------
#       TABLE : G�NERER
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS G�NERER
 (
   ID_SONDAGE INTEGER NOT NULL  ,
   ID_CODE INTEGER NOT NULL  
   , PRIMARY KEY (ID_SONDAGE,ID_CODE) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE G�NERER
# -----------------------------------------------------------------------------


CREATE  INDEX I_FK_G�NERER_SONDAGE
     ON G�NERER (ID_SONDAGE ASC);

CREATE  INDEX I_FK_G�NERER_CODE
     ON G�NERER (ID_CODE ASC);


# -----------------------------------------------------------------------------
#       CREATION DES REFERENCES DE TABLE
# -----------------------------------------------------------------------------


ALTER TABLE CODE 
  ADD FOREIGN KEY FK_CODE_SONDAGE (ID_SONDAGE)
      REFERENCES SONDAGE (ID_SONDAGE) ;


ALTER TABLE CODE 
  ADD FOREIGN KEY FK_CODE_UTILISATEUR (ID_UTILISATEUR)
      REFERENCES UTILISATEUR (ID_UTILISATEUR) ;


ALTER TABLE QUESTION 
  ADD FOREIGN KEY FK_QUESTION_SONDAGE (ID_SONDAGE)
      REFERENCES SONDAGE (ID_SONDAGE) ;


ALTER TABLE CHOIX 
  ADD FOREIGN KEY FK_CHOIX_QUESTION (ID_QUESTION)
      REFERENCES QUESTION (ID_QUESTION) ;


ALTER TABLE SONDAGE 
  ADD FOREIGN KEY FK_SONDAGE_UTILISATEUR (ID_UTILISATEUR)
      REFERENCES UTILISATEUR (ID_UTILISATEUR) ;


ALTER TABLE G�NERER 
  ADD FOREIGN KEY FK_G�NERER_SONDAGE (ID_SONDAGE)
      REFERENCES SONDAGE (ID_SONDAGE) ;


ALTER TABLE G�NERER 
  ADD FOREIGN KEY FK_G�NERER_CODE (ID_CODE)
      REFERENCES CODE (ID_CODE) ;

USE laja_gestion;
/* Questions */
INSERT INTO `QUESTION` VALUES (1,12,'Quia omnis autem expedita laboriosam illo libero sunt.'),(2,17,'Amet facilis rem sunt vitae nemo explicabo.'),(3,7,'Esse et est sit quae qui.'),(4,1,'Nesciunt labore est saepe et.'),(5,17,'Similique eius quo consequatur esse voluptate ea earum.'),(6,7,'Et soluta nihil aut distinctio aut modi.'),(7,15,'Voluptatum ut eveniet reprehenderit atque voluptate.'),(8,20,'Illo velit ipsam et exercitationem.'),(9,10,'Earum dicta asperiores iure cum commodi velit fugiat.'),(10,12,'Earum magni quos dolorem.'),(11,7,'Quos autem voluptas est excepturi velit.'),(12,13,'Iusto recusandae et at fugit dicta.'),(13,19,'Velit nihil error iure.'),(14,11,'Eos dolore reiciendis facilis.'),(15,17,'Et ex dicta nihil facilis et qui qui quisquam.'),(16,16,'Ipsum perspiciatis laudantium nostrum veritatis.'),(17,15,'Maiores labore sit impedit est et ad.'),(18,11,'Consequatur accusamus id doloribus non in ex.'),(19,12,'Vitae accusamus velit nulla pariatur vero similique.'),(20,9,'Rerum cupiditate vel soluta fugit.'),(21,8,'Quia qui id sunt quas sequi.'),(22,15,'Cum facere distinctio non a amet illum enim.'),(23,1,'Et voluptates eum qui similique corporis saepe perspiciatis.'),(24,20,'Perspiciatis nesciunt temporibus explicabo modi asperiores vel.'),(25,11,'Iusto aut sed officiis dolorum quis.'),(26,19,'Repellat ut qui expedita fugiat.'),(27,18,'Eos fugiat ut sint modi.'),(28,3,'Modi inventore debitis hic consequatur deleniti dolor impedit.'),(29,2,'Beatae voluptatem corporis distinctio.'),(30,18,'Molestias quaerat ad consequatur aut.'),(31,20,'Libero quas eum ut illo in.'),(32,20,'Blanditiis voluptatem reiciendis sunt neque.'),(33,3,'Pariatur qui quod unde.'),(34,19,'Voluptate nulla enim quasi accusamus voluptatibus.'),(35,19,'Ullam dolor ut provident tempore ratione iste inventore cumque.'),(36,2,'Velit et iusto recusandae quod.'),(37,18,'Et est porro numquam blanditiis.'),(38,18,'Minima consequatur iure voluptatem laborum earum sit tempora doloribus.'),(39,20,'Vero velit vero ipsa occaecati eos laudantium.'),(40,5,'Et voluptatem voluptatum iste quis explicabo consequatur iusto facere.'),(41,10,'Quia doloribus qui eaque necessitatibus laborum fuga iste facilis.'),(42,19,'Omnis et dolorum voluptatibus eum non aut ex.'),(43,9,'Eum nam qui earum nam fugit illo.'),(44,9,'Dolores voluptas excepturi sit voluptatem quis.'),(45,9,'Quaerat et repudiandae qui ullam rem.'),(46,14,'Expedita rerum explicabo inventore molestiae est suscipit dolorem.'),(47,7,'Et tempora omnis amet vero cupiditate sunt deserunt.'),(48,1,'Maiores maxime et id ut et.'),(49,19,'Nam numquam est magni in ipsam deleniti exercitationem.'),(50,6,'Impedit tempore nam eius quo qui.'),(51,6,'Voluptas nihil et quia eius error ea cupiditate.'),(52,11,'Voluptatem repellendus quis sint dicta blanditiis.'),(53,18,'Dolor esse cupiditate deleniti dolores.'),(54,1,'Totam expedita omnis nostrum est.'),(55,12,'Dolores cumque unde deserunt esse et.'),(56,16,'Quia autem illum repellat aut hic.'),(57,12,'Exercitationem veritatis omnis et beatae voluptatem dolores libero.'),(58,8,'Ea sed beatae debitis laboriosam.'),(59,1,'Optio autem et fuga corporis nostrum qui et.'),(60,7,'Repellat sed beatae est cumque quos voluptatibus eveniet.'),(61,3,'Est voluptatem aut rerum aut quasi a.'),(62,11,'Iste autem sequi temporibus placeat.'),(63,15,'Maxime adipisci quo atque qui cumque.'),(64,8,'Quo repudiandae rem consequuntur iste molestias a officia.'),(65,17,'Praesentium reiciendis tenetur repellendus libero.'),(66,13,'Velit sunt iure esse.'),(67,11,'Sed fugiat quibusdam illo maiores nesciunt expedita dolores.'),(68,8,'Occaecati ex et accusantium molestiae in sed repellat exercitationem.'),(69,4,'Dignissimos id nesciunt non magnam nam.'),(70,19,'Quibusdam odit officiis quia autem et.'),(71,12,'Est tenetur autem nobis quasi nesciunt neque repellat et.'),(72,17,'Quasi animi vel adipisci accusamus aperiam ut.'),(73,14,'Pariatur repellat sapiente nihil culpa.'),(74,10,'Dolor animi maxime nostrum in itaque voluptatem aut.'),(75,10,'Est nihil est ipsa ut est et consequuntur aut.'),(76,3,'Labore nisi temporibus mollitia mollitia aut vero at.'),(77,2,'Sequi ut nobis omnis.'),(78,8,'Quod ut quasi incidunt quisquam laudantium.'),(79,5,'Quia reiciendis maxime fuga distinctio in nobis.'),(80,20,'In labore nihil incidunt aspernatur nemo dolores.'),(81,17,'Commodi nostrum quo explicabo autem non.'),(82,12,'Aut sint in explicabo consequatur numquam.'),(83,17,'Veritatis debitis enim veniam aliquid sit vitae.'),(84,2,'Odio molestiae excepturi molestiae fuga.'),(85,18,'Pariatur aut repellendus ad laudantium excepturi totam in.'),(86,10,'Ipsum odit ex expedita qui ipsum in aperiam.'),(87,11,'Odio ut reiciendis quam culpa est fugit explicabo explicabo.'),(88,14,'Nisi consequatur enim voluptatem minima nihil.'),(89,19,'Dolores in expedita aut saepe ut quis culpa dolorem.'),(90,5,'Deserunt sunt culpa est et.'),(91,16,'Est sint dicta veritatis velit quia quia labore.'),(92,4,'Ratione omnis sapiente eum voluptatem veniam alias quos.'),(93,16,'Natus necessitatibus voluptas quidem omnis voluptas occaecati soluta.'),(94,15,'Quae omnis voluptate accusamus alias accusamus laborum.'),(95,17,'Et nulla optio vitae architecto aliquam quisquam.'),(96,16,'Ipsa quasi incidunt labore non aliquid harum qui.'),(97,7,'Nihil repudiandae qui ea reiciendis cum rerum.'),(98,1,'Sint sequi qui consequatur laborum maiores.'),(99,13,'Ut porro consequuntur perspiciatis ea dolorem.'),(100,5,'Reiciendis et ipsum rerum recusandae nemo quaerat deserunt.');
/* Choix */
INSERT INTO `CHOIX` VALUES (1,77,'voluptates',0),(2,77,'dolor',0),(3,58,'modi',0),(4,47,'in',0),(5,46,'neque',0),(6,86,'enim',0),(7,81,'perspiciatis',0),(8,87,'amet',0),(9,79,'delectus',0),(10,44,'dolorum',0),(11,20,'facere',0),(12,47,'veniam',0),(13,16,'dolor',0),(14,64,'nihil',0),(15,37,'veniam',0),(16,26,'consequuntur',0),(17,37,'laudantium',0),(18,28,'eligendi',0),(19,19,'nihil',0),(20,86,'optio',0),(21,82,'molestiae',0),(22,93,'veritatis',0),(23,75,'architecto',0),(24,73,'omnis',0),(25,77,'facilis',0),(26,68,'vitae',0),(27,87,'odio',0),(28,85,'qui',0),(29,66,'praesentium',0),(30,43,'in',0),(31,58,'qui',0),(32,94,'nesciunt',0),(33,66,'doloremque',0),(34,73,'non',0),(35,28,'dolore',0),(36,25,'consequuntur',0),(37,44,'voluptas',0),(38,5,'reprehenderit',0),(39,78,'natus',0),(40,29,'ullam',0),(41,61,'voluptas',0),(42,11,'nemo',0),(43,6,'commodi',0),(44,51,'dolor',0),(45,57,'quibusdam',0),(46,1,'assumenda',0),(47,88,'qui',0),(48,57,'nam',0),(49,14,'inventore',0),(50,22,'voluptates',0);
/* Sondage */
INSERT INTO `SONDAGE` VALUES (1,1,'quidem',0,0),(2,1,'voluptatem',1,1),(3,92,'sed',0,0),(4,7,'accusantium',1,0),(5,11,'expedita',1,1),(6,19,'omnis',1,0),(7,60,'facere',1,1),(8,72,'rerum',0,0),(9,69,'quidem',0,1),(10,90,'ratione',1,0),(11,73,'ducimus',1,0),(12,6,'nostrum',0,0),(13,89,'tempore',0,1),(14,96,'reiciendis',0,0),(15,59,'recusandae',0,0),(16,68,'aut',1,1),(17,52,'dolores',0,0),(18,86,'nulla',0,0),(19,39,'et',0,0),(20,41,'ipsa',0,0);
/* Utilisateur */
INSERT INTO `UTILISATEUR` VALUES (1,'marilou27','quiso',0),(2,'korbin.larkin','quam',1),(3,'dina.dubuque','nesciunt',1),(4,'brandi84','vel',1),(5,'ottis.bruen','voluptatem',0),(6,'hilpert.natasha','recusandae',0),(7,'marley.kohler','sint',0),(8,'o\'connell.tony','quia',0),(9,'madisen08','hic',1),(10,'domingo.hirthe','beatae',1),(11,'salma46','dolores',1),(12,'chyna.brekke','et',1),(13,'becker.stanford','tenetur',0),(14,'torphy.alexandro','dignissimos',0),(15,'trantow.berta','est',0),(16,'kody.braun','odio',0),(17,'jackeline32','ut',1),(18,'michelle.rohan','blanditiis',1),(19,'pouros.maeve','in',1),(20,'lwest','maxime',0),(21,'lexi61','sit',0),(22,'jerde.arjun','aliquid',1),(23,'gottlieb.asia','excepturi',0),(24,'thurman74','officia',1),(25,'eden.goldner','tempora',0),(26,'angela32','quibusdam',0),(27,'verda72','numquam',0),(28,'icollins','cum',1),(29,'eroob','temporibus',1),(30,'mueller.hailie','facere',0),(31,'dessie06','impedit',1),(32,'smccullough','dignissimos',1),(33,'pdaugherty','similique',0),(34,'mills.tressie','mollitia',0),(35,'johnnie.turner','qui',1),(36,'dudley.heathcote','alias',0),(37,'rfisher','iste',0),(38,'sister.medhurst','officiis',1),(39,'jody.rath','corporis',0),(40,'ullrich.jada','quos',1),(41,'vincenzo59','quidem',1),(42,'scot.o\'conner','pariatur',0),(43,'darrin57','qui',0),(44,'concepcion28','quos',0),(45,'qmohr','aliquam',1),(46,'bridgette.corkery','facilis',1),(47,'destini.graham','voluptate',1),(48,'mills.lydia','sapiente',1),(49,'monahan.annabel','alias',1),(50,'sblock','mollitia',1),(51,'cecile60','dicta',0),(52,'perdman','aut',0),(53,'holden18','voluptatem',0),(54,'obernhard','illo',0),(55,'oliver60','odio',0),(56,'fmuller','autem',1),(57,'kuphal.rosamond','nemo',1),(58,'ebechtelar','consectetur',0),(59,'madelyn.wilkinson','eos',0),(60,'willms.madie','similique',1),(61,'eveline73','qui',1),(62,'ethan.farrell','illum',1),(63,'aweimann','vel',0),(64,'weber.dagmar','quia',1),(65,'lindgren.louie','officia',0),(66,'breanne07','dolor',0),(67,'dietrich.guillermo','expedita',0),(68,'kris.warren','dolor',0),(69,'aurelie37','deleniti',0),(70,'jedidiah.towne','officia',1),(71,'herminia62','cumque',0),(72,'okohler','et',1),(73,'ppowlowski','et',1),(74,'lillie.rosenbaum','sint',1),(75,'gerson.stokes','voluptate',1),(76,'connelly.jodie','quia',0),(77,'melvina45','est',0),(78,'pfannerstill.angelita','et',0),(79,'chelsea68','autem',1),(80,'hoppe.rhoda','voluptatibus',0),(81,'vella.zemlak','ut',1),(82,'feeney.vesta','provident',0),(83,'rledner','mollitia',0),(84,'ukutch','doloremque',0),(85,'waters.collin','maiores',1),(86,'victor.trantow','voluptatem',1),(87,'xheathcote','perspiciatis',1),(88,'jermain.pagac','aut',1),(89,'frederic89','optio',0),(90,'twila.carroll','et',0),(91,'lamont47','aut',1),(92,'randy46','earum',0),(93,'axel.dibbert','quasi',0),(94,'owilliamson','harum',1),(95,'ilehner','porro',0),(96,'ujacobi','eos',1),(97,'margret.kshlerin','et',1),(98,'ozella.lockman','et',1),(99,'vleffler','vero',1),(100,'cleffler','hic',1);

INSERT INTO `CODE` VALUES (1, 1, 1, "aaaaaa"), (2, 2, 1, "bbbbbb"), (3, 3, 1, "cccccc"), (4, 4, 1, "dddddd");