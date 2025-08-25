package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList list;
    @BeforeEach
    void setUp() {
        list = new StudentList();

    }
    @Test
    void testAddNewStudent() {
        list.addNewStudent("6xxxxxx", "StudentTest");
        Student s = list.findStudentById("6xxxxxx");
        assertEquals("6xxxxxx", s.getId());
        assertEquals("StudentTest", s.getName());
        assertEquals(1, list.getStudents().size());

        list.addNewStudent("6xxxxxx", "StudentTest_Dub");
        assertEquals(1, list.getStudents().size());

    }

    @Test
    void testFindStudentById() {
        list.addNewStudent("6xxxxxx", "StudentTest");
        assertNotNull(list.findStudentById("6xxxxxx"));
    }

    @Test
    void testGiveScoreToID() {
        list.addNewStudent("6xxxxxx", "StudentTest");
        list.giveScoreToId("6xxxxxx", 45.15);
        assertEquals(45.15, list.findStudentById("6xxxxxx").getScore());
    }

    @Test
    void testFilterByName() {
        list.addNewStudent("6xxxxx1", "Mr.Gun");
        list.addNewStudent("6xxxxx2", "Ms.Pond");
        list.addNewStudent("6xxxxx3", "Mr.Wit");

        StudentList filteredList = list.filterByName("Mr");
        assertEquals(2, filteredList.getStudents().size());
    }

    @Test
    void testViewGradeOfID() {
        list.addNewStudent("6xxxxxx", "StudentTest");
        list.giveScoreToId("6xxxxxx", 90.15);
        assertEquals("A", list.viewGradeOfId("6xxxxxx"));
    }
}