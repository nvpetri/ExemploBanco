create schema db_empresa;

use db_empresa;

create table funcionarios (
id_funcionario int auto_increment not null,
nome varchar(45) not null,
cargo varchar(45)  not null,
departamento varchar(45) not null,
salario double not null,

primary key(id_funcionario)
);

insert into funcionarios (id_funcionario, nome, cargo, departamento, salario) values 
(0, "Luiz", "Desenvolvedor", "T.I", 600),
(0, "Carol", "Com Certeza", "Engenharia de Software", 450),
(0, "Vitor Hugo", "Programador", "T.I", 280);

