package org.khmeracademy.epseeker.entities.expert;

public class EXP_Expert {
	private int expert_id;
	private String expert_firstname;
	private String expert_lastname;
	private String expert_phone;
	private double expert_salary;
	private String expert_photo;
	private String expert_status;
	private int kaid;

	public EXP_Expert() {
		
	}
	
	/**
	 * @param expert_id
	 * @param expert_firstname
	 * @param expert_lastname
	 * @param expert_phone
	 * @param expert_salary
	 * @param expert_photo
	 * @param expert_status
	 * @param kaid
	 */
	public EXP_Expert(int expert_id, String expert_firstname, String expert_lastname, String expert_phone,
			double expert_salary, String expert_photo, String expert_status, int kaid) {
		this.expert_id = expert_id;
		this.expert_firstname = expert_firstname;
		this.expert_lastname = expert_lastname;
		this.expert_phone = expert_phone;
		this.expert_salary = expert_salary;
		this.expert_photo = expert_photo;
		this.expert_status = expert_status;
		this.kaid = kaid;
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
	 * @return the expert_firstname
	 */
	public String getExpert_firstname() {
		return expert_firstname;
	}

	/**
	 * @param expert_firstname the expert_firstname to set
	 */
	public void setExpert_firstname(String expert_firstname) {
		this.expert_firstname = expert_firstname;
	}

	/**
	 * @return the expert_lastname
	 */
	public String getExpert_lastname() {
		return expert_lastname;
	}

	/**
	 * @param expert_lastname the expert_lastname to set
	 */
	public void setExpert_lastname(String expert_lastname) {
		this.expert_lastname = expert_lastname;
	}

	/**
	 * @return the expert_phone
	 */
	public String getExpert_phone() {
		return expert_phone;
	}

	/**
	 * @param expert_phone the expert_phone to set
	 */
	public void setExpert_phone(String expert_phone) {
		this.expert_phone = expert_phone;
	}

	/**
	 * @return the expert_salary
	 */
	public double getExpert_salary() {
		return expert_salary;
	}

	/**
	 * @param expert_salary the expert_salary to set
	 */
	public void setExpert_salary(double expert_salary) {
		this.expert_salary = expert_salary;
	}

	/**
	 * @return the expert_photo
	 */
	public String getExpert_photo() {
		return expert_photo;
	}

	/**
	 * @param expert_photo the expert_photo to set
	 */
	public void setExpert_photo(String expert_photo) {
		this.expert_photo = expert_photo;
	}

	/**
	 * @return the expert_status
	 */
	public String getExpert_status() {
		return expert_status;
	}

	/**
	 * @param expert_status the expert_status to set
	 */
	public void setExpert_status(String expert_status) {
		this.expert_status = expert_status;
	}

	/**
	 * @return the kaid
	 */
	public int getKaid() {
		return kaid;
	}

	/**
	 * @param kaid the kaid to set
	 */
	public void setKaid(int kaid) {
		this.kaid = kaid;
	}
	
	
	
}
