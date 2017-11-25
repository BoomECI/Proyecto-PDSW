
--Acudiente--
INSERT INTO Acudiente(nombre, cedula, correo, telefono)
VALUES ('Diana Mendoza', 134566, 'diana@hotmail.com', 3145673491);

INSERT INTO Acudiente(nombre, cedula, correo, telefono)
VALUES ('Carlos Osorio', 1904567, 'carlos@hotmail.com', 310456923);

INSERT INTO Acudiente(nombre, cedula, correo, telefono)
VALUES ('Juan Gomez', 198472, 'juan@hotmail.com', 318234567);

INSERT INTO Acudiente(nombre, cedula, correo, telefono)
VALUES ('Felipe Moreno', 1495412, 'felipe@hotmail.com', 313456123);

INSERT INTO Acudiente(nombre, cedula, correo, telefono)
VALUES ('Mauricio Cuesta', 1456763, 'mauricio@hotmail.com', 313234123);


--Consejero--
INSERT INTO Consejero(nombre, codigo, correo)
VALUES ('Rodrigo Alfonso Beltran Lopez', 2345678, 'rodigo.lopez@escuelaing.edu.co');

INSERT INTO Consejero(nombre, codigo, correo)
VALUES ('Gerardo Ospina', 2345679, 'gerardo.ospina@escuelaing.edu.co');

INSERT INTO Consejero(nombre, codigo, correo)
VALUES ('Patricia Castaneda', 2345680, 'patricia.castaneda@escuelaing.edu.co');

INSERT INTO Consejero(nombre, codigo, correo)
VALUES ('Oswaldo Castillo Navetty', 2001212, 'oswaldo.castillo@escuelaing.edu.co');

INSERT INTO Consejero(nombre, codigo, correo)
VALUES ('Sonia Jaimes', 2345681, 'sonia.jaimes@escuelaing.edu.co')



--Estudiante--
INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos)
VALUES (134566, 2110805, 'Juan David Ramirez Mendoza', 'juan.ramirez-me@mail.escuelaing.edu.co', 3138912392, 2345678, 1019138850, 'CC', 1, 18);

INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos)
VALUES (1904567, 2110432, 'Nicolas Osorio Arias', 'nicolas.osorio@mail.escuelaing.edu.co', 3152345671, 2345680, 1013456778, 'CC', 1, 18);

INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos)
VALUES (198472, 2120656, 'Juan Nicolas Gomez Moreno', 'juan.gomez-more@mail.escuelaing.edu.co', 3182345678, 2345679, 10191456768, 'CC', 1, 19);

INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos)
VALUES (1456763, 2118270, 'Jonathan Mauricio Cuesta Sanchez', 'jonathan.cuesta@mail.escuelaing.edu.co', 3131923486, 2345679, 1019167856, 'CC', 1, 19);

INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos)
VALUES (1495412, 2108419, 'Daniel Felipe Moreno D´aleman', 'daniel.moreno-d@mail.escuelaing.edu.co', 3131923496, 2001212, 1019166456, 'CC', 1, 18);

/*INSERT INTO Estudiante(Acudiente, codigo, nombre, correo, telefono, consejero, identificacion, tipo_id, Plan_ID, creditos)
VALUES (134566, 2083627, 'Camilo Andres Ramirez Mendoza', 'camilo.ramirez-m@mail.escuelaing.edu.co', 312456818, 2345681, 1018345640, 'CC', 10, 18);*/



--Materia--
INSERT INTO Materia(nemonico)
VALUES ('ACFI');

INSERT INTO Materia(nemonico)
VALUES ('TPRO');

INSERT INTO Materia(nemonico)
VALUES ('TCOM');

INSERT INTO Materia(nemonico)
VALUES ('ARQC');

INSERT INTO Materia(nemonico)
VALUES ('FRED');

INSERT INTO Materia(nemonico)
VALUES ('APMU');

INSERT INTO Materia(nemonico)
VALUES ('PDSW');

INSERT INTO Materia(nemonico)
VALUES ('ESTI');

INSERT INTO Materia(nemonico)
VALUES ('EHU1');

INSERT INTO Materia(nemonico)
VALUES ('PRON');

INSERT INTO Materia(nemonico)
VALUES ('PDIS');

INSERT INTO Materia(nemonico)
VALUES ('SOPC');

INSERT INTO Materia(nemonico)
VALUES ('CRIP');

INSERT INTO Materia(nemonico)
VALUES ('CALD');

INSERT INTO Materia(nemonico)
VALUES ('MMIN');

INSERT INTO Materia(nemonico)
VALUES ('ALLI');

INSERT INTO Materia(nemonico)
VALUES ('IINS');

INSERT INTO Materia(nemonico)
VALUES ('EALE');

INSERT INTO Materia(nemonico)
VALUES ('CIED');

