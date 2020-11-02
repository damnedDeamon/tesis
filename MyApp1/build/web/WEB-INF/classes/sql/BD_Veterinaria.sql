create database veterinaria;  -- drop database veterinaria;

use veterinaria;

create table veterinario(
	id int auto_increment,
    nombre varchar(50),
    gmail varchar(50),
    clave varchar(50),
    primary key(id)
);

create table cliente(
	id int auto_increment,
    direccion varchar(100),
    nombre varchar(50),
    gmail varchar(50),
    clave varchar(50),
    telefono varchar(20),
    primary key(id)
);

create table tipo_mascota(
	id int auto_increment,
	tipoMascota varchar(60),
    primary key(id)
);

create table raza(
    id int auto_increment,
    nombreRaza Varchar(50),
    tipo_mascota int,
    foreign key (tipo_mascota) references tipo_mascota(id),
    primary key(id)
);



create table mascota(
    id int auto_increment,
    nombreMascota varchar(50),
    fechaDeNacimeinto date,
    edad int,
    peso float,
    sexo int,
    cliente_fk int,
    tipo_fk int,
    raza_fk int,
    foreign key (cliente_fk) references cliente(id),
    foreign key (raza_fk) references raza(id),
    foreign key (tipo_fk) references tipo_mascota(id),
    primary key(id)
);

create table tipo_atencion(
	id int auto_increment,
    nombreAtencion varchar(100),
    primary key(id)
);
create table atencion(
    id int auto_increment,
    fecha datetime,
    resumen varchar(100),
    atendido_fk int,
    mascota_fk int,
    tipo_atencion_fk int,
    foreign key (mascota_fk) references mascota(id),
    foreign key (tipo_atencion_fk) references tipo_atencion(id),
    foreign key (atendido_fk) references veterinario(id),
    primary key(id)
);

-- veterinario --
insert into veterinario values(null,'Matias Diaz','matias@gmail.com','11-1');
-- veterinario --

-- cliente --
insert into cliente values(null,'Jose Toribio Medina','Franco Diaz','damneddemon199@gmail.com','22-2','+56978459686');
-- cliente --

-- tipo_mascota --
insert into tipo_mascota values(null,'Perro');
insert into tipo_mascota values(null,'Gato');
insert into tipo_mascota values(null,'Conejo');
insert into tipo_mascota values(null,'Hámster');
insert into tipo_mascota values(null,'Tortuga');
insert into tipo_mascota values(null,'Hurón');
insert into tipo_mascota values(null,'Cobaya');
insert into tipo_mascota values(null,'Chinchilla');
insert into tipo_mascota values(null,'Dragón barbudo');
insert into tipo_mascota values(null,'Pájaros');
insert into tipo_mascota values(null,'Cerdo miniatura');
insert into tipo_mascota values(null,'Peces');
-- tipo_mascota --

-- Raza Mascota ó especia --

-- Razas de Perro --
insert into raza values(null,'Begle',1);
insert into raza values(null,'Pug',1);
insert into raza values(null,'Shih Tzu',1);
insert into raza values(null,'bulldog',1);
insert into raza values(null,'Bulldog Inglés',1);
insert into raza values(null,'salchicha',1);
insert into raza values(null,'Bichón Frisé',1);
insert into raza values(null,'Cocker Spaniel',1);
insert into raza values(null,'Boston Terrier',1);
insert into raza values(null,'Yorkshire Terrier',1);
insert into raza values(null,'Bulldog Francés',1);
insert into raza values(null,'Westie',1);
insert into raza values(null,'Cavalier',1);
insert into raza values(null,'Galgo',1);
insert into raza values(null,'caniche',1);
insert into raza values(null,'Bichón Maltés',1);
insert into raza values(null,'Chihuahua',1);
insert into raza values(null,'Pinscher Miniatura',1);
insert into raza values(null,'Pekinés',1);
insert into raza values(null,'Pomerania',1);
insert into raza values(null,'Shiba Inu',1);
insert into raza values(null,'Golden Retriever',1);
insert into raza values(null,'Dálmata',1);
insert into raza values(null,'Boxer',1);
insert into raza values(null,'Cocker Spaniel',1);
insert into raza values(null,'Schnauzer',1);
insert into raza values(null,'Boxer',1);
insert into raza values(null,'Border Collie',1);
insert into raza values(null,'Pastor Alemán',1);
insert into raza values(null,'Labrador Retriever',1);
insert into raza values(null,'Golden Retriever',1);
insert into raza values(null,'Poodle',1);
insert into raza values(null,'Husky Siberiano',1);
insert into raza values(null,'Rottweiler',1);
insert into raza values(null,'Gran Danés',1);
insert into raza values(null,'Dóberman',1);
insert into raza values(null,'Corgi',1);
insert into raza values(null,'Boyero de Berna',1);
insert into raza values(null,'San Bernardo',1);
-- Razas de Perro --

