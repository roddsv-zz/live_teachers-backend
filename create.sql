create table tb_class_student_teacher_id (class_id int8 not null, teacher_id int8 not null, student_id int8 not null, primary key (class_id, student_id));
create table tb_classes (id int8 generated by default as identity, moment timestamp, number_of_hours float8, subject varchar(255), primary key (id));
create table tb_students (id int8 generated by default as identity, age int4, name varchar(255), primary key (id));
create table tb_teachers (id int8 generated by default as identity, description varchar(255), hour_price float8, image_uri varchar(255), name varchar(255), subject varchar(255), primary key (id));
alter table if exists tb_class_student_teacher_id add constraint FKfrb2hva5ryti53w6u0fe5y5oe foreign key (teacher_id) references tb_teachers;
alter table if exists tb_class_student_teacher_id add constraint FKthwyoryv6toyx06v34n701jr7 foreign key (class_id) references tb_classes;
alter table if exists tb_class_student_teacher_id add constraint FKdrrrxmolfsdu95ei2x63uvnh4 foreign key (student_id) references tb_students;