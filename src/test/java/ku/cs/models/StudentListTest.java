package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void testAddNewStudentWithTwoParameter(){
        StudentList students = new StudentList();
        students.addNewStudent("6610401234", "Keam");
        Student student = students.findStudentById("6610401234");
        assertNotNull(student);
    }

    @Test
    void testAddNewStudentWithThreeParameter(){
        StudentList students = new StudentList();
        students.addNewStudent("6610402272", "Game", 80);
        Student student = students.findStudentById("6610402272");
        assertNotNull(student);
    }

    @Test
    void testFindStudentById(){
        StudentList students = new StudentList();
        students.addNewStudent("6610402272", "Game", 80);
        students.addNewStudent("6610401993", "Sun");
        students.addNewStudent("6610401234", "Keam");
        Student student = students.findStudentById("6610401993");
        assertNotNull(student);
    }

    @Test
    void testGiveScoreToId(){
        StudentList students = new StudentList();
        students.addNewStudent("6610402272", "Game", 80);
        students.addNewStudent("6610401993", "Sun");
        students.addNewStudent("6610401234", "Keam");
        students.giveScoreToId("6610402272", 20.00);
        double actual = students.findStudentById("6610402272").getScore();
        assertEquals(100.00, actual);
    }

    @Test
    void testViewGradeOfId(){
        StudentList students = new StudentList();
        students.addNewStudent("6610402272", "Game", 80);
        students.addNewStudent("6610401993", "Sun");
        students.addNewStudent("6610401234", "Keam");
        assertEquals("A", students.viewGradeOfId("6610402272"));
    }

}