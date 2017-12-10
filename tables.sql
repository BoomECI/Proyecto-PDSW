-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2017-12-10 00:59:55.94

-- tables
-- Table: Acudiente
CREATE TABLE Acudiente (
    nombre varchar(200)  NOT NULL,
    cedula bigint  NOT NULL,
    correo varchar(200)  NOT NULL,
    telefono bigint  NOT NULL,
    CONSTRAINT Acudiente_pk PRIMARY KEY (cedula)
);

-- Table: Consejero
CREATE TABLE Consejero (
    nombre varchar(200)  NOT NULL,
    codigo bigint  NOT NULL,
    correo varchar(200)  NOT NULL,
    CONSTRAINT Consejero_pk PRIMARY KEY (codigo)
);

-- Table: Estudiante
CREATE TABLE Estudiante (
    Acudiente bigint  NOT NULL,
    codigo bigint  NOT NULL,
    nombre varchar(200)  NOT NULL,
    correo varchar(200)  NOT NULL,
    telefono bigint  NOT NULL,
    consejero bigint  NOT NULL,
    identificacion bigint  NOT NULL,
    tipo_id varchar(3)  NOT NULL,
    Plan_ID int  NOT NULL,
    creditos int  NOT NULL,
    CONSTRAINT Estudiante_pk PRIMARY KEY (codigo)
);

-- Table: Materia
CREATE TABLE Materia (
    nemonico varchar(4)  NOT NULL,
    CONSTRAINT Materia_pk PRIMARY KEY (nemonico)
);

-- Table: MateriasActuales
CREATE TABLE MateriasActuales (
    Estudiante bigint  NOT NULL,
    Materia varchar(4)  NOT NULL,
    CONSTRAINT MateriasActuales_pk PRIMARY KEY (Estudiante,Materia)
);

-- Table: MateriasCursadas
CREATE TABLE MateriasCursadas (
    Estudiante bigint  NOT NULL,
    Materia varchar(4)  NOT NULL,
    CONSTRAINT MateriasCursadas_pk PRIMARY KEY (Estudiante,Materia)
);

-- Table: Plan_de_Estudio
CREATE TABLE Plan_de_Estudio (
    Carrera varchar(200)  NOT NULL,
    ID int  NOT NULL,
    Grafo varchar(100000)  NOT NULL,
    creditos int  NOT NULL,
    nummaterias int  NOT NULL,
    CONSTRAINT Plan_de_Estudio_pk PRIMARY KEY (ID)
);

-- Table: USER
CREATE TABLE "USER" (
    username bigint  NOT NULL,
    password varchar(50)  NOT NULL,
    rol varchar(15)  NOT NULL,
    CONSTRAINT USER_pk PRIMARY KEY (username,password,rol)
);

-- Table: rol
CREATE TABLE rol (
    nombre varchar(15)  NOT NULL,
    CONSTRAINT rol_pk PRIMARY KEY (nombre)
);

-- Table: solicitud_de_cancelacion
CREATE TABLE solicitud_de_cancelacion (
    fecha date  NOT NULL,
    estado varchar(10)  NOT NULL,
    id int  NOT NULL,
    justificacion varchar(200)  NOT NULL,
    comentario varchar(200)  NOT NULL,
    avalAcudiente boolean  NULL,
    avalConsejero boolean  NOT NULL,
    Materia varchar(4)  NOT NULL,
    Estudiante bigint  NOT NULL,
    CONSTRAINT solicitud_de_cancelacion_pk PRIMARY KEY (id)
);


