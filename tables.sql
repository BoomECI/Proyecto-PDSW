CREATE TABLE `ESTUDIANTE`(
  `codigo` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `telefono` int(11) NOT NULL,
  `consejero` int(11) NOT NULL,
  `identificacion` int(11) NOT NULL,
  `tipo_id` varchar(3) NOT NULL,
  `materiasActuales` varchar(4) NOT NULL,
  `materiasCursadas` varchar(4) NOT NULL,
  `PlanDeEstudioCarrera` varchar(200) NOT NULL,
  `PlanDeEstudioID` int(4) NOT NULL,
  `Acudiente_identificacion` int(4) NOT NULL,
  PRIMARY KEY (`codigo`)  
);

CREATE TABLE `SOLICITUD_DE_CANCELACION`(
  `id` int(4) NOT NULL,
  `fecha` date NOT NULL,
  `estado` varchar(200) NOT NULL,
  `estudiante` int(4) NOT NULL,
  `justificacion` varchar(200) NOT NULL,
  `materia` varchar(200) NOT NULL,
  `comentario` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)  		
);

CREATE TABLE `PLAN_DE_ESTUDIO`(
  `carrera` varchar(200) NOT NULL,
  `id` int(4) NOT NULL,
  `grafo` CLOB NOT NULL,
  `creditos` int(4) NOT NULL,
  PRIMARY KEY(`carrera`,`id`)
);

CREATE TABLE `MATERIA`(
  `nemonico` varchar(4) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `creditos` int(4) NOT NULL,
  `correquisito` varchar(4) NOT NULL,
  `prerrequisito` varchar(4) NOT NULL,
  PRIMARY KEY (`nemonico`)	
);

CREATE TABLE `ACUDIENTE`(
  `cedula` int(4) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `telefono` int(4) NOT NULL,
  PRIMARY KEY(`cedula`)  
);

CREATE TABLE `CONSEJERO`(
  `codigo` int(4) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `correo` varchar(200) NOT NULL,
  PRIMARY KEY(`codigo`)
);














