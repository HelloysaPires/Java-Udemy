insert into cidade (nome, area, estado_id)
values ('Sao Bernardo do Campo', 795.2, 320)

INSERT INTO cidade(nome, area, estado_id)
VALUES('Caruaru', 920.6, (select id from estados where sigla = 'PE'))   

INSERT INTO cidade(nome, area, estado_id)
VALUES('Goiânia', 1102.6, (select id from estados where sigla = 'PE')); 

select * from cidade
