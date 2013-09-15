package com.cinglevue.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "student_results")
public class StudentResults implements Serializable {
	
	private static final long serialVersionUID = -8821642055017458111L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false, unique = true)
	private Long id;

	@Column(name = "SCHOOL")
	private String school;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "Y3")
	private Double latestY3;

	@Column(name = "Y5")
	private Double latestY5;

	@Column(name = "Y7")
	private Double latestY7;

	@Column(name = "Y9")
	private Double latestY9;

	@Column(name = "ROW_GAIN_Y3Y5")
	private Double rawGainY3Y5;

	@Column(name = "FACTORED_GAIN_Y3Y5")
	private Double factoredGainY3Y5;

	@Column(name = "GLG_Y3Y5")
	private Double glgY3Y5;

	@Column(name = "LATEST_GAIN_IN_GAIN_Y3Y5")
	private Double latestGainInGainY3Y5;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Double getLatestY3() {
		return latestY3;
	}

	public void setLatestY3(Double latestY3) {
		this.latestY3 = latestY3;
	}

	public Double getLatestY5() {
		return latestY5;
	}

	public void setLatestY5(Double latestY5) {
		this.latestY5 = latestY5;
	}

	public Double getLatestY7() {
		return latestY7;
	}

	public void setLatestY7(Double latestY7) {
		this.latestY7 = latestY7;
	}

	public Double getLatestY9() {
		return latestY9;
	}

	public void setLatestY9(Double latestY9) {
		this.latestY9 = latestY9;
	}

	public Double getRawGainY3Y5() {
		return rawGainY3Y5;
	}

	public void setRawGainY3Y5(Double rawGainY3Y5) {
		this.rawGainY3Y5 = rawGainY3Y5;
	}

	public Double getFactoredGainY3Y5() {
		return factoredGainY3Y5;
	}

	public void setFactoredGainY3Y5(Double factoredGainY3Y5) {
		this.factoredGainY3Y5 = factoredGainY3Y5;
	}

	public Double getGlgY3Y5() {
		return glgY3Y5;
	}

	public void setGlgY3Y5(Double glgY3Y5) {
		this.glgY3Y5 = glgY3Y5;
	}

	public Double getLatestGainInGainY3Y5() {
		return latestGainInGainY3Y5;
	}

	public void setLatestGainInGainY3Y5(Double latestGainInGainY3Y5) {
		this.latestGainInGainY3Y5 = latestGainInGainY3Y5;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

}
