
DROP table IF EXISTS trabajador;

create table trabajador(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	trabajo ENUM('JUNIOR', 'MID', 'SENIOR')
);

insert into trabajador (nombre, apellido,trabajo)values('Frank','Gomis','JUNIOR');
insert into trabajador (nombre, apellido,trabajo)values('Dani','Matos','JUNIOR');
insert into trabajador (nombre, apellido,trabajo)values('Don','Dinero','MID');
insert into trabajador (nombre, apellido,trabajo)values('Oscar','Garcia','SENIOR');
insert into trabajador (nombre, apellido,trabajo)values('Publicidad','Subliminal','SENIOR');