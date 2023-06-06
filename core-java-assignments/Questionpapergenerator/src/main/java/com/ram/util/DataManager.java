package com.ram.util;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import com.ram.bean.Category;
import com.ram.bean.Complexity;
import com.ram.bean.Criteria;
import com.ram.bean.Question;

public interface DataManager {
	public List<Question> populateData() throws SQLException, ClassNotFoundException;
	public List<Question> getQuestionByCategory(Category category, List<Question> questionsList);
	public List<Question> getQuestionByComplexity(Complexity complexity, List<Question> questionsList);
	public Set<Question> generateQuestionPaper(List<Question> list, List<Criteria> template);
	public void sortByCategory(List<Question> questionList);
	public void sortByComplexity(List<Question> questionList);
	 
}
