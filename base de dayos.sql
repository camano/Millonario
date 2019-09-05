/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.30-MariaDB : Database - millonario
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`millonario` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `millonario`;

/*Table structure for table `listar` */

DROP TABLE IF EXISTS `listar`;

CREATE TABLE `listar` (
  `id` int(11) DEFAULT NULL,
  `nombre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `listar` */

/*Table structure for table `pregunta` */

DROP TABLE IF EXISTS `pregunta`;

CREATE TABLE `pregunta` (
  `idpregunta` int(11) NOT NULL,
  `enunciado` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`idpregunta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pregunta` */

/*Table structure for table `respuesta` */

DROP TABLE IF EXISTS `respuesta`;

CREATE TABLE `respuesta` (
  `idrespuesta` int(11) NOT NULL,
  `enunciadoRespuesta` varchar(150) DEFAULT NULL,
  `falso_verdadero` varchar(20) DEFAULT NULL,
  `idpregunta_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`idrespuesta`),
  KEY `FKrespuesta` (`idpregunta_id`),
  CONSTRAINT `FKrespuesta` FOREIGN KEY (`idpregunta_id`) REFERENCES `pregunta` (`idpregunta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `respuesta` */

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `correo` varchar(100) NOT NULL,
  `contraseña` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`idusuario`,`correo`,`contraseña`) values (1,'jonatan@gmail.com','hola'),(2,'a','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
