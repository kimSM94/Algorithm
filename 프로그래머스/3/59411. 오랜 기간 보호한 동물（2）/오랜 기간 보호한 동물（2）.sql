select * from (
SELECT B.ANIMAL_ID, B.NAME
from ANIMAL_INS A, ANIMAL_OUTS B
where A.ANIMAL_ID = B.ANIMAL_ID
order by B.DATETIME-A.DATETIME desc)
where rownum <=2