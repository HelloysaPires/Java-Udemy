select e.nome, c.nome 
from empresas e, cidades_empresas ce, cidade c
where e.id = ce.empresa_id and c.id = ce.cidade_id and sede;