INSERT INTO Materia(nemonico)
VALUES ('LCAL');

INSERT INTO Materia(nemonico)
VALUES ('FIMF');

INSERT INTO Materia(nemonico)
VALUES ('PIMB');

INSERT INTO Materia(nemonico)
VALUES ('MDIS');

INSERT INTO Materia(nemonico)
VALUES ('FIEM');

INSERT INTO Materia(nemonico)
VALUES ('MBDA');

INSERT INTO Materia(nemonico)
VALUES ('PIMO');

INSERT INTO Materia(nemonico)
VALUES ('ELCB');

INSERT INTO Materia(nemonico)
VALUES ('POOB');

INSERT INTO Materia(nemonico)
VALUES ('TSOR');

INSERT INTO Materia(nemonico)
VALUES ('FUNE');

INSERT INTO Materia(nemonico)
VALUES ('SEGI');

INSERT INTO Materia(nemonico)
VALUES ('ARSW');

INSERT INTO Materia(nemonico)
VALUES ('AREM');

INSERT INTO Materia(nemonico)
VALUES ('COSW');

INSERT INTO Materia(nemonico)
VALUES ('EHU2');

INSERT INTO Materia(nemonico)
VALUES ('FGPR');

INSERT INTO Materia(nemonico)
VALUES ('ET01');

INSERT INTO Materia(nemonico)
VALUES ('SOSW');

INSERT INTO Materia(nemonico)
VALUES ('EHU3');

INSERT INTO Materia(nemonico)
VALUES ('PGR1');

INSERT INTO Materia(nemonico)
VALUES ('PGR2');

INSERT INTO Materia(nemonico)
VALUES ('ELEA');

INSERT INTO Materia(nemonico)
VALUES ('ET02');

INSERT INTO Materia(nemonico)
VALUES ('ET03');

INSERT INTO Materia(nemonico)
VALUES ('CLE1');

INSERT INTO Materia(nemonico)
VALUES ('CLE2');



--MateriasActuales

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110805, 'PRON');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110805, 'FRED');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110805, 'ACFI');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110805, 'PDSW');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110805, 'APMU');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110432, 'TCOM');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110432, 'FRED');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110432, 'PDSW');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110432, 'PDIS');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2110432, 'TPRO');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2120656, 'TCOM');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2120656, 'SOPC');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2120656, 'PDSW');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2120656, 'ESTI');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2120656 'ACFI');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2120656 'CRIP');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2118270, 'TCOM');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2118270, 'ARQC');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2118270, 'PDSW');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2118270, 'PRON');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2118270, 'FUNE');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2118270, 'ESTI');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2108419, 'ESTI');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2108419, 'FRED');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2108419, 'EHU1');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2108419, 'PDSW');

INSERT INTO MateriasActuales(Estudiante, Materia)
VALUES (2108419, 'TCOM');


--MateriasCursadas

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'CALD');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'CALD');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'CALD');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'CALD');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'CALD');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'MMIN');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'MMIN');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'MMIN');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'MMIN');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'MMIN');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'ALLI');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'ALLI');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'ALLI');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'ALLI');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'ALLI');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'IINS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'IINS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'IINS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'IINS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'IINS');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'EALE');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'EALE');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'EALE');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'EALE');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'EALE');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'CIED');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'CIED');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'CIED');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'CIED');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'CIED');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'LCAL');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'LCAL');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'LCAL');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'LCAL');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'LCAL');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'FIMF');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'FIMF');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'FIMF');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'FIMF');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'FIMF');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'PIMB');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'PIMB');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'PIMB');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'PIMB');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'PIMB');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'MDIS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'MDIS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'MDIS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'MDIS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'MDIS');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'FIEM');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'FIEM');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'FIEM');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'FIEM');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'FIEM');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'MBDA');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'MBDA');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'MBDA');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'MBDA');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'MBDA');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'PIMO');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'PIMO');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'PIMO');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'PIMO');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'PIMO');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'EHU1');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'EHU1');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'EHU1');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'EHU1');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'PDIS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'PDIS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'PDIS');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'PDIS');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'TPRO');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'TPRO');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'TPRO');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'ARQC');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'ARQC');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'ARQC');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'ARQC');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'POOB');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'POOB');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'POOB');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'POOB');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'POOB');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'FRED');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'TSOR');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'TSOR');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'TSOR');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'TSOR');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'TSOR');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'FUNE');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'FUNE');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2120656, 'FUNE');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2118270, 'FUNE');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'FUNE');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'ACFI');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'ACFI');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110432, 'PRON');

INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2108419, 'PRON');


INSERT INTO MateriasCursadas(Estudiante, Materia)
VALUES (2110805, 'CLE1');


