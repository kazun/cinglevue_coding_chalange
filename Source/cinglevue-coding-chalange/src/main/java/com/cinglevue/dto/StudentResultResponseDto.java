package com.cinglevue.dto;

import java.io.Serializable;
import java.util.List;

public class StudentResultResponseDto implements Serializable {

	private static final long serialVersionUID = -6669033399172700253L;

	private List<SchoolResultDto> schools;

	public void setSchools(List<SchoolResultDto> schools) {
		this.schools = schools;
	}

	public List<SchoolResultDto> getSchools() {
		return schools;
	}

}
