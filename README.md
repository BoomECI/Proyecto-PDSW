***Plataforma de gestión para el acompañamiento académico de estudiantes de Pregrado de la Escuela Colombiana de Ingeniería Julio Garavito***
======

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b7010a5e6b454abb86b9a06d4d979168)](https://www.codacy.com/app/CAPJackie/Proyecto-PDSW?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=BoomECI/Proyecto-PDSW&amp;utm_campaign=Badge_Grade)

[![CircleCI](https://circleci.com/gh/BoomECI/Proyecto-PDSW.svg?style=svg)](https://circleci.com/gh/BoomECI)

*Proyecto desarrollado en el periodo académico 2017-2 por BOOMECI para el curso Procesos de Desarrollo de Software (PDSW)*

  Integrantes de BOOMECI:
  -------
  * Jonathan Cuesta Sanchez - j.cuesta
  * Juan Nicolás Gómez Moreno - n.gomez
  * Daniel Moreno D'Aleman - d.moreno
  * Nicolás Osorio Arias - n.osorio
  * Juan David Ramirez Mendoza - d.ramirez

  Profesor:
  -------
  ##### Héctor Fabio Cadavid Rengifo

****Información General:****
======
 
  *Roles:*
  -------
  #### ****Stakeholder:****
  ##### Oswaldo Castillo Navetty
  
  #### ****Dueño de producto:****
  #####  Héctor Fabio Cadavid Rengifo
    
  #### ****Scrum Master:****
  #####  Juan David Ramirez Mendoza - d.ramirez 
    
  #### ****Team:****
 
  + Jonathan Cuesta Sanchez - j.cuesta
  + Juan Nicolás Gómez Moreno - n.gomez
  + Daniel Moreno D'Aleman - d.moreno
  + Nicolás Osorio Arias - n.osorio
  + Juan David Ramirez Mendoza - d.ramirez

*_Descripción resumida del producto:_*
------- 
Una plataforma de gestión para el acompañamiento académico a estudiantes, consejeros y directivos, que simplifica          procesos tanto de análisis de los semestres académicos para los estudiantes, como del trámite de las solicitudes de los consejeros; Si el estudiante desea solicitar una cancelación, la plataforma acompaña todo el proceso que la involucra, junto al permiso del consejero, y la notificación por medio de un correo electrónico al acudiente. Todo esto mediante un mecanismo no acoplado para introducirlo en la institución.
  
## *Funcionalidades:*
![alt text][logo]

[logo]: https://podemoscolladomediano.files.wordpress.com/2014/09/seccion-en-construccion.jpg "En construcción"

****Descripción avanzada del producto:**** 
------- 

## *Arquitectura:*

La plataforma de gestión para el acompañamiento académico a estudiantes, consejeros y directivos divide su funcionamiento en cuatro capas:

***Persistencia:*** la capa de persistencia empieza su funcionamiento en una base de datos utilizando PostgreSQL. Seguido por una extracción de los datos, y una transformación por medio de un mapper con el Framework de MyBatis, para trasformar lo que se extrae a objetos, para finalmente llevarlos a la capa de aplicación.

***Aplicación:*** la capa de aplicación se encarga de procesar los objetos obtenidos después de la capa de persistencia, para finalmente poder entregar lo que se requiere en la capa de vistas. Todo empieza en una clase de servicio en la cual se establecen todas las diferentes funciones que tiene toda la aplicación, para recoger los datos que se encuentran en los distintos DAOS y extraerlos en objetos. Estos objetos están constituidos por las diferentes entidades en que se encuentran como acudiente, consejero, estudiante, materias, plan de estudios, solicitudes de cancelación. También el análisis ocurre en esta capa, se hace por medio de un grafo dirigido acíclico cuya representación se encuentra de manera ligera ya que se usa JSON. 
***Vistas:***
***Seguridad:***

## *URL Heroku:*
https://proyectopdsw.herokuapp.com/





