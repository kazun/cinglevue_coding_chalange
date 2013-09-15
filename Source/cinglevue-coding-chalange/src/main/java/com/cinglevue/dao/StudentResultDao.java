package com.cinglevue.dao;

import java.util.List;

import com.cinglevue.entity.StudentResults;

public interface StudentResultDao {

	List<StudentResults> filterResult(String query, int maxResults, int firstResult);

}