-- Razas de Gatos --
insert into raza values(null,'Abisinio',2);
insert into raza values(null,'Africano doméstico',2);
insert into raza values(null,'American Curl',2);
insert into raza values(null,'American shorthair',2);
insert into raza values(null,'American wirehair',2);
insert into raza values(null,'Angora turco',2);
insert into raza values(null,'Aphrodite-s Giants',2);
insert into raza values(null,'Australian Mist',2);
insert into raza values(null,'Azul ruso',2);
insert into raza values(null,'Bengala',2);
insert into raza values(null,'Bobtail japonés',2);
insert into raza values(null,'Bombay',2);
insert into raza values(null,'Bosque de Noruega',2);
insert into raza values(null,'Brazilian Shorthair',2);
insert into raza values(null,'British Shorthair',2);
insert into raza values(null,'Burmés',2);
insert into raza values(null,'Burmilla',2);
insert into raza values(null,'California Spangled',2);
insert into raza values(null,'Ceylon',2);
insert into raza values(null,'Chartreux',2);
insert into raza values(null,'Cornish rex',2);
insert into raza values(null,'Cymric',2);
insert into raza values(null,'Deutsch Langhaar',2);
insert into raza values(null,'Devon rex',2);
insert into raza values(null,'Don Sphynx',2);
insert into raza values(null,'Dorado africano',2);
insert into raza values(null,'Europeo común',2);
insert into raza values(null,'Gato exótico',2);
insert into raza values(null,'German Rex',2);
insert into raza values(null,'Habana brown',2);
insert into raza values(null,'Himalayo',2);
insert into raza values(null,'Khao Manee',2);
insert into raza values(null,'Korat',2);
insert into raza values(null,'Maine Coon',2);
insert into raza values(null,'Manx',2);
insert into raza values(null,'Mau egipcio',2);
insert into raza values(null,'Munchkin',2);
insert into raza values(null,'Ocicat',2);
insert into raza values(null,'Ojos azules',2);
insert into raza values(null,'Oriental',2);
insert into raza values(null,'Oriental de pelo largo',2);
insert into raza values(null,'Persa',2);
insert into raza values(null,'Peterbald',2);
insert into raza values(null,'Pixi Bob',2);
insert into raza values(null,'Ragdoll',2);
insert into raza values(null,'Sagrado de Birmania',2);
insert into raza values(null,'Scottish Fold',2);
insert into raza values(null,'Selkirk rex',2);
insert into raza values(null,'Serengeti',2);
insert into raza values(null,'Seychellois',2);
insert into raza values(null,'Siamés',2);
insert into raza values(null,'Siamés Moderno',2);
insert into raza values(null,'Siamés Tradicional',2);
insert into raza values(null,'Siberiano',2);
insert into raza values(null,'Snowshoe',2);
insert into raza values(null,'Sphynx',2);
insert into raza values(null,'Tonkinés',2);
insert into raza values(null,'Van Turco',2);
-- Razas de Gatos --

-- Raza Mascota ó especia --


-- Mascota --
insert into mascota values(null,'Odie','2019-05-01','1','16.9',1,'1','1','1'); -- 1 = Macho 2 = Hembra
-- Mascota --

-- Tipo atencion --
insert into tipo_atencion values(null,'Cardiología veterinaria');
-- Tipo atencion --


-- Atencion --
insert into atencion values(null,'2020-10-18 08:40','insuficiencia cardiaca','1','1','1');
-- Atencion --

select * from veterinario;
select * from cliente;
select * from tipo_mascota;
select * from raza;
select * from mascota;
select * from tipo_atencion;
select * from atencion;

-- Buscar al cliente con la ID 1 --
select * from cliente where id = 1;
-- Listado de el cliente con la ID 1 --


-- Buscar al cliente con la clave 22-2 --
select * from cliente c inner join mascota m on m.cliente_fk = c.id where c.clave = "22-2";
-- Buscar al cliente con la clave 22-2 --



select m.id, c.nombre, m.nombreMascota, m.fechaDeNacimeinto, m.edad, m.sexo, m.peso, tm.tipoMascota
from mascota m
inner join tipo_mascota tm
on m.tipo_fk = tm.id
inner join cliente c
on m.cliente_fk = c.id;

select m.id, c.nombre, m.nombreMascota, m.fechaDeNacimeinto, m.edad, m.sexo, m.peso, tm.tipoMascota, r.nombreRaza
from mascota m, tipo_mascota tm, raza r, cliente c
where m.tipo_fk = tm.id and r.tipo_mascota_fk = tm.id and m.cliente_fk = c.id
and r.id = 1;
select * from mascota where id = 1;


select r.id, r.nombreRaza from raza r inner join tipo_mascota tm on tm.id = r.tipo_mascota where tm.id = 2;

select r.id, r.nombreRaza from raza r inner join tipo_mascota tm on r.tipo_mascota = tm.id where tm.id = 1 and r.id = 2;

select * from tipo_mascota where id = '1';

select * from tipo_mascota where tipoMascota = 'Perro';
select * from tipo_mascota where tipoMascota = 'Perro';
select r.id, r.nombreRaza from raza r inner join tipo_mascota tm on r.tipo_mascota = tm.id where tm.id = 1 and r.nombreRaza = 'bulldog';

select m.id, v.nombre, m.nombreMascota, ta.nombreAtencion, a.resumen, a.fecha
from atencion a 
inner join veterinario v
on a.atendido_fk = v.id
inner join mascota m
on a.mascota_fk = m.id
inner join tipo_atencion ta
on a.tipo_atencion_fk = ta.id
where m.id = 1;

select * from atencion where id = 4;

select a.id, v.nombre, m.nombreMascota, ta.nombreAtencion, a.resumen, a.fecha
from atencion a 
inner join veterinario v
on a.atendido_fk = v.id
inner join mascota m
on a.mascota_fk = m.id
inner join tipo_atencion ta
on a.tipo_atencion_fk = ta.id
where a.id = 3;


select m.id, v.id, ta.id
from atencion a
inner join mascota m
on m.id = a.mascota_fk
inner join veterinario v
on v.id = a.atendido_fk
inner join tipo_atencion ta
on ta.id = a.tipo_atencion_fk
where a.id = 2;

select c.gmail from cliente c
inner join mascota m
on c.id = m.cliente_fk
where m.id = 2; 
