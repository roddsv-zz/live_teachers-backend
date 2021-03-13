INSERT INTO tb_students (name, age) VALUES ('Lucas Nobre', 17);
INSERT INTO tb_students (name, age) VALUES ('Hugo Gomes', 23);
INSERT INTO tb_students (name, age) VALUES ('Susan Campos', 20);
INSERT INTO tb_students (name, age) VALUES ('Rômulo Albuquerque', 19);
INSERT INTO tb_students (name, age) VALUES ('Nathalia Batista', 20);
INSERT INTO tb_students (name, age) VALUES ('Douglas Sousa', 24);
INSERT INTO tb_students (name, age) VALUES ('Sanny Amora', 23);


INSERT INTO tb_teachers (name, subject, description, hour_price, image_uri) VALUES ('Rodrigo Soares', 'Math', 'Licenciado em Matemática. Possui 11 anos de experiência no ensino de Ciências Exatas.', 45.0, 'https://user-images.githubusercontent.com/56835809/111044272-3fdcf100-8426-11eb-8cb7-057f60b33fb7.jpeg');
INSERT INTO tb_teachers (name, subject, description, hour_price, image_uri) VALUES ('Bruno Soares', 'Physics', 'Analista de Sistemas. Ensina Física há 15 anos para alunos de Ensino Médio e Superior.', 55.0, 'https://user-images.githubusercontent.com/56835809/111044292-597e3880-8426-11eb-82b9-f765b07a2b36.png');
INSERT INTO tb_teachers (name, subject, description, hour_price, image_uri) VALUES ('William Lucas', 'Biology', 'Professor de Biologia há 10 anos. Graduado em Ciências Biológicas.', 50.0, 'https://user-images.githubusercontent.com/56835809/111044208-eaa0df80-8425-11eb-91e9-2f032991d36d.png');
INSERT INTO tb_teachers (name, subject, description, hour_price, image_uri) VALUES ('Matheus Holanda', 'Chemistry', 'Licenciado em Física. Possui mais de 10 anos de experiência com ciências exatas.', 50.0, 'https://user-images.githubusercontent.com/56835809/111044299-6864eb00-8426-11eb-881c-fdb22f98a7e3.png');


INSERT INTO tb_classes (subject, moment, number_of_hours) VALUES ('Math', TIMESTAMP WITH TIME ZONE '2021-03-15T15:00:00Z', 2.0);
INSERT INTO tb_classes (subject, moment, number_of_hours) VALUES ('Physics', TIMESTAMP WITH TIME ZONE '2021-03-22T11:00:00Z', 1.5);
INSERT INTO tb_classes (subject, moment, number_of_hours) VALUES ('Biology', TIMESTAMP WITH TIME ZONE '2021-03-19T09:30:00Z', 3.0);
INSERT INTO tb_classes (subject, moment, number_of_hours) VALUES ('Chemistry', TIMESTAMP WITH TIME ZONE '2021-03-21T10:00:00Z', 2.5);

INSERT INTO tb_class_student_teacher_id (class_id, student_id, teacher_id) VALUES (1 , 1, 1);
INSERT INTO tb_class_student_teacher_id (class_id, student_id, teacher_id) VALUES (2 , 2, 2);
INSERT INTO tb_class_student_teacher_id (class_id, student_id, teacher_id) VALUES (3 , 3, 3);
INSERT INTO tb_class_student_teacher_id (class_id, student_id, teacher_id) VALUES (4 , 4, 4);