package org.khmeracademy.epseeker.entities.expert.subject;

public class EXPSubjectCategory {
	private int subject_category_id;
	private String subject_category_name;
	private String subject_catgory_description;
	
	public EXPSubjectCategory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param subject_category_id
	 * @param subject_category_name
	 * @param subject_catgory_description
	 */
	public EXPSubjectCategory(int subject_category_id, String subject_category_name,
			String subject_catgory_description) {
		this.subject_category_id = subject_category_id;
		this.subject_category_name = subject_category_name;
		this.subject_catgory_description = subject_catgory_description;
	}

	/**
	 * @return the subject_category_id
	 */
	public int getSubject_category_id() {
		return subject_category_id;
	}

	/**
	 * @param subject_category_id the subject_category_id to set
	 */
	public void setSubject_category_id(int subject_category_id) {
		this.subject_category_id = subject_category_id;
	}

	/**
	 * @return the subject_category_name
	 */
	public String getSubject_category_name() {
		return subject_category_name;
	}

	/**
	 * @param subject_category_name the subject_category_name to set
	 */
	public void setSubject_category_name(String subject_category_name) {
		this.subject_category_name = subject_category_name;
	}

	/**
	 * @return the subject_catgory_description
	 */
	public String getSubject_catgory_description() {
		return subject_catgory_description;
	}

	/**
	 * @param subject_catgory_description the subject_catgory_description to set
	 */
	public void setSubject_catgory_description(String subject_catgory_description) {
		this.subject_catgory_description = subject_catgory_description;
	}
	
	
}
