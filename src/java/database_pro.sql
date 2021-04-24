drop database if exists cursoslibres;
create database cursoslibres;

use cursoslibres;

DROP TABLE IF EXISTS `usuarios`;

CREATE TABLE `usuarios` (
  `id` varchar(9)  NOT NULL,
  `nombre` varchar(50) NOT NULL ,
  `contrasenna` varchar(16) NOT NULL ,
  `telefono` varchar(8) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `rol` int NOT NULL  ,
  `especialidad` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;


DROP TABLE IF EXISTS `cursos`;


CREATE TABLE `cursos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tematica` varchar(50) NOT NULL ,
  `descripcion` varchar(1000),
  `estado` tinyint,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `grupos`;

CREATE TABLE `grupos` (
  `num_grupo` int NOT NULL  AUTO_INCREMENT,
  `id_curso` int DEFAULT NULL,
  `id_prof` varchar(9) DEFAULT NULL,
  `dias` varchar(9) COLLATE utf8_bin NOT NULL,
  `horario` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`num_grupo`),
  CONSTRAINT `clase_fk` FOREIGN KEY (`id_curso`) REFERENCES `cursos` (`id`),
  CONSTRAINT `profe_fk` FOREIGN KEY (`id_prof`) REFERENCES `usuarios` (`id`)
);

DROP TABLE IF EXISTS `nota`;

CREATE TABLE `nota` (
  `id_grupo` int NOT NULL,
  `id_est` varchar(9) NOT NULL,
  `calificacion` double DEFAULT NULL,
  PRIMARY KEY (`id_grupo`,`id_est`),
  CONSTRAINT `estmatriculado_fk` FOREIGN KEY (`id_est`) REFERENCES `usuarios` (`id`),
  CONSTRAINT `grupo_fk` FOREIGN KEY (`id_grupo`) REFERENCES `grupos` (`num_grupo`)
);

insert into Usuarios (id,nombre,contrasenna,telefono,email,rol,especialidad) values('6045', 'Jam Prueba','1111','2454','jam@mail.com',3,null);
insert into Usuarios (id,nombre,contrasenna,telefono,email,rol,especialidad) values('7000', 'Profe Prueba','1234','3233','profe@mail.com',2,'Info');
select * from Usuarios;