--1)
SELECT 
    e.emp_no AS 'Empleado Nº',
    e.apellido AS 'Empleado',
    e.salario AS 'Salario',
    d.dnombre AS 'Departamento'
FROM empleados e
JOIN departamentos d ON e.dept_no = d.dept_no
ORDER BY e.apellido;

--2)
SELECT
    e.apellido AS 'Empleado',
    d.ciudad AS 'Localidad'
FROM empleados e
JOIN departamentos d ON e.dept_no = d.dept_no
ORDER BY e.apellido;

--3)
SELECT
    d.dept_no AS 'ID',
    d.dnombre AS 'Departamento',
    AVG(e.comision) AS 'Promedio Comision'
FROM departamentos d
JOIN empleados e ON d.dept_no = e.dept_no
GROUP BY d.dept_no, d.dnombre;

--4)
SELECT
    d.dnombre AS 'Departamento',
    COUNT(e.emp_no) AS 'Cantidad Empleados'
FROM departamentos d
JOIN empleados e ON d.dept_no = e.dept_no
GROUP BY d.dnombre
HAVING COUNT(e.emp_no) > 2;

--5)
SELECT
    d.ciudad AS 'Ciudad',
    COUNT(e.emp_no) AS 'Cantidad Empleados'
FROM departamentos d
JOIN empleados e ON d.dept_no = e.dept_no
GROUP BY d.ciudad;