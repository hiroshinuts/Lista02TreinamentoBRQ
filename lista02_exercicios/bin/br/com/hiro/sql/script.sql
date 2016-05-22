drop database if exists lista02;
create database lista02;
use lista02;

create table aluno(

	idaluno integer auto_increment,
	nome varchar(50) not null,
	cpf varchar(50) not null,
	primary key(idaluno));
	
desc aluno;
	
