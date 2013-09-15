package com.cinglevue.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cinglevue.dto.StudentResultResponseDto;
import com.cinglevue.service.StudentService;
import com.cinglevue.util.StaticConstant;

/**
 * Student result Controller which is used to handle student result related
 * requests.
 * 
 */
@Controller
public class StudentResultController {

	@Autowired
	private StudentService studentService;

	/**
	 * Url Mapping for initial page. Result sheet page.
	 * 
	 */
	@RequestMapping(value = "/resultSheet.htm", method = RequestMethod.GET)
	public String resultSheet(HttpServletRequest request, Model model, HttpServletResponse response) {
		return StaticConstant.STUDENT_RESULT_SHEET;
	}

	/**
	 * Ajax call for load the student results.
	 * 
	 */
	@RequestMapping(value = "/loadResult.htm", method = RequestMethod.GET)
	public @ResponseBody
	StudentResultResponseDto getResultsInJSON(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String length = request.getParameter("iDisplayLength");
		String pageNum = request.getParameter("iDisplayStart");
		String cols = request.getParameter("iSortingCols");
		String sortBy = request.getParameter("iSortCol_0");
		String search = request.getParameter("sSearch");
		String direc = request.getParameter("sSortDir_0");

		StudentResultResponseDto shop = studentService.filterResult(length, pageNum, cols, sortBy, 
				search, direc);

		return shop;

	}

}
