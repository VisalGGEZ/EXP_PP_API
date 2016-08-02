package org.khmeracademy.epseeker.entities.expert.language;

public class EXPLanguage {
	
	private int language_id;
	private String language_name;
	private String language_description;
	
	public EXPLanguage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param language_id
	 * @param language_name
	 * @param language_description
	 */
	public EXPLanguage(int language_id, String language_name, String language_description) {
		this.language_id = language_id;
		this.language_name = language_name;
		this.language_description = language_description;
	}

	/**
	 * @return the language_id
	 */
	public int getLanguage_id() {
		return language_id;
	}

	/**
	 * @param language_id the language_id to set
	 */
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	/**
	 * @return the language_name
	 */
	public String getLanguage_name() {
		return language_name;
	}

	/**
	 * @param language_name the language_name to set
	 */
	public void setLanguage_name(String language_name) {
		this.language_name = language_name;
	}

	/**
	 * @return the language_description
	 */
	public String getLanguage_description() {
		return language_description;
	}

	/**
	 * @param language_description the language_description to set
	 */
	public void setLanguage_description(String language_description) {
		this.language_description = language_description;
	}
	
	

}
