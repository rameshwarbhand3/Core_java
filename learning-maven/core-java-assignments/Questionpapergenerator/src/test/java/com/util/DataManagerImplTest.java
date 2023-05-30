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
    public void checkGetQuestionByCategory() {
        //given
        List<Question> questionList = getDummyShowList();

        //when
        List<Question> actual = dm.getQuestionByCategory(Category.Science, questionList);

       //then
        assertEquals(1, actual.size());
    }

    @Test
    void checkGetQuestionByComplexity() {
        // given
        List<Question> questionList = getDummyShowList();

        // when
        List<Question> actual = dm.getQuestionByComplexity(Complexity.Complex, questionList);

        // then
        assertEquals(1, actual.size());
    }

    @Test
    void testQuestionsSortByComplexity() {
        // given
        List<Question> questionList = getDummyShowList();
        //Before Sorting order
//        assertEquals(1, questionList.get(0).getSrno());
//        assertEquals(2, questionList.get(1).getSrno());
//        assertEquals(3, questionList.get(2).getSrno());
//        assertEquals(4, questionList.get(3).getSrno());

        // when
        dm.sortByComplexity(questionList);

        // then
        //After sorting order
        assertEquals(4, questionList.get(0).getSrno());
        assertEquals(3, questionList.get(1).getSrno());
        assertEquals(1, questionList.get(2).getSrno());
        assertEquals(2, questionList.get(3).getSrno());
    }

    @Test
    public void testQuestionsSortByCategory(){
        //given
        List<Question>questionList = getDummyShowList();

        //Before Sorting order
//        assertEquals(1, questionList.get(0).getSrno());
//        assertEquals(2, questionList.get(1).getSrno());
//        assertEquals(3, questionList.get(2).getSrno());
//        assertEquals(4, questionList.get(3).getSrno());


        //when
        dm.sortByCategory(questionList);

        //then
        //After Sorting order
        assertEquals(1,questionList.get(0).getSrno());
        assertEquals(4,questionList.get(1).getSrno());
        assertEquals(3,questionList.get(2).getSrno());
        assertEquals(2,questionList.get(3).getSrno());
    }

    private List<Question> getDummyShowList() {
        List<Question> questionList = new ArrayList<>();

        Question q1 = new Question();
        q1.setSrno(1);
        q1.setQuestion("What is the satellite of the earth called?");
        q1.setComplexity(Complexity.Simple);
        q1.setType(Category.Geography);
        questionList.add(q1);

        Question q2 = new Question();
        q2.setSrno(2);
        q2.setQuestion("Which city is the capital of Maharashtra?");
        q2.setComplexity(Complexity.Simple);
        q2.setType(Category.Science);
        questionList.add(q2);

        Question q3 = new Question();
        q3.setSrno(3);
        q3.setQuestion("Who wrote Dasbodh?");
        q3.setComplexity(Complexity.Medium);
        q3.setType(Category.GK);
        questionList.add(q3);

        Question q4 = new Question();
        q4.setSrno(4);
        q4.setQuestion("How many sence organs do we have?");
        q4.setComplexity(Complexity.Complex);
        q4.setType(Category.History);
        questionList.add(q4);


        return questionList;
    }
}