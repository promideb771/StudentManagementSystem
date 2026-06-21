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
