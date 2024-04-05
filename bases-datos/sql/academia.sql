CREATE DATABASE IF NOT EXISTS academia;

USE academia;

CREATE TABLE
    IF NOT EXISTS alumno (
        id_alumno INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(20) NOT NULL,
        apellidos VARCHAR(40) NOT NULL,
        dni CHAR(9) UNIQUE NOT NULL,
        direccion VARCHAR(50) NOT NULL,
        fecha_nacimiento DATE NOT NULL,
        sexo ENUM ('H', 'M') NOT NULL,
        id_curso INT UNSIGNED,
        FOREIGN KEY (id_curso) REFERENCES curso (id_curso)
    );

CREATE TABLE
    IF NOT EXISTS profesor (
        id_profesor INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(20) NOT NULL,
        apellidos VARCHAR(40) NOT NULL,
        dni CHAR(9) UNIQUE NOT NULL,
        direccion VARCHAR(50) NOT NULL,
        titulo ENUM ('LDO', 'DDO', 'CFGS') NOT NULL,
        precio_hora DECIMAL(6, 2) UNSIGNED NOT NULL
    );

CREATE TABLE
    IF NOT EXISTS curso (
        id_curso INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(20) NOT NULL,
        cantidad_alumnos INT UNSIGNED DEFAULT 10 CHECK (cantidad_alumnos >= 10),
        id_profesor INT UNSIGNED NOT NULL,
        fecha_inicio DATE NOT NULL,
        fecha_fin DATE NOT NULL CHECK (fecha_inicio < fecha_fin),
        total_horas INT UNSIGNED NOT NULL CHECK (total_horas >= 80),
        FOREIGN KEY (id_profesor) REFERENCES profesor (id_profesor)
    );