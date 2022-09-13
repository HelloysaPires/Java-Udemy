CREATE Table if NOT exists prefeitos(
    id int unsigned NOT NULL auto_increment,
    nome varchar(200) not null,
    cidade_id INT UNSIGNED,
    PRIMARY KEY (id),
    UNIQUE KEY (cidade_id),
    FOREIGN KEY (cidade_id) references cidade(id)
);