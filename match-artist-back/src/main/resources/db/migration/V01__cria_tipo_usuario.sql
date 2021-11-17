create table uf(
id integer auto_increment not null unique,
name_uf varchar(2) unique,
PRIMARY KEY(id)
);

create table cidade(
id integer auto_increment not null unique,
name_cidade varchar(50),
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



create table tipo_usuario(
id integer auto_increment not null unique,
name_tipo_usuario varchar(20) unique,
PRIMARY KEY(id)
);

delete from tipo_usuario ;

create table usuario(
id integer auto_increment not null unique,
password varchar(100) not null,
email varchar(200) not null,
data_criacao datetime not null,
data_alteracao datetime not null,
token_password varchar(200),
recover_password_token varchar(200),
fk_tipo_usuario integer not null,
primary key(id),
foreign key(fk_tipo_usuario)references tipo_usuario(id)
);