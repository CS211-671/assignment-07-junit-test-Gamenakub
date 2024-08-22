package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testAddScore(){
        Student s1 = new Student("6610402272", "Game");
        s1.addScore(40);
        assertEquals(40,s1.getScore());
        s1.addScore(30);
        assertEquals(70,s1.getScore());
    }

    @Test
    void testCalculateGrade(){
        Student s1 = new Student("6610402272", "Game");
        s1.addScore(60);
        assertEquals("C", s1.grade());
    }

    @Test
    void testChangeName(){
        Student s1 = new Student("6610402272", "Game");
        s1.changeName("Sun");
        assertEquals("Sun", s1.getName());
    }

    @Test
    void TestIsId(){
        Student s1 = new Student("6610402272", "Game");
        s1.isId("6610402272");
        assertTrue(s1.isId("6610402272"));
    }

}