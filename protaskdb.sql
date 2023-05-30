/* EL NOMBRE DE LA BD ES = 
protaskdb 
PORFAVOR COLOQUE ESE NOMBRE*/
/*CREAMOS LA TABLA DE USUARIOS*/
CREATE TABLE tb_usuario (
  id_user INT PRIMARY KEY AUTO_INCREMENT,
  clave_user VARCHAR(20),
  name_user VARCHAR(20),
  cor_user VARCHAR(50),
  fec_cr_user DATETIME NULL
);
/*LA TABLA DE PROYECTOS*/
CREATE TABLE tb_proyecto (
  id_proy INT PRIMARY KEY AUTO_INCREMENT,
  desc_proy VARCHAR(150) NULL,
  titulo_proy VARCHAR(120),
  est_proy INT
);
/*LA TBALA DE TAREAS*/
CREATE TABLE tb_tarea (
  id_tar INT PRIMARY KEY AUTO_INCREMENT,
  tit_tar VARCHAR(120),
  desc_tar VARCHAR(150),
  fec_cr_tar DATETIME,
  fec_vn_tar DATETIME,
  est_tar INT
);
/*DETALLE USUARIOO PROYECTO*/
CREATE TABLE tb_usuario_proyecto (
  id_user_proy INT AUTO_INCREMENT PRIMARY KEY,
  id_user INT,
  id_proy INT,
  admin BOOLEAN,
  participante BOOLEAN,
  FOREIGN KEY (id_user) REFERENCES tb_usuario(id_user),
  FOREIGN KEY (id_proy) REFERENCES tb_proyecto(id_proy)
);
/*DETALLE USUARIO PROYECTO TAREA*/
create  TABLE tb_proy_user_tar(
  id_put INT AUTO_INCREMENT PRIMARY KEY,
  id_user INT,
  id_proy INT,
  id_tar INT,
  descripcion VARCHAR(150),
  FOREIGN KEY (id_user) REFERENCES tb_usuario(id_user),
  FOREIGN KEY (id_proy) REFERENCES tb_proyecto(id_proy),
  FOREIGN KEY (id_tar) REFERENCES tb_tarea(id_tar)
);

/*INCERAMOS LOS DATOS */
/*USUARIO*/
INSERT INTO tb_usuario (clave_user, name_user, cor_user, fec_cr_user)
VALUES
    ('pass123', 'John Doe', 'johndoe@example.com', NOW()),
    ('qwerty987', 'Alice Smith', 'alice.smith@example.com', NOW()),
    ('secretword', 'Robert Johnson', 'robert.johnson@example.com', NOW()),
    ('myp@ssw0rd', 'Emily Davis', 'emily.davis@example.com', NOW()),
    ('123456', 'Michael Brown', 'michael.brown@example.com', NOW());
/*PROYECTOS*/
INSERT INTO tb_proyecto (desc_proy, titulo_proy, est_proy)
VALUES
    ('Desarrollo de una aplicación móvil', 'Proyecto MobileApp', 1),
    ('Investigación en medicina genómica', 'Proyecto Genomics', 2),
    ('Diseño de un sistema de gestión de inventario', 'Proyecto InventoryMS', 3),
    ('Optimización de algoritmos de aprendizaje automático', 'Proyecto MLAlgorithms', 1),
    ('Implementación de un sistema de seguridad biométrico', 'Proyecto BiometricSecurity', 2);
/*TAREAS*/
INSERT INTO tb_tarea (tit_tar, desc_tar, fec_cr_tar, fec_vn_tar, est_tar)
VALUES
    ('Análisis de requisitos del proyecto', 'Realizar un análisis detallado de los requisitos del proyecto', NOW(), NOW(), 1),
    ('Diseño de la interfaz de usuario', 'Crear un diseño atractivo y funcional para la interfaz de usuario', NOW(), NOW(), 2),
    ('Implementación del módulo principal', 'Desarrollar el módulo principal del proyecto utilizando tecnologías modernas', NOW(), NOW(), 1),
    ('Pruebas de rendimiento y calidad', 'Realizar pruebas exhaustivas para garantizar el rendimiento y calidad del sistema', NOW(), NOW(), 3),
    ('Despliegue en entorno de producción', 'Realizar el despliegue del sistema en un entorno de producción estable', NOW(), NOW(), 2);
/*tb_proy_user_tar*/
INSERT INTO tb_proy_user_tar (id_user, id_proy, id_tar, descripcion)
VALUES
    (1, 1, 1, 'Usuario 1 asignado al Proyecto 1 - Tarea 1'),
    (2, 2, 3, 'Usuario 2 asignado al Proyecto 2 - Tarea 3'),
    (3, 3, 2, 'Usuario 3 asignado al Proyecto 3 - Tarea 2'),
    (4, 1, 4, 'Usuario 4 asignado al Proyecto 1 - Tarea 4'),
    (5, 2, 5, 'Usuario 5 asignado al Proyecto 2 - Tarea 5');

/**/
INSERT INTO tb_usuario_proyecto (id_user, id_proy, admin, participante)
VALUES
    (1, 1, true, false),
    (2, 1, false, true),
    (3, 2, true, true),
    (4, 2, true, true),
    (5, 3, false, true);

    
