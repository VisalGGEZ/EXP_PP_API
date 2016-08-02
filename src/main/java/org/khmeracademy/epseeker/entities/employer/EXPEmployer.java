package org.khmeracademy.epseeker.entities.employer;

public class EXPEmployer {
	private int employer_id;
	private String employer_name;
	private String employer_phone;
	private String employer_email;
	private int kaid;
	
	public EXPEmployer() {

	}
	
	/**
	 * @param employer_id
	 * @param employer_name
	 * @param employer_phone
	 * @param employer_email
	 * @param kaid
	 */
	public EXPEmployer(int employer_id, String employer_name, String employer_phone, String employer_email, int kaid) {
		this.employer_id = employer_id;
		this.employer_name = employer_name;
		this.employer_phone = employer_phone;
		this.employer_email = employer_email;
		this.kaid = kaid;
	}
	/**
	 * @return the employer_id
	 */
	public int getEmployer_id() {
		return employer_id;
	}
	/**
	 * @param employer_id the employer_id to set
	 */
	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}
	/**
	 * @return the employer_name
	 */
	public String getEmployer_name() {
		return employer_name;
	}
	/**
	 * @param employer_name the employer_name to set
	 */
	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}
	/**
	 * @return the employer_phone
	 */
	public String getEmployer_phone() {
		return employer_phone;
	}
	/**
	 * @param employer_phone the employer_phone to set
	 */
	public void setEmployer_phone(String employer_phone) {
		this.employer_phone = employer_phone;
	}
	/**
	 * @return the employer_email
	 */
	public String getEmployer_email() {
		return employer_email;
	}
	/**
	 * @param employer_email the employer_email to set
	 */
	public void setEmployer_email(String employer_email) {
		this.employer_email = employer_email;
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
