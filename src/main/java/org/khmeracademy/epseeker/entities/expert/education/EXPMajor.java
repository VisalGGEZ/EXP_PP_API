package org.khmeracademy.epseeker.entities.expert.education;

public class EXPMajor {
	private int major_id;
	private String major_name;
	
	public EXPMajor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param major_id
	 * @param major_name
	 */
	public EXPMajor(int major_id, String major_name) {
		this.major_id = major_id;
		this.major_name = major_name;
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
	 * @return the major_name
	 */
	public String getMajor_name() {
		return major_name;
	}

	/**
	 * @param major_name the major_name to set
	 */
	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}
	
	
}
