package org.khmeracademy.epseeker.entities.expert.experience;

public class EXPExperienceDetail {
	private int expert_id;
	private String company_name;
	private String position_id;
	private String experience_start_year;
	private String experience_end_year;
	private String experience_desciption;
	
	public EXPExperienceDetail() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expert_id
	 * @param company_name
	 * @param position_id
	 * @param experience_start_year
	 * @param experience_end_year
	 * @param experience_desciption
	 */
	public EXPExperienceDetail(int expert_id, String company_name, String position_id, String experience_start_year,
			String experience_end_year, String experience_desciption) {
		this.expert_id = expert_id;
		this.company_name = company_name;
		this.position_id = position_id;
		this.experience_start_year = experience_start_year;
		this.experience_end_year = experience_end_year;
		this.experience_desciption = experience_desciption;
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
	 * @return the company_name
	 */
	public String getCompany_name() {
		return company_name;
	}

	/**
	 * @param company_name the company_name to set
	 */
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	/**
	 * @return the position_id
	 */
	public String getPosition_id() {
		return position_id;
	}

	/**
	 * @param position_id the position_id to set
	 */
	public void setPosition_id(String position_id) {
		this.position_id = position_id;
	}

	/**
	 * @return the experience_start_year
	 */
	public String getExperience_start_year() {
		return experience_start_year;
	}

	/**
	 * @param experience_start_year the experience_start_year to set
	 */
	public void setExperience_start_year(String experience_start_year) {
		this.experience_start_year = experience_start_year;
	}

	/**
	 * @return the experience_end_year
	 */
	public String getExperience_end_year() {
		return experience_end_year;
	}

	/**
	 * @param experience_end_year the experience_end_year to set
	 */
	public void setExperience_end_year(String experience_end_year) {
		this.experience_end_year = experience_end_year;
	}

	/**
	 * @return the experience_desciption
	 */
	public String getExperience_desciption() {
		return experience_desciption;
	}

	/**
	 * @param experience_desciption the experience_desciption to set
	 */
	public void setExperience_desciption(String experience_desciption) {
		this.experience_desciption = experience_desciption;
	}
	
	
	
}
