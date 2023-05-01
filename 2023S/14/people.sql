use x;
drop table People;
create table People (
  firstName varchar(10),
  lastName varchar(20),
  id       int  primary key
);

insert into People values ('Dov', 'Kruger', 1);
insert into People values ('Nyamkhuu', 'D', 2);

/*
create table classes (
  name varchar(20),
  id   int
);

  create table enrollment (
    studentid int,     1
    classid            1000
  )
*/