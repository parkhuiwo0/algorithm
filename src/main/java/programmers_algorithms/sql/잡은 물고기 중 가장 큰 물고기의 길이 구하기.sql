SELECT concat(t.LENGTH, "cm") as 'MAX_LENGTH' FROM FISH_INFO t order by t.LENGTH is NULL asc, LENGTH desc limit 1;
