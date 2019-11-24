CREATE TABLE IF NOT EXISTS `pelicula` (
  id INTEGER PRIMARY KEY,
  director VARCHAR(128),
  titulo VARCHAR(128),
  fecha DATETIME 
);


INSERT INTO pelicula (id,director,titulo,fecha)
  VALUES (1,'Martin Scorsese','Taxi driver','1976-02-08');

INSERT INTO pelicula (id,director,titulo,fecha)
  VALUES (2,'Clint Eastwood','Los puentes de Madison','1995-10-11');

INSERT INTO pelicula (id,director,titulo,fecha)
  VALUES (3,'Stanley Kubrick','El resplandor','1980-12-19');

INSERT INTO pelicula (id,director,titulo,fecha)
  VALUES (4,'Steven Spielberg','Salvar al soldado Ryan','1998-09-18');






jdbc:mysql://127.0.0.1:3306/?user=root

