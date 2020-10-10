--Criar schema ou banco
CREATE SCHEMA `zoo` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci ;

-- script para criar uma tabela

CREATE TABLE `zoo`.`animal` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `especie` VARCHAR(20) NOT NULL,
  `idade` INT NULL,
  `estavivo` TINYINT NULL,
  PRIMARY KEY (`codigo`));
  
  -- definições dos comandos
  
  DDL - Data Definition Language - Linguagem de Definição de Dados
CREATE TABLE
ALTER TABLE
DROP TABLE

DML - Data Manipulation Language - Linguagem de Manipulação de Dados
CREATE ---- INSERT ---- INSERIT
READ   ---- SELECT ---- CONSULTAR
UPDATE ---- UPDATE ---- ALTERAR
DELETE ---- DELETE ---- EXCLUIR

-- inserindo registros

USE zoo;
INSERT INTO animal (especie, idade, estavivo)values("Cachorro", 5, 1);
INSERT INTO animal (especie, idade, estavivo)values("Cavalo", 4, 1);
INSERT INTO animal (especie, idade, estavivo)values("Peixe", 3, 1);
INSERT INTO animal (especie, idade, estavivo)values( "Passaro", 5, 1);
INSERT INTO animal (especie, idade, estavivo)values("Galo", 5, 1);

-- consultando os registros da tabela
SELECT especie, idade, estavivo FROM animal;

-- buscar todas as linhas da tabela
SELECT * FROM animal;

-- 	Adiciona uma nova coluna
ALTER TABLE animal ADD COLUMN NOME VARCHAR(100);

-- Adicionando nome


UPDATE  animal SET nome = 'jojo todinho';
UPDATE  animal SET nome = 'toto' where codigo = 2;