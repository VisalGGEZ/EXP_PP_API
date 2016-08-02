package org.khmeracademy.epseeker.entities.expert.language;

public class EXPExpertLanguageDetail {
	private int expert_id;
	private int language_id;
	private String listening_level;
	private String reading_level;
	private String writing_level;
	private String speaking_level;
	private String description;
	
	
	public EXPExpertLanguageDetail() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param expert_id
	 * @param language_id
	 * @param listening_level
	 * @param reading_level
	 * @param writing_level
	 * @param speaking_level
	 * @param description
	 */
	public EXPExpertLanguageDetail(int expert_id, int language_id, String listening_level, String reading_level,
			String writing_level, String speaking_level, String description) {
		this.expert_id = expert_id;
		this.language_id = language_id;
		this.listening_level = listening_level;
		this.reading_level = reading_level;
		this.writing_level = writing_level;
		this.speaking_level = speaking_level;
		this.description = description;
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
	 * @return the listening_level
	 */
	public String getListening_level() {
		return listening_level;
	}


	/**
	 * @param listening_level the listening_level to set
	 */
	public void setListening_level(String listening_level) {
		this.listening_level = listening_level;
	}


	/**
	 * @return the reading_level
	 */
	public String getReading_level() {
		return reading_level;
	}


	/**
	 * @param reading_level the reading_level to set
	 */
	public void setReading_level(String reading_level) {
		this.reading_level = reading_level;
	}


	/**
	 * @return the writing_level
	 */
	public String getWriting_level() {
		return writing_level;
	}


	/**
	 * @param writing_level the writing_level to set
	 */
	public void setWriting_level(String writing_level) {
		this.writing_level = writing_level;
	}


	/**
	 * @return the speaking_level
	 */
	public String getSpeaking_level() {
		return speaking_level;
	}


	/**
	 * @param speaking_level the speaking_level to set
	 */
	public void setSpeaking_level(String speaking_level) {
		this.speaking_level = speaking_level;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
