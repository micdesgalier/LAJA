DROP DATABASE IF EXISTS laja_vote;

CREATE DATABASE IF NOT EXISTS laja_vote;
USE laja_vote;
# -----------------------------------------------------------------------------
#       TABLE : CODE
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS CODE
 (
   ID_CODE INTEGER NOT NULL AUTO_INCREMENT ,
   CODE CHAR(255) NOT NULL  
   , PRIMARY KEY (ID_CODE) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : REPONSE
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS REPONSE
 (
   ID_REPONSE INTEGER NOT NULL AUTO_INCREMENT ,
   ID_QUESTION INTEGER NOT NULL  ,
   ID_CHOIX INTEGER NOT NULL  ,
   CODE VARCHAR(255) NOT NULL  
   , PRIMARY KEY (ID_REPONSE) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       TABLE : CORRESPONDRE
# -----------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS CORRESPONDRE
 (
   ID_CODE INTEGER NOT NULL  ,
   ID_REPONSE INTEGER NOT NULL  
   , PRIMARY KEY (ID_CODE,ID_REPONSE) 
 ) 
 comment = "";

# -----------------------------------------------------------------------------
#       INDEX DE LA TABLE CORRESPONDRE
# -----------------------------------------------------------------------------


CREATE  INDEX I_FK_CORRESPONDRE_CODE
     ON CORRESPONDRE (ID_CODE ASC);

CREATE  INDEX I_FK_CORRESPONDRE_REPONSE
     ON CORRESPONDRE (ID_REPONSE ASC);


# -----------------------------------------------------------------------------
#       CREATION DES REFERENCES DE TABLE
# -----------------------------------------------------------------------------


ALTER TABLE CORRESPONDRE 
  ADD FOREIGN KEY FK_CORRESPONDRE_CODE (ID_CODE)
      REFERENCES CODE (ID_CODE) ;


ALTER TABLE CORRESPONDRE 
  ADD FOREIGN KEY FK_CORRESPONDRE_REPONSE (ID_REPONSE)
      REFERENCES REPONSE (ID_REPONSE) ;

