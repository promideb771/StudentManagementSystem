import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    @Test
    void testAddStudent() {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(1, "Morsalin"));

        assertEquals(1, manager.getTotalStudents());
    }

    @Test
    void testSearchStudent() {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(1, "Morsalin"));

        Student student = manager.searchStudent(1);

        assertNotNull(student);
        assertEquals("Morsalin", student.getName());
    }
 @Test
    void testDeleteStudent() {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(1, "Morsalin"));

        assertTrue(manager.deleteStudent(1));
    }

    @Test
    void testStudentNotFound() {

        StudentManager manager = new StudentManager();

        assertNull(manager.searchStudent(100));
    }

    @Test
    void testDeleteInvalidStudent() {

        StudentManager manager = new StudentManager();

        assertFalse(manager.deleteStudent(200));
    }
}
