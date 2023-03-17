-- Buscar estudiantes y el curso al que pertenecen
SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;


-- Encontrar estudiantes que sean del pais 125

SELECT students.idStudent AS 'ID',
countries.name AS 'Nombre', 
students.last_name AS 'Apellido',
countries.name AS 'País de origen',
countries.code AS 'Codigo de País'
FROM students -- desde TABLA A
INNER JOIN countries -- juntar con TABLA B
ON students.nationality = countries.idCountries
WHERE idCountries = '125';


SELECT COUNT(*)
FROM (
    SELECT
        t1.name AS 'Nombre',
        t1.last_name AS 'Apellido',
        t2.course_code AS 'Codigo de curso',
        t3.name AS 'Curso',
        t3.credits
    FROM students t1
    INNER JOIN courses_has_students t2
    ON t1.idStudent = t2.students_id_student
    INNER JOIN courses t3
    ON t2.course_code = t3.code
    WHERE course_code = 'JAVA-1'
) subquery;



-- Contar estudiantes por cada modulo

SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits,
    t4.name AS 'Nombre del Modulo',
    t4.code AS 'Codigo de Modulo'
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN Courses t3
ON t2.course_code = t3.code
INNER JOIN Modules t4
ON t3.module_code = t4.code;

SELECT t4.code AS 'Codigo de Modulo', COUNT(*) AS 'Estudiantes en el Modulo'
FROM students t1
INNER JOIN courses_has_students t2 
ON t1.idStudent = t2.students_id_student
INNER JOIN Courses t3 
ON t2.course_code = t3.code
INNER JOIN Modules t4 
ON t3.module_code = t4.code
WHERE t4.code IN ('DB-MYSQL', 'JAVA', 'JS', 'ROLE', 'WEB-JAVA', 'INTRO-CS', 'INTRO-WEB')
GROUP BY t4.code;