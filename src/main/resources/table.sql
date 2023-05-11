drop table if exists employee;
 create table employee (
 emp_id integer not null auto_increment,
  doj date not null,
   emp_name varchar(255) not null,
    salary float not null, 
    primary key (emp_id)) ;
    insert into employee values (1,"2023-02-23","bharath",50000.0);
    insert into employee values (2,"2020-01-23","nihar",25000.0);
    insert into employee values (3,"2021-12-10","durga",35000.0);
    insert into employee values (4,"2020-02-05","rahul",15000.0);
    insert into employee values (5,"2019-03-30","arun",50000.0);
    insert into employee values (6,"2018-04-26","sweety",40000.0);
    insert into employee values (7,"2020-07-25","sheti",20000.0);
    insert into employee values (8,"2021-08-23","alice",30000.0);
    insert into employee values (9,"2022-12-20","jhon",10000.0);
    insert into employee values (10,"2023-12-01","Adrew",15000.0);
    insert into employee values (11,"2022-02-09","Mathew",25000.0);
    insert into employee values (12,"2021-06-10","rushab",51000.0);
    insert into employee values (13,"2020-07-23","prathyusha",58000.0);
    insert into employee values (14,"2023-08-26","mayuri",47000.0);
    insert into employee values (15,"2022-09-28","morya",56000.0);
    insert into employee values (16,"2021-10-24","sampath",57000.0);
    insert into employee values (17,"2020-11-25","Jack",89000.0);
    insert into employee values (18,"2022-12-26","Jill",100000.0);
    insert into employee values (19,"2023-12-02","Brownie",50000.0);
  insert into employee values (20,"2023-02-23","Rinti",50000.0);