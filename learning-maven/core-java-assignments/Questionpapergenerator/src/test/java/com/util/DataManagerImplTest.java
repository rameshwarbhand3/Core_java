package com.util;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Criteria;
import com.bean.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void testGetQuestionByCategory() {
        //given
        List<Question> questionList = getDummyShowList();

        //when
        List<Question> actual = dm.getQuestionByCategory(Category.Science, questionList);

        //then
        assertEquals(1, actual.size());
    }

    @Test
    public void testGetQuestionByCategoryWhenNoMatch() {
        //given
        Question q1 = buildQuestion(1, "what is your name?", Complexity.Simple, Category.GK);
        Question q2 = buildQuestion(2, "who are you?", Complexity.Medium, Category.History);
        Question q3 = buildQuestion(2, "what are you doing?", Complexity.Medium, Category.Geography);
        final List<Question> questions = Arrays.asList(q1, q2, q3);

        //when
        final List<Question> actualQuestionsByCategory = dm.getQuestionByCategory(Category.Science, questions);

        //then
        assertTrue(actualQuestionsByCategory.isEmpty());
    }

    @Test
    void testGetQuestionByComplexity() {
        // given
        List<Question> questionList = getDummyShowList();

        // when
        List<Question> actual = dm.getQuestionByComplexity(Complexity.Complex, questionList);

        // then
        assertEquals(1, actual.size());
    }

    @Test
    public void testGetQuestionByComplexityWhenNoMatch() {
        //given
        Question q1 = buildQuestion(1, "what is your name?", Complexity.Simple, Category.GK);
        Question q2 = buildQuestion(2, "who are you?", Complexity.Medium, Category.History);
        Question q3 = buildQuestion(2, "what are you doing?", Complexity.Medium, Category.Geography);
        final List<Question> questions = Arrays.asList(q1, q2, q3);

        //when
        final List<Question> actualQuestionByComplexity = dm.getQuestionByComplexity(Complexity.Complex, questions);

        //then
        assertTrue(actualQuestionByComplexity.isEmpty());
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
    public void testQuestionsSortByCategory() {
        //given
        List<Question> questionList = getDummyShowList();

        //Before Sorting order
//        assertEquals(1, questionList.get(0).getSrno());
//        assertEquals(2, questionList.get(1).getSrno());
//        assertEquals(3, questionList.get(2).getSrno());
//        assertEquals(4, questionList.get(3).getSrno());


        //when
        dm.sortByCategory(questionList);

        //then
        //After Sorting order
        assertEquals(1, questionList.get(0).getSrno());
        assertEquals(4, questionList.get(1).getSrno());
        assertEquals(3, questionList.get(2).getSrno());
        assertEquals(2, questionList.get(3).getSrno());
    }

    @Test
    public void testGenerateQuestionPaperSuccess() {
        //given
        List<Question> questionList = getDummyShowList();
        List<Criteria> templateList = new ArrayList<>();
        templateList.add(new Criteria(Category.Geography, Complexity.Simple, 1));
        templateList.add(new Criteria(Category.GK, Complexity.Medium, 1));
        templateList.add(new Criteria(Category.History, Complexity.Complex, 1));

        //when
        final Set<Question> questionSet = dm.generateQuestionPaper(questionList, templateList);

        //then
        assertEquals(3, questionSet.size());
    }


    //FIXME
    @Test
    public void testGenerateQuestionPaperWhenPartialCriteriaMatch() {
        //given
        List<Question> questionList = getDummyShowList();
        List<Criteria> templateList = new ArrayList<>();
        templateList.add(new Criteria(Category.Geography, Complexity.Simple, 2));
        templateList.add(new Criteria(Category.GK, Complexity.Medium, 2));
        templateList.add(new Criteria(Category.History, Complexity.Complex, 1));

        //when
        final Set<Question> questionSet = dm.generateQuestionPaper(questionList, templateList);

        //then
        assertEquals(3, questionSet.size());
    }

    @Test
    public void testJavaSet() {
        Integer no1 = new Integer(10);
        Integer no2 = new Integer(10);
        Integer no3 = new Integer(10);
        Integer no4 = new Integer(10);
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(no1);
        integerSet.add(no2);
        integerSet.add(no3);
        integerSet.add(no4);

        String s1 = new String("ram");
        String s2 = new String("ram");
        String s3 = new String("ram");
        String s4 = new String("ram");
        Set<String> stringSet = new HashSet<>();
        stringSet.add(s1);
        stringSet.add(s2);
        stringSet.add(s3);
        stringSet.add(s4);

        Question q1 = buildQuestion(1, "What is the satellite of the earth called?", Complexity.Simple, Category.Geography);
        Question q2 = buildQuestion(1, "What is the satellite of the earth called?", Complexity.Simple, Category.Geography);
        Question q3 = buildQuestion(1, "What is the satellite of the earth called?", Complexity.Simple, Category.Geography);
        Question q4 = buildQuestion(1, "What is the satellite of the earth called?", Complexity.Simple, Category.Geography);
        Set<Question> questionSet = new HashSet<>();
        questionSet.add(q1);
        questionSet.add(q2);
        questionSet.add(q3);
        questionSet.add(q4);

        assertEquals(1, integerSet.size());
        assertEquals(1, stringSet.size());
        assertEquals(1, questionSet.size());
    }

    private List<Question> getDummyShowList() {
        List<Question> questionList = new ArrayList<>();

        Question q1 = buildQuestion(1, "What is the satellite of the earth called?", Complexity.Simple, Category.Geography);
        questionList.add(q1);

        Question q2 = buildQuestion(2, "Which city is the capital of Maharashtra?", Complexity.Simple, Category.Science);
        questionList.add(q2);

        Question q3 = buildQuestion(3, "Who wrote Dasbodh?", Complexity.Medium, Category.GK);
        questionList.add(q3);

        Question q4 = buildQuestion(4, "How many sence organs do we have?", Complexity.Complex, Category.History);
        questionList.add(q4);

        return questionList;
    }

    private Question buildQuestion(int srNo, String qName, Complexity complexity, Category category) {
        Question question = new Question();
        question.setSrno(srNo);
        question.setQuestion(qName);
        question.setComplexity(complexity);
        question.setType(category);
        return question;
    }
}