package org.khmeracademy.epseeker.entities.expert.education;

public class EXPEducation {
	private int expert_id;
	private String school_id;
	private int major_id;
	private String education_start_year;
	private String education_end_year;
	private String education_description;
	
	public EXPEducation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expert_id
	 * @param school_id
	 * @param major_id
	 * @param education_start_year
	 * @param education_end_year
	 * @param education_description
	 */
	public EXPEducation(int expert_id, String school_id, int major_id, String education_start_year,
			String education_end_year, String education_description) {
		this.expert_id = expert_id;
		this.school_id = school_id;
		this.major_id = major_id;
		this.education_start_year = education_start_year;
		this.education_end_year = education_end_year;
		this.education_description = education_description;
	}

	/**
	 * @return the expert_id
	 */
	public int getExpert_id() {
		return expert_id;
	}

	/**
	 * @param expert_id the expert_id to set
	 */
	public void setExpert_id(int expert_id) {
		this.expert_id = expert_id;
	}

	/**
	 * @return the school_id
	 */
	public String getSchool_id() {
		return school_id;
	}

	/**
	 * @param school_id the school_id to set
	 */
	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	/**
	 * @return the major_id
	 */
	public int getMajor_id() {
		return major_id;
	}

	/**
	 * @param major_id the major_id to set
	 */
	public void setMajor_id(int major_id) {
		this.major_id = major_id;
	}

	/**
	 * @return the education_start_year
	 */
	public String getEducation_start_year() {
		return education_start_year;
	}

	/**
	 * @param education_start_year the education_start_year to set
	 */
	public void setEducation_start_year(String education_start_year) {
		this.education_start_year = education_start_year;
	}

	/**
	 * @return the education_end_year
	 */
	public String getEducation_end_year() {
		return education_end_year;
	}

	/**
	 * @param education_end_year the education_end_year to set
	 */
	public void setEducation_end_year(String education_end_year) {
		this.education_end_year = education_end_year;
	}

	/**
	 * @return the education_description
	 */
	public String getEducation_description() {
		return education_description;
	}

	/**
	 * @param education_description the education_description to set
	 */
	public void setEducation_description(String education_description) {
		this.education_description = education_description;
	}
	
	
	
}
