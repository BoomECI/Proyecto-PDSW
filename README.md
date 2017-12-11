***Plataforma de gestión para el acompañamiento académico de estudiantes de Pregrado de la Escuela Colombiana de Ingeniería Julio Garavito***
======

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

También es de gran importancia el uso del patrón de método fabrica, y las inyecciones de Google Guice para acoplar estas diferentes capas, así estas se pueden adaptar a cualquier software que ya esté montado en la institución.

***Vistas:*** Esta capa involucra el uso de PrimeFaces, mejorando la capacidad de las vistas, y aprovechando las distintas herramientas, para brindar la mejor experiencia al usuario al momento de usar la plataforma. También es de gran importancia el uso de ManageBeans los cuales manejan todos los datos que son usados en las vistas, estos son los que conectan esta capa con la lógica.  

***Seguridad:*** la capa de seguridad se hace gracias al uso de Apache Shiru el cual ayuda a restringir las diferentes vistas a sus correspondientes roles, también se cuenta con una protección que evita que se pueda ingresar desde el link si no pertenece al rol indicado. 

## *Modelo Entidad Relación:*
![alt text][diagramaE-R]

[diagramaE-R]: https://github.com/Nixperful/BancoDeImagenes/blob/master/E-r.PNG "Diagrama E-R"


## *Diagrama de Clases:*
![alt text][diagrama]

[diagrama]: https://github.com/Nixperful/BancoDeImagenes/blob/master/Class%20Diagram0.jpg "Diagrama de Clases"

## *Integración Continua:*
[![CircleCI](https://circleci.com/gh/BoomECI/Proyecto-PDSW.svg?style=svg)](https://circleci.com/gh/BoomECI)


## *URL Heroku:*
https://proyectopdsw.herokuapp.com/

## *Análisis de código:*
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/b7010a5e6b454abb86b9a06d4d979168)](https://www.codacy.com/app/CAPJackie/Proyecto-PDSW?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=BoomECI/Proyecto-PDSW&amp;utm_campaign=Badge_Grade)


## *_Metodología utilizada:_*
------- 
La metodología usada fue un conjunto de buenas prácticas, las cuales ayudaron a la buena organización en el desarrollo del proyecto, haciéndolo de forma ágil. El uso del Framework Scrum ayudó a la administración del proceso, fortaleciendo la comunicación entre los integrantes, y mejorando la planificación para cada una de las entregas.

Todo el proceso de desarrollo empezó con una visión del producto que elabora el stakeholder, sin embargo lo que no es de prioridad se filtra por el Dueño del producto el cual produce un backlog (anexo) en el cual en forma de historias de usuario se plantean los requerimientos que debe tener la aplicación.

Ese backlog es lo que se intenta cumplir cada temporada de trabajo, las cuales fueron tres, cada una con una duración de aproximadamente quince días, estas temporadas son denominadas Sprints las cuales inician con una reunión en la cual se analiza cada tarea que está en el backlog.

En el proceso no se realizaron reuniones Daily Standup ya que el ambiente académico no lo permitía, sin embargo, ocurrían reuniones de corto tiempo frecuentemente, para ir analizando la situación en la que el equipo se encontraba.

Al momento de hacer la entrega con el Dueño del producto se tienen en cuenta los diferentes comentarios que se hacen, y se tienen como objetivo para futuros Sprints, finalmente se hace una reunión de retrospectiva con la que podemos sacar conclusiones de la temporada que ha pasado y así finalizar el ciclo con una retrospectiva, antes de empezar nuevamente con otro Sprint.

Enlace de Backlog elaborado en Trello: https://trello.com/b/WPZ5zuo1/2017-2-proypdsw-boomeci 

## *Sprint 1:* 
  ### Descripción del Sprint:
  El primer sprint concluyó de una manera adecuada, durante este tiempo se elaboró la estructura necesaria para el proyecto, además se logró tener un producto entregable para la fecha acordada, sin embargo, los últimos días antes de la entrega tuvimos un trabajo que excedió lo que habíamos planeado, ya que tuvimos grandes cambios en la estructura de la plataforma. En general tuvimos un buen desempeño donde todo el equipo trabajó constantemente y con un punto de vista de entregar un buen producto; la comunicación fue clave en este aspecto para lograr mezclar las cuatro ramas en un gran proyecto, del cual se hace el reporte GIT (anexo), el cual solo se genera con el proyecto cuando ya está unido.
  ### Sprint-backlog:
  ![alt text][backlog1]

  [backlog1]: https://github.com/Nixperful/BancoDeImagenes/blob/master/s1.PNG "Backlog"  
  ### Sprint-burndown Chart:
  ![alt text][SB]

  [SB]: https://github.com/Nixperful/BancoDeImagenes/blob/master/ch1.PNG "Sprint-Burndown Chart"  
  
  ### Reporte GIT Sprint 1:
  http://profesores.is.escuelaing.edu.co/hcadavid/reportes/2017-2/pdsw/reports/11-14-2017-14H-38M/boomeci.repo/

  
## *Sprint 2:* 
  ### Descripción del Sprint:
  
   ### Sprint-backlog:
  ![alt text][backlog2]
  
  [backlog2]: https://github.com/Nixperful/BancoDeImagenes/blob/master/s2.PNG "Backlog"  
  
  ### Sprint-burndown Chart:
  ![alt text][SB2]

  [SB2]: https://github.com/Nixperful/BancoDeImagenes/blob/master/ch2.PNG "Sprint-Burndown Chart"  
  
  ### Reporte GIT Sprint 2:
  http://profesores.is.escuelaing.edu.co/hcadavid/reportes/2017-2/pdsw/reports/11-14-2017-14H-38M/boomeci.repo/
  
## *Sprint 3:*

*_Reporte de pruebas:_*
------- 






