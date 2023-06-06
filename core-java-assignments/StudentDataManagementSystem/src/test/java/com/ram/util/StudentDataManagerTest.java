package com.ram.util;

import com.ram.exceptions.InsufficientDataException;
import com.ram.beans.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class StudentDataManagerTest {
    private  DataManager dm;
    @Before
    public void setUp(){
        dm = new StudentDataManager();
    }
    @Test
    public  void testPopulateData(){
        //Given
//        DataManager dm = new StudentDataManager();
        //then
//        final List<Student> studentsList = dm.populateData("/StudentDetails.txt");
        List<Student>studentsList = getDummyList();
        assertEquals(15,studentsList.size());
    }
    @Test
    public void testValidateData() throws InsufficientDataException {
        //GIVEN
        List<Student>studentList = getDummyList();
//        //when
//        dm.validateData(studentList);
//        //then
//        assertTrue(false);
        try {
            dm.validateData(studentList);
            //fail("check valid student name should fail");
        } catch (InsufficientDataException e) {
            assertNotNull(e);
        }

    }
    @Test
    public void testSortData(){
        //Given
        List<Student>studentList = getDummyList();
        //when
        dm.sortData(studentList);
        //then
        assertEquals(1,studentList.get(0).getRollno());
        assertEquals(6,studentList.get(1).getRollno());
        assertEquals(11,studentList.get(2).getRollno());
        assertEquals(15,studentList.get(3).getRollno());
        assertEquals(10,studentList.get(4).getRollno());
        assertEquals(2,studentList.get(5).getRollno());
        assertEquals(3,studentList.get(6).getRollno());
        assertEquals(14,studentList.get(7).getRollno());
        assertEquals(7,studentList.get(8).getRollno());
        assertEquals(12,studentList.get(9).getRollno());
        assertEquals(9,studentList.get(10).getRollno());
        assertEquals(4,studentList.get(11).getRollno());
        assertEquals(8,studentList.get(12).getRollno());
        assertEquals(13,studentList.get(13).getRollno());
        assertEquals(5,studentList.get(14).getRollno());
    }


    private List<Student>getDummyList(){

        final List<Student> studentList = dm.populateData("/StudentDetails.txt");
        return studentList;
    }
}