--Plan_de_Estudio
INSERT INTO Plan_de_Estudio (Carrera, ID, Grafo, creditos, nummaterias)
VALUES ('Ingenieria De Sistemas', 1, '{
	"materias": ["CALD","MMIN","ALLI","IINS","EALE","CIED","LCAL","FIMF","PIMB","MDIS","FIEM","MBDA","PIMO","EHU1","PDIS","TPRO","ARQC",
	"ELCB","POOB","ESTI","TCOM","FRED","TSOR","PDSW","FUNE","SEGI","SOPC","PRON","ARSW","ACFI","AREM","COSW", "EHU2","FGPR","ET01", 
	"SOSW", "EHU3", "ELEA", "ET02", "PGR1", "CRIP", "ET03", "CLE1", "PGR2", "CLE2"],
	"root": {
			"nombre" : "", 
			"creditos": "", 
			"co" : [], 
			"pre" : []}, 
	"CALD": {"nombre" : "Calculo diferencial", 
			"creditos":"4", 
			"co" : [], 
			"pre" : []}, 
	"MMIN": {"nombre" : "Modelos matematicos para informatica", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"ALLI": {"nombre" : "Algebra lineal", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"IINS": {"nombre" : "Introduccion a la ingenieria de sistemas", 
			"creditos":"2", 
			"co" : [], 
			"pre" : []}, 
	"EALE": {"nombre" : "Electiva en el area de lengua espanola", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"CIED": {"nombre" : "Calculo integral y ecuaciones diferenciales", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["CALD"]}, 
	"LCAL": {"nombre" : "Logica calculativa", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["MMIN"]}, 
	"FIMF": {"nombre" : "Fisica mecanica y fluidos", 
			"creditos":"4", 
			"co" : ["CALD"], 
			"pre" : []}, 
	"PIMB": {"nombre" : "Programacion imperativa basica", 
			"creditos":"4", 
			"co" : [], 
			"pre" : []}, 
	"MDIS": {"nombre" : "Matematicas discretas", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["LCAL"]}, 
	"FIEM": {"nombre" : "Fisica del electromagnetismo", 
			"creditos":"4", 
			"co" : ["CIED"], 
			"pre" : ["FIMF"]}, 
	"MBDA": {"nombre" : "Modelos y bases de datos", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["LCAL", "PIMB"]}, 
	"PIMO": {"nombre" : "Programacion imperativa modular", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["PIMB", "MMIN"]}, 
	"EHU1": {"nombre" : "Electiva humanistica 1", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["EALE"]}, 
	"PDIS": {"nombre" : "Probabilidad discreta", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["CIED"]}, 
	"TPRO": {"nombre" : "Teoria de la programacion", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["PIMO", "MDIS"]}, 
	"ARQC": {"nombre" : "Arquitectura del computador", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["FIEM"]}, 
	"ELCB": {"nombre" : "Electiva en ciencias basicas", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"POOB": {"nombre" : "Programacion orientada a objetos", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["PIMO"]}, 
	"ESTI": {"nombre" : "Estadistica", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["PDIS"]}, 
	"TCOM": {"nombre" : "Teoria de la computacion", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["MDIS", "POOB"]}, 
	"FRED": {"nombre" : "Fundamentos de redes", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["ARQC"]}, 
	"TSOR": {"nombre" : "Teoria de sistemas y organizaciones", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"PDSW": {"nombre" : "Procesos de desarrollo de software", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["POOB", "MBDA"]}, 
	"FUNE": {"nombre" : "Fundamentos de economia", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["CALD"]}, 
	"SEGI": {"nombre" : "Seguridad informatica", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["FRED"]}, 
	"SOPC": {"nombre" : "Sistemas operativos y plataformas computacionales", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["ARQC"]}, 
	"PRON": {"nombre" : "Procesos de negocio", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["TSOR"]}, 
	"ARSW": {"nombre" : "Arquitectura de software", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["FRED", "PDSW"]}, 
	"ACFI": {"nombre" : "Analisis contable y financiero", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["FUNE"]}, 
	"AREM": {"nombre" : "Arquitecturas empresariales", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["PRON"]}, 
	"COSW": {"nombre" : "Construccion de software", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["ARSW"]}, 
	"EHU2": {"nombre" : "Electiva humanistica 2", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["EALE"]}, 
	"FGPR": {"nombre" : "Fundamentos y gerencia de proyectos", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["ACFI", "PDIS"]}, 
	"ET01": {"nombre" : "Electiva tecnica 1", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"SOSW": {"nombre" : "Soluciones de software", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["AREM", "ARSW"]}, 
	"EHU3": {"nombre" : "Electiva humanistica 3", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["EALE"]}, 
	"ELEA": {"nombre" : "Electiva economico-administrativa", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"ET02": {"nombre" : "Electiva tecnica 2", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"PGR1": {"nombre" : "Proyecto de grado 1", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["FGPR"]}, 
	"CRIP": {"nombre" : "Colombia: realidad e instituciones politicas", 
			"creditos":"3", 
			"co" : [], 
			"pre" : ["EHU1", "EHU2", "EHU3"]}, 
	"ET03": {"nombre" : "Electiva tecnica 3", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"CLE1": {"nombre" : "Curso de libre eleccion 1", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}, 
	"PGR2": {"nombre" : "Proyecto de grado 2", 
			"creditos":"4", 
			"co" : [], 
			"pre" : ["PGR1"]}, 
	"CLE2": {"nombre" : "Curso de libre eleccion 2", 
			"creditos":"3", 
			"co" : [], 
			"pre" : []}
}', 148, 45);


--Rol--
INSERT INTO rol (nombre)
VALUES ('Estudiante');

INSERT INTO rol (nombre)
VALUES ('Consejero');

INSERT INTO rol (nombre)
VALUES ('Directivo');

--USER--
--estudiantes
INSERT INTO USER (username, password, rol)
VALUES (1, 'juan.ramirez-me', 'Estudiante');

INSERT INTO USER (username, password, rol)
VALUES (2, 'nicolas.osorio', 'Estudiante');

INSERT INTO USER (username, password, rol)
VALUES (3, 'jonathan.cuesta', 'Estudiante');

INSERT INTO USER (username, password, rol)
VALUES (4, 'juan.gomez-more', 'Estudiante');

INSERT INTO USER (username, password, rol)
VALUES (5, 'daniel.moreno-d', 'Estudiante');

--directivo
INSERT INTO USER (username, password, rol)
VALUES (6, 'oswaldo.castillo', 'Directivo');

--consejeros
INSERT INTO USER (username, password, rol)
VALUES (7, 'rodrigo.lopez', 'Consejero');

INSERT INTO USER (username, password, rol)
VALUES (8, 'gerardo.ospina', 'Consejero');

INSERT INTO USER (username, password, rol)
VALUES (9, 'patricia.castaneda', 'Consejero');

INSERT INTO USER (username, password, rol)
VALUES (10, 'oswaldo.castillo', 'Consejero');

INSERT INTO USER (username, password, rol)
VALUES (11, 'sonia.jaimes', 'Consejero');

--solicitud_de_cancelacion
INSERT INTO solicitud_de_cancelacion (fecha, estado, id, justificacion, comentario, avalAcudiente, avalConsejero, Materia, Estudiante)
VALUES (TO_DATE('2017-08-25 07:45:11', 'yyyy/mm/dd hh24:mi:ss'), 'Tramitada', 1, 'No me gusta la clase y me quita tiempo para jugar lol', 'Tal vez si dejara de jugar lol podria dedicarle mas tiempo a sus asignaturas', false, false, 'APMU', 2110805);

INSERT INTO solicitud_de_cancelacion (fecha, estado, id, justificacion, comentario, avalAcudiente, avalConsejero, Materia, Estudiante)
VALUES (TO_DATE('2017-10-12 02:30:03', 'yyyy/mm/dd hh24:mi:ss'), 'Pendiente', 2, 'Mis notas no son buenas en esta asignatura', "", false, false, 'FRED', 2110805);

INSERT INTO solicitud_de_cancelacion (fecha, estado, id, justificacion, comentario, avalAcudiente, avalConsejero, Materia, Estudiante)
VALUES (TO_DATE('2017-07-11 10:36:10', 'yyyy/mm/dd hh24:mi:ss'), 'Pendiente', 3, 'No volvi a ir', "", false, false, 'PDIS', 2110432);

INSERT INTO solicitud_de_cancelacion (fecha, estado, id, justificacion, comentario, avalAcudiente, avalConsejero, Materia, Estudiante)
VALUES (TO_DATE('2017-08-18 09:21:00', 'yyyy/mm/dd hh24:mi:ss'), 'Pendiente', 4, 'No he hecho nada del proyecto', "", false, false, 'PRON', 2118270);

INSERT INTO solicitud_de_cancelacion (fecha, estado, id, justificacion, comentario, avalAcudiente, avalConsejero, Materia, Estudiante)
VALUES (TO_DATE('2017-09-14 23:21:24', 'yyyy/mm/dd hh24:mi:ss'), 'Pendiente', 5, 'No me gusta hacer plataformas', "", false, false, 'SOPC', 2120656);

INSERT INTO solicitud_de_cancelacion (fecha, estado, id, justificacion, comentario, avalAcudiente, avalConsejero, Materia, Estudiante)
VALUES (TO_DATE('2017-07-10 20:20:06', 'yyyy/mm/dd hh24:mi:ss'), 'Pendiente', 6, 'Todos mis companeros cancelaron', "", false, false, 'ESTI', 2108419);