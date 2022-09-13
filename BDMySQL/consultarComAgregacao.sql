select regiao,
sum (populacao) as total
from estados
GROUP BY regiao 
ORDER BY total desc

select sum(populacao) as total from estados

select avg(populacao) as total from estados --media 