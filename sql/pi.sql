/*
	Script do projeto integrador de concessionário de luxo;
    Curso Técnico de Informática - Senac Tatuapé;
	Participantes:
		Aryon Rabello
        Ismael Moura
        Heder Santos
        Cassio Braga
        Djeniffer Vidal;
*/

/* Criação do banco de dados */
CREATE DATABASE projetoint;

/* Selecionar o banco de dados */
USE projetoint;

/* CRIAÇÃO DAS TABELAS */

CREATE TABLE usuarios(
    id_usu INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(32) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    telefone VARCHAR(20) NOT NULL,
    senha VARCHAR(300) NOT NULL,
    perfil VARCHAR(50) NOT NULL
);

CREATE TABLE clientes(
    id_cli INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(32) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
    telefone VARCHAR(20) NOT NULL,
    senha VARCHAR(300) NOT NULL
);

CREATE TABLE carros(
    id_car INT PRIMARY KEY AUTO_INCREMENT,
    fabricante VARCHAR(32) NOT NULL,
    modelo VARCHAR(32) NOT NULL,
    ano VARCHAR(4) NOT NULL,
    cor VARCHAR(32) NOT NULL,
    combustivel VARCHAR(32) NOT NULL,
    valor DECIMAL(50, 2),
    data_cad TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE solicitacao(
	id_soli INT PRIMARY KEY AUTO_INCREMENT,
    data_soli TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    nome VARCHAR(32) NOT NULL,
    email VARCHAR(50) NOT NULL,
    carro VARCHAR(20) NOT NULL
);

/* ---------- */

/* CRUD CREATE */

INSERT INTO usuarios(nome, email, telefone, senha, perfil)
VALUES(
    'teste',
    'testsse@email.com',
    '32617412',
    MD5('123'),
    'admin'
);

INSERT INTO usuarios(nome, email, telefone, senha, perfil)
VALUES(
    'Ismael',
    'ismael@email.com',
    '32617412',
    MD5('123'),
    'admin'
);

INSERT INTO clientes(nome, email, telefone, senha)
VALUES(
    'teste',
    'teste@email.com',
    '(11) 91234-5678',
    MD5('123')
);

INSERT INTO carros(fabricante, modelo, ano, cor, combustivel, valor)
VALUES(
	'teste',
    'teste',
    '2022',
    'teste',
    'elétrico',
    '5000000'
);

INSERT INTO solicitacao(cliente, carro)
VALUES(
	1,
    1
);

/* ---------- */

/* CRUD READ */

SELECT * FROM usuarios;
SELECT * FROM clientes;
SELECT * FROM carros;
SELECT * FROM solicitacao;

/* ---------- */

/* CRUD UPDATE */
/* UPDATE na tabela usuarios */
UPDATE
    usuarios
SET
    nome = 'teste1',
    email = 'teste1@email.com',
    senha = MD5('1234'),
    perfil = 'Atendente'
WHERE
    id_usu = 1;
    
/* ---------- */
/* UPDATE na tabela clientes */
    
UPDATE
	clientes
SET
	nome = 'teste1',
    email = 'teste1@email.com',
    telefone = '(21) 91234-5678',
    senha = md5('1234')
WHERE
	id_cli = 1;
    
/* ---------- */
/* UPDATE na tabela carros */

UPDATE
	carros
SET
	fabricante = 'teste1',
    modelo = 'teste1',
    ano = 2023,
    cor = 'teste1',
    chassi = '22222222222222222',
    valor = '600000',
    combustivel = 'gasolina'
WHERE
	id_ca = 1;

/* ---------- */
/* UPDATE na tabela solicitacao */

UPDATE
	solicitacao
SET
	status_soli = 'Entregue'
WHERE
	id_soli = 1;

/* ---------- */
/* CRUD DELETE */
/* DELETE na tabela usuarios */

DELETE
FROM
    usuarios
WHERE
    id_usu = 1;

/* ---------- */
/* DELETE na tabela clientes */

DELETE
FROM
	clientes
WHERE
	id_cli = 1;

/* ---------- */
/* DELETE na tabela carros */

DELETE
FROM
	carros
WHERE
	id_ca = 1;

/* ---------- */
/* DELETE na tabela solicitacao */

DELETE
FROM
	solicitacao
WHERE
	id_soli = 1;

/* ---------- */
/* ---------- */
/* DROP das tabelas */

DROP TABLE usuarios;
DROP TABLE clientes;
DROP TABLE carros;
DROP TABLE solicitacao;

/* ---------- */

describe solicitacao;

insert into solicitacao(nome, email, carro) values('bbbbbbb', 'dsdabbbbbs@gmail.com', 'Bugatti');

select * from solicitacao order by data_soli;