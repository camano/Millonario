/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.30-MariaDB : Database - millonariobd
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`millonariobd` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `millonariobd`;

/*Table structure for table `pregunta` */

DROP TABLE IF EXISTS `pregunta`;

CREATE TABLE `pregunta` (
  `idpregunta` int(100) NOT NULL AUTO_INCREMENT,
  `enunciado` varchar(150) NOT NULL,
  `valor` int(100) NOT NULL,
  PRIMARY KEY (`idpregunta`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `pregunta` */

insert  into `pregunta`(`idpregunta`,`enunciado`,`valor`) values (5,'capital de venezuela',9),(6,'capital de venezuela',9),(8,'capital de colombia',10);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
