package com.cinglevue.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinglevue.dao.StudentResultDao;
import com.cinglevue.dto.SchoolDto;
import com.cinglevue.dto.SchoolResultDto;
import com.cinglevue.dto.StudentResultResponseDto;
import com.cinglevue.entity.StudentResults;
import com.cinglevue.service.StudentService;
import com.cinglevue.util.CinglevueUtil;

/**
 * Class for handle Student related backend calls.
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentResultDao studentResultDao;

	/**
	 * Method handle the result filtering business logic.
	 * 
	 */
	@Transactional
	public StudentResultResponseDto filterResult(String length, String pageNum, String cols, String sortBy,
			String search, String direc) throws Exception {
		try {

			String query = CinglevueUtil.genarateFilterSQL(search, sortBy, direc);

			int page = Integer.parseInt(pageNum);
			int maxResults = Integer.parseInt(length);
			int firstResult = page * maxResults;
			List<StudentResults> studentResultList = studentResultDao.filterResult(query, maxResults, firstResult);

			StudentResultResponseDto response = new StudentResultResponseDto();
			List<SchoolResultDto> schools = new ArrayList<SchoolResultDto>();
			// Iterate the result and writing in response format.
			for (Iterator<StudentResults> iterator = studentResultList.iterator(); iterator.hasNext();) {
				StudentResults studentResults = (StudentResults) iterator.next();
				SchoolResultDto schoolResultDto = new SchoolResultDto();
				schoolResultDto.setFactoredGainY3Y5(studentResults.getFactoredGainY3Y5());
				schoolResultDto.setGlgY3Y5(studentResults.getGlgY3Y5());
				schoolResultDto.setLatestGainInGainY3Y5(studentResults.getLatestGainInGainY3Y5());
				schoolResultDto.setRawGainY3Y5(studentResults.getRawGainY3Y5());
				schoolResultDto.setLatestY3(studentResults.getLatestY3());
				schoolResultDto.setLatestY5(studentResults.getLatestY5());
				schoolResultDto.setLatestY7(studentResults.getLatestY7());
				schoolResultDto.setLatestY9(studentResults.getLatestY9());
				SchoolDto school = new SchoolDto();
				school.setSchoolName(studentResults.getSchool());
				schoolResultDto.setSchool(school);
				schoolResultDto.setSubject(studentResults.getSubject());
				schools.add(schoolResultDto);
			}

			response.setSchools(schools);
			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
