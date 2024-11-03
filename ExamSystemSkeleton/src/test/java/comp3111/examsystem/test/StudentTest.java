package comp3111.examsystem.entity;

import comp3111.examsystem.entity.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        String username = "test";
        String password = "password123";
        String gender = "Female";
        String name = "Jane Doe";
        String department = "Computer Science";
        Student student = new Student(username, password, gender, name, department);
        assertEquals(username, student.getUsername());
        assertEquals(password, student.getPassword());
        assertEquals(gender, student.getGender());
        assertEquals(name, student.getName());
        assertEquals(department, student.getDepartment());
    }

    @Test
    public void testStudentEmptyValues() {
        Student student = new Student("", "", "", "", "");
        assertEquals("", student.getUsername());
        assertEquals("", student.getPassword());
        assertEquals("", student.getGender());
        assertEquals("", student.getName());
        assertEquals("", student.getDepartment());
    }

}