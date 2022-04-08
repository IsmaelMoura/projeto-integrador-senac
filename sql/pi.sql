use projetoint;

CREATE TABLE usuarios(
    id_usu INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(32) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE,
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

CREATE TABLE carro(
    id_ca INT PRIMARY KEY AUTO_INCREMENT,
    fabricante VARCHAR(32) NOT NULL,
    modelo VARCHAR(32) NOT NULL,
    ano VARCHAR(4) NOT NULL,
    cor VARCHAR(32) NOT NULL,
    chassi VARCHAR(17) UNIQUE,
    valor DECIMAL(50, 2),
    combustivel VARCHAR(32) NOT NULL,
    data_cad TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    id_usu INT NOT NULL,
    FOREIGN KEY(id_usu) REFERENCES usuarios(id_usu)
);

CREATE TABLE solicitacao(
	id_soli INT PRIMARY KEY AUTO_INCREMENT,
    data_soli TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status_soli VARCHAR(50) NOT NULL,
    id_cli INT NOT NULL,
    FOREIGN KEY(id_cli) REFERENCES clientes(id_cli),
    id_ca INT NOT NULL,
    FOREIGN KEY(id_ca) REFERENCES carro(id_ca)
);