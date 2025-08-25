package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    private StudentList list;
    private StudentHardCodeDatasource datasource;
    @BeforeEach
    void setUp() {
        datasource = new StudentHardCodeDatasource();
        list = datasource.readData() ;
    }

    @Test
    void testReadData() {
        for (int i = 0; i < list.getStudents().size(); i++) {
            assertEquals("671040000" + (i+1), list.getStudents().get(i).getId());
        }
        assertEquals("First", list.getStudents().get(0).getName());
        assertEquals("Second", list.getStudents().get(1).getName());
        assertEquals("Third", list.getStudents().get(2).getName());
        assertEquals("Fourth", list.getStudents().get(3).getName());
    }

}