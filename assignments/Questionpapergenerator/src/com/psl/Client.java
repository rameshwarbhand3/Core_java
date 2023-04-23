package com.psl;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

import com.bean.Category;
import com.bean.Complexity;
import com.bean.Criteria;
import com.bean.Question;
import com.util.DataManager;
import com.util.DataManagerImpl;

public class Client {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Call your functionalities from here to test your code.

        DataManager dm = new DataManagerImpl();
        List<Question> questions = dm.populateData();
//
//        for(Question q:questions){
//            System.out.println(q);
//        }
//		for(Question q1 : questions){
//			System.out.println(q1.getSrno());
//		}
//        List<Integer> srNumbers = questions.stream()
//                .map((question) -> question.getSrno())
//                .collect(Collectors.toList());
//        System.out.println(srNumbers);
//        System.out.println("-------------------------------------------------------------");
////
//        System.out.println("Question by category : ");
//        List<Question> questionsByCategory = dm.getQuestionByCategory(Category.Science, questions);
//        for (Question q1 : questionsByCategory) {
//            System.out.println(q1.getQuestion());
//        }
//        System.out.println("-------------------------------------------------------------");
//        System.out.println("Question by complexity : ");
//            List<Question>lComplexity = dm.getQuestionByComplexity(Complexity.Complex,questions);
//            for(Question q2 : lComplexity){
//                System.out.println(q2.getSrno()+ " "+ q2.getQuestion());
//            }
//        System.out.println("-------------------------------------------------------------");


//        System.out.println(("Sort by Category : "));
//        dm.sortByCategory(questions);
//        for (Question q3 : questions) {
//            System.out.println("Category : " + q3.getCategory() + " " + "Question : " + q3.getQuestion());
//        }
//        System.out.println("-------------------------------------------------------------");
//
        System.out.println(("Sort by Complexity : "));
        dm.sortByComplexity(questions);
        for (Question q4 : questions) {
            System.out.println("Complexity : " + q4.getComplexity() + " " + "Question : " + q4.getQuestion());
        }
    }
}
