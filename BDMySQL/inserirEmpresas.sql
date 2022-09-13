alter table empresas modify cnpj varchar(20);

insert into empresas (nome, cnpj)
values ('Bradesco', 34632165126746), 
       ('Vale', 9474979479497957), 
       ('Cielo', 854785485485458);

desc empresas;

insert into cidades_empresas (empresa_id, cidade_id, sede)
values (1, 2, 1), (1, 3, 0), (2, 2, 0), (2, 3, 1);
