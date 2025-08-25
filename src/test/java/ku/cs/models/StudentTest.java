package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.15 คะแนน")
    public void testAddScore() {
        Student s = new Student("6710404854", "Gun");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testCalculateGrade(){
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testChangeName() {
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.changeName("StudentTest");
        assertEquals("StudentTest", s.getName());
    }

    @Test
    void testIsNameContains() {
        Student s = new Student("6xxxxxxxx", "StudentTest");
        assertTrue(s.isNameContains("StudentTest"));
    }

    @Test
    void testIsID() {
        Student s = new Student("6xxxxxxxx", "StudentTest");
        assertTrue(s.isId("6xxxxxxxx"));
    }
}