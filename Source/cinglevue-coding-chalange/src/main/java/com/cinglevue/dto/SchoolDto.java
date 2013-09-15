package com.cinglevue.dto;

import java.io.Serializable;

public class SchoolDto implements Serializable {

	private static final long serialVersionUID = -2950728310286537533L;

	private String schoolName;

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

}
