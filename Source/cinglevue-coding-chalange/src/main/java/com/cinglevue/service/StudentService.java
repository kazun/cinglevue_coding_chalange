package com.cinglevue.service;

import com.cinglevue.dto.StudentResultResponseDto;

public interface StudentService {

	StudentResultResponseDto filterResult(String length, String pageNum, String cols, String sortBy, String search,
			String direc) throws Exception;

}
