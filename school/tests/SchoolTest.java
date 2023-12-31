package school.tests;

import org.junit.jupiter.api.Test;
import school.people.Student;
import school.people.Teacher;
import school.school.School;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for the School class.
 */
public class SchoolTest {
    /**
     * Tests the addTeacher method of the School class.
     */
    @Test
    public void testAddTeacher() {
        School school = new School();
        Teacher teacher = new Teacher("Mr. Brown", 40, "Math");

        school.addTeacher(teacher);

        assertEquals(1, school.getTeachers().size());
        assertEquals(teacher, school.getTeachers().get(0));
    }

    /**
     * Tests the addStudent method of the School class.
     */
    @Test
    public void testAddStudent() {
        School school = new School();
        Student student = new Student("Mike", 18, "Math");

        school.addStudent(student);

        assertEquals(1, school.getStudents().size());
        assertEquals(student, school.getStudents().get(0));
    }

    /**
     * Tests the gradeStudents method of the School class.
     */
    @Test
    public void testGradeStudents() {
        School school = new School();
        Teacher teacher = new Teacher("Mr. Brown", 40, "Math");
        Student student = new Student("Mike", 18, "Math");

        school.addTeacher(teacher);
        school.addStudent(student);

        school.gradeStudents();

        assertEquals(1, student.getGrades().size());
    }
}

