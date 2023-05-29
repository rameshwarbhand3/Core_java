package com.util;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataManagerImplTest {
    private DataManager dm;

    @BeforeEach
    public void SetUp() {
        //TODO: run questiondb.sql file on h2 db first
//        DBConnectionUtil dbConnectionUtil = new DatabaseConnectionManager();
//        Connection conn = dbConnectionUtil.getConnection();
//        File file = new File(this.getClass().getResource("/QuestionBankDb.sql").toURI());
//        FileReader fileReader = new FileReader(file);
//        RunScript.execute(conn, fileReader);
        dm = new DataManagerImpl();
    }

    @Test
    public void testPopulateData() throws SQLException, ClassNotFoundException {
        // when or act
        List<Question> actualQuestions = dm.populateData();

        //Then or assert
        assertEquals(27, actualQuestions.size());
    }

    @Test
    public void checkGetQuestionByCategory() throws SQLException, ClassNotFoundException {
        List<Question> questionList = getDummyShowList();
        //when
        List<Question> actual = dm.getQuestionByCategory(Category.Science, questionList);
        System.out.println(actual);
        //then
        assertEquals(5, actual.size());
    }

    @Test
    void checkQuestionByComplexity() {
        // given
        List<Question> questionList = getDummyShowList();

        // when
        List<Question> actual = dm.getQuestionByComplexity(Complexity.Complex, questionList);

        // then
        assertEquals(6, actual.size());
    }

    @Test
    void checkQuestionSortByComplexity() {
        // given
        List<Question> questionList = getDummyShowList();

        // when

        // then
    }

    private List<Question> getDummyShowList() {
        List<Question> questionList = new ArrayList<>();


        return questionList;
    }
}