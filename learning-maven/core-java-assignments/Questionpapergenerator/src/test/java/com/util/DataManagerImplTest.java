package com.util;

import com.bean.Question;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataManagerImplTest {
    @Test
    public void testPopulateData() throws SQLException, ClassNotFoundException {
        //Given or Arrange
        DataManagerImpl dmi = new DataManagerImpl();

        // when or act
        List<Question> actualQuestions = dmi.populateData();

        //Then or assert
        assertEquals(27, actualQuestions.size());
    }
}