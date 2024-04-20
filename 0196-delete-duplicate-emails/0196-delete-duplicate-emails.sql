# Write your MySQL query statement below
delete id2 from Person id1,Person id2 where id1.email=id2.email and id2.id>id1.id;
