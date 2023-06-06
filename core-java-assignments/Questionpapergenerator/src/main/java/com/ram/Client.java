package com.ram;

import java.sql.SQLException;
import java.util.*;

import com.ram.bean.Criteria;
import com.ram.bean.Question;
import com.ram.util.DataManagerImpl;
import com.ram.bean.Category;
import com.ram.bean.Complexity;
import com.ram.util.DataManager;

public class Client {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Call your functionalities from here to test your code.

        DataManager dm = new DataManagerImpl();
        List<Question> questions = dm.populateData();
//
//        }
//		for(Question q1 : questions){
//        for(Question q:questions){
//            System.out.println(q);
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
        List<Criteria>template = new ArrayList<>();
        template.add(new Criteria(Category.GK,Complexity.Simple,2));
        template.add(new Criteria(Category.GK,Complexity.Medium,1));
        template.add(new Criteria(Category.GK,Complexity.Complex,1));

        template.add(new Criteria(Category.Science,Complexity.Complex,1));
        template.add(new Criteria(Category.History,Complexity.Simple,2));
        template.add(new Criteria(Category.History,Complexity.Medium,2));

        template.add(new Criteria(Category.Geography,Complexity.Medium,1));
        System.out.println("Question by template :");
        Set<Question>templateQuestion = dm.generateQuestionPaper(questions,template);
        for(Question q : templateQuestion){
            System.out.println(q);
        }



//        System.out.println(("Sort by Category : "));
//        dm.sortByCategory(questions);
//        for (Question q3 : questions) {
//            System.out.println("Category : " + q3.getCategory() + " " + "Question : " + q3.getQuestion());
//        }
//        System.out.println("-------------------------------------------------------------");
////
//        System.out.println(("Sort by Complexity : "));
//        dm.sortByComplexity(questions);
//        for (Question q4 : questions) {
//            System.out.println("Complexity : " + q4.getComplexity() + " " + "Question : " + q4.getQuestion());
//        }
    }
}
