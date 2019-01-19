/*Criação do banco*/
CREATE DATABASE inventorymanager;

USE inventorymanager;

/*Criação das tabelas*/
CREATE TABLE fornecedores(
    nome VARCHAR(45),
    email VARCHAR (30),
    cnpj CHAR(18),
    primary key(cnpj)
);

CREATE TABLE produtosFornecedor(
	cnpj CHAR(18),
    preco DECIMAL,
    codigo VARCHAR(30),
    PRIMARY KEY(cnpj, codigo),
    FOREIGN KEY (cnpj) REFERENCES fornecedor(cnpj),
    FOREIGN KEY (codigo) REFERENCES produto(codigo),    
);

CREATE TABLE Produtos (
	codigo VARCHAR(30),
    nome VARCHAR(50),
    PRIMARY KEY(codigo)
);

CREATE TABLE telefoneFornecedor(
    cnpjFornecedor CHAR(18) NOT NULL,
    telefone VARCHAR(20),
    PRIMARY KEY(telefone),
    FOREIGN KEY(cnpjFornecedor) REFERENCES fornecerdor(cnpj)
);


DROP DATABASE inventorymanager;
DROP TABLE fornecedores;
DROP TABLE telefoneFornecedor;
DROP TABLE produtos;
DROP TABLE produtosFornecedor;

/*QUERYS*/
SELECT * FROM produtos;
SELECT * FROM fornecedores;
SELECT * FROM telefoneFornecedor;
SELECT COUNT(telefone) AS telefoneCount FROM telefonefornecedor;
SELECT cnpj FROM fornecedores WHERE nome = 'SSM Logística';
UPDATE fornecedores SET nome = 'fcdsf', email = 'dfsfsfs@sfs.com' WHERE cnpj = '88.888.888/8888-88';

INSERT INTO telefonefornecedor(cnpjFornecedor, telefone) VALUES 
('51.036.792/0001-95','(83) 99224-8524'),
('62.844.817/0001-01','(83) 99133-0420'),
('72.672.537/0001-09','(83) 99298-7849'),
('56.585.925/0001-04','(83) 99641-3015'),
('98.312.348/0001-19','(83) 99589-0472'),
('08.026.062/0001-84','(83) 99278-0892'),
('77.184.148/0001-58','(84) 99132-1085'),
('15.366.832/0001-01','(83) 99630-5443'),
('65.441.001/0001-17','(83) 99605-5849'),
('11.218.238/0001-04','(83) 99297-6918'),
('81.851.556/0001-93','(83) 99574-1235'),
('70.152.880/0001-05','(83) 99941-9954'),
('51.036.792/0001-95','(83) 99087-4908'),
('62.844.817/0001-01','(83) 99640-8311'),
('72.672.537/0001-09','(84) 99282-6268'),
('56.585.925/0001-04','(83) 99810-5112'),
('98.312.348/0001-19','(83) 99917-0076'),
('08.026.062/0001-84','(83) 99772-9130'),
('77.184.148/0001-58','(83) 99586-2759'),
('15.366.832/0001-01','(83) 99664-6817'),
('65.441.001/0001-17','(84) 99034-1920'),
('11.218.238/0001-04','(84) 99207-4565'),
('81.851.556/0001-93','(84) 99793-5269'),
('70.152.880/0001-05','(84) 99357-9051'),
('51.036.792/0001-95','(84) 99909-7806'),
('72.672.537/0001-09','(84) 99623-7197'),
('98.312.348/0001-19','(84) 99015-6635'),
('08.026.062/0001-84','(84) 99576-4484'),
('15.366.832/0001-01','(84) 99515-5907'),
('11.218.238/0001-04','(84) 99774-7139'),
('70.152.880/0001-05','(84) 99690-1937'),
('51.036.792/0001-95','(84) 99007-5332'),
('72.672.537/0001-09','(84) 99362-9795'),
('98.312.348/0001-19','(84) 99060-7221'),
('08.026.062/0001-84','(84) 99228-2309'),
('15.366.832/0001-01','(84) 99303-3660'),
('11.218.238/0001-04','(84) 99801-8333'),
('70.152.880/0001-05','(84) 99882-0602'),
('62.844.817/0001-01','(84) 99846-8236'),
('56.585.925/0001-04','(84) 99578-4425'),
('77.184.148/0001-58','(84) 99186-5278'),
('65.441.001/0001-17','(84) 99544-3481'),
('81.851.556/0001-93','(84) 99812-2233');

INSERT INTO fornecedores(nome, cnpj, email) VALUES 
('SSM Logística','51.036.792/0001-95','ssm_logística@hotmail.com'),
('LogikPress','62.844.817/0001-01','logikpress@outlook.com'),
('PrimeCargas','72.672.537/0001-09','primecargas@hotmail.com'),
('Prestax','56.585.925/0001-04','prestax@gmail.com'),
('AtivvaCargas','98.312.348/0001-19','ativvacargas@hotmail.com'),
('Smartplus','08.026.062/0001-84','smartplus@gmail.com'),
('Hangar Cargas','77.184.148/0001-58','hangar_cargas@gmail.com'),
('TransFull','15.366.832/0001-01','transfull@hotmail.com'),
('AltaTime','65.441.001/0001-17','altatime@outlook.com'),
('Aromatizul','11.218.238/0001-04','aromatizul@gmail.com'),
('Armagenhamento','81.851.556/0001-93','armagenhamento@gmail.com'),
('Brasmova','70.152.880/0001-05','brasmova@outlook.com');

