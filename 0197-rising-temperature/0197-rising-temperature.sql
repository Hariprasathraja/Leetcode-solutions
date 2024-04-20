# Write your MySQL query statement below
select p1.id from Weather p1,Weather p2 where p1.temperature>p2.temperature and DATEDIFF(p1.recordDate,p2.recordDate)=1;