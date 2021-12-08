create table status_conta(
id integer auto_increment not null unique,
name varchar(200) not null,
PRIMARY KEY(id)
);

create table adm(
id integer auto_increment not null unique,
uuid integer not null,
url_avatar varchar(300),
name varchar(200) not null,
fk_usuario integer not null unique,
PRIMARY KEY(id),
foreign key(fk_usuario)references usuario(id)
);

create table artista(
id integer auto_increment not null unique,
uuid varchar(50),
nome_artista varchar(200) not null,
descricao varchar(200),
url_avatar varchar(300),
contato varchar(12) not null,
fk_status_conta integer not null,
fk_usuario integer not null unique ,
fk_endereco integer not null unique,
PRIMARY KEY(id),
foreign key(fk_usuario)references usuario(id),
foreign key(fk_status_conta)references status_conta(id)
);

create table estabelecimento(
id integer auto_increment not null unique,
nome_estabelecimento varchar(200) not null,
uuid integer,
url_avatar varchar(300),
contato varchar(12) not null,
descricao varchar(300),
fk_usuario integer not null unique,
fk_status_conta integer not null,
fk_endereco integer not null unique,
PRIMARY KEY(id),
foreign key(fk_usuario)references usuario(id),
foreign key(fk_status_conta)references status_conta(id),
foreign key(fk_endereco)references endereco(id)
);



create table chat(
id integer auto_increment not null unique,
uuid varchar(200) not null unique,
nome_genero varchar(50) not null,
fk_estabelecimento integer not null,
fk_artista integer not null,
PRIMARY KEY(id),
foreign key(fk_estabelecimento)references estabelecimento(id),
foreign key(fk_artista)references artista(id)
);

create table mensagem_chat(
id integer auto_increment not null unique,
uuid varchar(200) not null unique,
data_mensagem datetime not null,
texto varchar(200) not null,
url_imagem varchar(300),
fk_chat integer not null,
PRIMARY KEY(id),
foreign key(fk_chat)references chat(id)
);



create table status_evento(
id integer auto_increment not null unique,
nome_status_evento varchar(50) not null,
PRIMARY KEY(id)
);



create table evento(
id integer auto_increment not null unique,
uuid varchar(100) not null,
data_criacao datetime not null,
data_evento datetime not null,
descricao varchar(200),
fk_status_evento integer not null,
fk_endereco integer not null,
fk_estabelecimento integer not null,
PRIMARY KEY(id),
foreign key(fk_status_evento)references status_evento(id),
foreign key(fk_endereco)references endereco(id),
foreign key(fk_estabelecimento)references estabelecimento(id)
);

create table agendamento(
id integer auto_increment not null unique,
uuid varchar(100) not null,
data_agendamento datetime not null,
aceitacao_artista boolean default '0',
aceitacao_estabelecimento boolean default '0',
fk_evento integer not null,
fk_artista integer not null,
fk_estabelecimento integer not null,
PRIMARY KEY(id),
foreign key(fk_evento)references evento(id),
foreign key(fk_artista)references artista(id),
foreign key(fk_estabelecimento)references estabelecimento(id)
);



create table genero_musical(
id integer auto_increment not null unique,
nome_genero varchar(50) not null,
PRIMARY KEY(id)
);

create table artista_genero(
id integer auto_increment not null unique,
fk_artista integer not null,
fk_genero integer not null,
PRIMARY KEY(id),
foreign key(fk_artista)references artista(id),
foreign key(fk_genero)references genero_musical(id)
);

create table estabelecimento_genero(
id integer auto_increment not null unique,
fk_estabelecimento integer not null,
fk_genero integer not null,
PRIMARY KEY(id),
foreign key(fk_estabelecimento)references estabelecimento(id),
foreign key(fk_genero)references genero_musical(id)
);



create table favorito_artista(
id integer auto_increment not null unique,
uuid varchar(100) not null,
fk_estabelecimento integer not null,
fk_artista integer not null,
PRIMARY KEY(id),
foreign key(fk_estabelecimento)references estabelecimento(id),
foreign key(fk_artista)references artista(id)
);

create table favorito_estabelecimento(
id integer auto_increment not null unique,
uuid varchar(100) not null,
fk_estabelecimento integer not null,
fk_artista integer not null,
PRIMARY KEY(id),
foreign key(fk_estabelecimento)references estabelecimento(id),
foreign key(fk_artista)references artista(id)
);



create table avaliacao(
id integer auto_increment not null unique,
nota integer not null,
PRIMARY KEY(id)
);

create table avaliacao_estabelecimento(
id integer auto_increment not null unique,
uuid varchar(100) not null,
descricao varchar(200),
fk_estabelecimento integer not null,
fk_artista integer not null,
fk_avaliacao integer not null,
PRIMARY KEY(id),
foreign key(fk_estabelecimento)references estabelecimento(id),
foreign key(fk_artista)references artista(id),
foreign key(fk_avaliacao)references avaliacao(id)
);

create table avaliacao_artista(
id integer auto_increment not null unique,
uuid varchar(100) not null,
descricao varchar(200),
fk_estabelecimento integer not null,
fk_artista integer not null,
fk_avaliacao integer not null,
PRIMARY KEY(id),
foreign key(fk_estabelecimento)references estabelecimento(id),
foreign key(fk_artista)references artista(id),
foreign key(fk_avaliacao)references avaliacao(id)
);
