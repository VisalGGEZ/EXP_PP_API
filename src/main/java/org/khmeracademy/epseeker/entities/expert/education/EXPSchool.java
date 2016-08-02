package org.khmeracademy.epseeker.entities.expert.education;

public class EXPSchool {
	private int school_id;
	private String school_name;
	private String school_description;
	
	public EXPSchool() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param school_id
	 * @param school_name
	 * @param school_description
	 */
	public EXPSchool(int school_id, String school_name, String school_description) {
		this.school_id = school_id;
		this.school_name = school_name;
		this.school_description = school_description;
	}

	/**
	 * @return the school_id
	 */
	public int getSchool_id() {
		return school_id;
	}

	/**
	 * @param school_id the school_id to set
	 */
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	/**
	 * @return the school_name
	 */
	public String getSchool_name() {
		return school_name;
	}

	/**
	 * @param school_name the school_name to set
	 */
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	/**
	 * @return the school_description
	 */
	public String getSchool_description() {
		return school_description;
	}

	/**
	 * @param school_description the school_description to set
	 */
	public void setSchool_description(String school_description) {
		this.school_description = school_description;
	}
	
	
}
