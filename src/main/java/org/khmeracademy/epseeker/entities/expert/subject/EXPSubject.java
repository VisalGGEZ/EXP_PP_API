package org.khmeracademy.epseeker.entities.expert.subject;

public class EXPSubject {
	private int subject_id;
	private String subject_name;
	private String subject_description;
	private String subject_categgory_id;
	
	public EXPSubject() {

	}

	/**
	 * @param subject_id
	 * @param subject_name
	 * @param subject_description
	 * @param subject_categgory_id
	 */
	public EXPSubject(int subject_id, String subject_name, String subject_description, String subject_categgory_id) {
		this.subject_id = subject_id;
		this.subject_name = subject_name;
		this.subject_description = subject_description;
		this.subject_categgory_id = subject_categgory_id;
	}

	/**
	 * @return the subject_id
	 */
	public int getSubject_id() {
		return subject_id;
	}

	/**
	 * @param subject_id the subject_id to set
	 */
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	/**
	 * @return the subject_name
	 */
	public String getSubject_name() {
		return subject_name;
	}

	/**
	 * @param subject_name the subject_name to set
	 */
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	/**
	 * @return the subject_description
	 */
	public String getSubject_description() {
		return subject_description;
	}

	/**
	 * @param subject_description the subject_description to set
	 */
	public void setSubject_description(String subject_description) {
		this.subject_description = subject_description;
	}

	/**
	 * @return the subject_categgory_id
	 */
	public String getSubject_categgory_id() {
		return subject_categgory_id;
	}

	/**
	 * @param subject_categgory_id the subject_categgory_id to set
	 */
	public void setSubject_categgory_id(String subject_categgory_id) {
		this.subject_categgory_id = subject_categgory_id;
	}
	
	
}
