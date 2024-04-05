CREATE DATABASE IF NOT EXISTS matriculas;

USE matriculas;

CREATE TABLE
    IF NOT EXISTS Alumno (
        numero_matricula INT (10) UNSIGNED NOT NULL AUTO_INCREMENT,
        nombre VARCHAR(60) DEFAULT NULL,
        fecha_nacimiento DATE DEFAULT NULL,
        telefono CHAR(12) DEFAULT NULL,
        PRIMARY KEY (numero_matricula)
    );

CREATE TABLE
    IF NOT EXISTS Recibe (
        numero_matricula INT (10) UNSIGNED NOT NULL AUTO_INCREMENT,
        codigo_asignatura INT (5) NOT NULL,
        curso_escolar CHAR(5) NOT NULL,
        PRIMARY KEY (
            numero_matricula,
            codigo_asignatura,
            curso_escolar
        )
    );

CREATE TABLE
    IF NOT EXISTS Asignatura (
        codigo_asignatura INT (5) NOT NULL AUTO_INCREMENT,
        nombre VARCHAR(30) DEFAULT NULL,
        id_profesor INT (5) UNSIGNED DEFAULT NULL,
        PRIMARY KEY (codigo_asignatura)
    );

CREATE TABLE
    IF NOT EXISTS Profesor (
        id_profesor INT (5) UNSIGNED NOT NULL AUTO_INCREMENT,
        nif CHAR(10) UNIQUE,
        nombre VARCHAR(60) DEFAULT NULL,
        especialidad VARCHAR(40) DEFAULT NULL,
        telefono CHAR(12) DEFAULT NULL,
        PRIMARY KEY (id_profesor)
    );

ALTER TABLE Recibe ADD CONSTRAINT FK_NUMERO_MATRICULA FOREIGN KEY (numero_matricula) REFERENCES Alumno (numero_matricula);

ALTER TABLE Recibe ADD CONSTRAINT FK_CODIGO_ASIGNATURA FOREIGN KEY (codigo_asignatura) REFERENCES Asignatura (codigo_asignatura);

ALTER TABLE Asignatura ADD CONSTRAINT FK_ID_PROFESOR FOREIGN KEY (id_profesor) REFERENCES Profesor (id_profesor);