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

create table usuario(
id integer auto_increment not null unique,
uuid varchar(100) not null,
password varchar(100) not null,
email varchar(200) not null,
dataCriacao datetime not null,
dataAlteracao datetime not null,
tokenPassword varchar(200),
recoverPasswordToken varchar(200),
fk_tipoUsuario integer not null,
primary key(id),
foreign key(fk_tipoUsuario)references tipoUsuario(id)
);

create table statusConta(
id integer auto_increment not null unique,
name varchar(200) not null,
PRIMARY KEY(id)
);

create table adm(
id integer auto_increment not null unique,
uuid integer not null,
urlAvatar varchar(300),
name varchar(200) not null,
fk_usuario integer not null,
PRIMARY KEY(id),
foreign key(fk_usuario)references usuario(id)
);

create table artista(
id integer auto_increment not null unique,
uuid integer not null,
nomeArtista varchar(200) not null,
descricao varchar(200),
urlAvatar varchar(300),
contato integer not null,
fk_statusConta integer not null,
fk_usuario integer not null,
fk_endereco integer not null,
PRIMARY KEY(id),
foreign key(fk_usuario)references usuario(id),
foreign key(fk_statusConta)references statusConta(id)
);

create table estabelecimento(
id integer auto_increment not null unique,
nomeEstabelecimento varchar(200) not null,
uuid integer not null,
urlAvatar varchar(300),
contato integer not null,
descricao varchar(300),
fk_usuario integer not null,
fk_statusConta integer not null,
fk_endereco integer not null,
PRIMARY KEY(id),
foreign key(fk_usuario)references usuario(id),
foreign key(fk_statusConta)references statusConta(id),
foreign key(fk_endereco)references endereco(id)
);



create table chat(
id integer auto_increment not null unique,
uuid varchar(200) not null unique,
nomeGenero varchar(50) not null,
fk_estabelecimento integer not null,
fk_artista integer not null,
PRIMARY KEY(id),
foreign key(fk_estabelecimento)references estabelecimento(id),
foreign key(fk_artista)references artista(id)
);

create table mensagemChat(
id integer auto_increment not null unique,
uuid varchar(200) not null unique,
dataMensagem datetime not null,
texto varchar(200) not null,
urlImagem varchar(300),
fk_chat integer not null,
PRIMARY KEY(id),
foreign key(fk_chat)references chat(id)
);



create table statusEvento(
id integer auto_increment not null unique,
nomeStatusEvento varchar(50) not null,
PRIMARY KEY(id)
);



create table evento(
id integer auto_increment not null unique,
uuid varchar(100) not null,
dataCriacao datetime not null,
dataEvento datetime not null,
descricao varchar(200),
fk_statusEvento integer not null,
fk_endereco integer not null,
fk_estabelecimento integer not null,
PRIMARY KEY(id),
foreign key(fk_statusEvento)references statusEvento(id),
foreign key(fk_endereco)references endereco(id),
foreign key(fk_estabelecimento)references estabelecimento(id)
);

create table agendamento(
id integer auto_increment not null unique,
uuid varchar(100) not null,
dataAgendamento datetime not null,
aceitacaoArtista boolean default '0',
aceitacaoEstabelecimento boolean default '0',
fk_evento integer not null,
fk_artista integer not null,
fk_estabelecimento integer not null,
PRIMARY KEY(id),
foreign key(fk_evento)references evento(id),
foreign key(fk_artista)references artista(id),
foreign key(fk_estabelecimento)references estabelecimento(id)
);



create table generoMusical(
id integer auto_increment not null unique,
nomeGenero varchar(50) not null,
PRIMARY KEY(id)
);

create table artista_genero(
id integer auto_increment not null unique,
fk_artista integer not null,
fk_genero integer not null,
PRIMARY KEY(id),
foreign key(fk_artista)references artista(id),
foreign key(fk_genero)references generoMusical(id)
);

create table estabelecimento_genero(
id integer auto_increment not null unique,
fk_estabelecimento integer not null,
fk_genero integer not null,
PRIMARY KEY(id),
foreign key(fk_estabelecimento)references estabelecimento(id),
foreign key(fk_genero)references generoMusical(id)
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







