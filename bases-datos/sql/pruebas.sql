CREATE DATABASE IF NOT EXISTS pruebas;

USE pruebas;

CREATE TABLE
    IF NOT EXISTS agenda (
        apellido VARCHAR(30) NOT NULL,
        nombre VARCHAR(20) NOT NULL,
        domicilio VARCHAR(30) NOT NULL,
        telefono CHAR(9) NOT NULL,
        prefijo VARCHAR(5) DEFAULT '+0034'
    );

INSERT INTO agenda
VALUES
    ('ALVAREZ', 'ALBERTO', 'COLON 123', 423456798, '+0034'),
    ('JUAREZ', 'JUAN', 'AVELLANEDA 135', 445878778, '+0034'),
    ('LOPEZ', 'MARIA', 'URQUIZA 333', 454545445, '+0047'),
    ('LOPEZ', 'JOSE', 'URQUIZA 333', 423456798, '+0034'),
    ('SALAS', 'SUSANA', 'GRAL. PAZ 1234', 412345612, '+0036');

UPDATE agenda SET nombre = 'JOSE' WHERE nombre = 'JUAN';

DELETE FROM agenda WHERE telefono = 423456798;

DELETE FROM agenda;

INSERT INTO agenda VALUE ('GARCIA', 'INAKI', 'ABC 123', 698493284, '+0034');

UPDATE agenda SET apellido = 'GARCIA' WHERE apellido = 'LOPEZ';

UPDATE agenda SET nombre = 'ROBERTO' WHERE nombre = 'JOSE';

UPDATE agenda SET telefono = '123456789' WHERE telefono = '423456798' AND nombre = 'ALBERTO';