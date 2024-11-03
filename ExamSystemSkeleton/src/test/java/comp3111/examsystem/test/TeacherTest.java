package comp3111.examsystem.test;

import comp3111.examsystem.entity.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    private Teacher teacher;

    @BeforeEach
    void setUp() {
        teacher = new Teacher("john_doe", "password123", "Male", "John Doe", "Professor", "Computer Science");
    }

    @Test
    void testGetUsername() {
        assertEquals("john_doe", teacher.getUsername());
    }

    @Test
    void testGetPassword() {
        assertEquals("password123", teacher.getPassword());
    }

    @Test
    void testGetGender() {
        assertEquals("Male", teacher.getGender());
    }

    @Test
    void testGetName() {
        assertEquals("John Doe", teacher.getName());
    }

    @Test
    void testGetPostition() {
        assertEquals("Professor", teacher.getPostition());
    }

    @Test
    void testGetDepartment() {
        assertEquals("Computer Science", teacher.getDepartment());
    }

    @Test
    void testSetUsername() {
        teacher.setUsername("jane_doe");
        assertEquals("jane_doe", teacher.getUsername());
    }

    @Test
    void testSetPassword() {
        teacher.setPassword("newpassword");
        assertEquals("newpassword", teacher.getPassword());
    }
}