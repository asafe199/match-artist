create table uf(
id integer auto_increment not null unique,
nameUf varchar(2) unique,
PRIMARY KEY(id)
);

create table cidade(
id integer auto_increment not null unique,
nameCidade varchar(50),
fk_uf integer not null,
PRIMARY KEY(id),
foreign key(fk_uf)references uf(id)
);

create table endereco(
id integer auto_increment not null unique,
logradouro varchar(100) unique,
numero integer,
complemento varchar(100),
cep integer,
descricao varchar(200),
fk_cidade integer not null,
foreign key(fk_cidade)references cidade(id),
PRIMARY KEY(id)
);



create table tipoUsuario(
id integer auto_increment not null unique,
nameTipoUsuario varchar(20) unique,
PRIMARY KEY(id)
);

