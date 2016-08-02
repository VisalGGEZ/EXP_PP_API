package org.khmeracademy.epseeker.entities.expert.subject;

public class EXPExpertSubjectDetail {
	private int expert_id;
	private int subject_id;
	private String expert_subject_detail_level;
	private String expert_subject_detail_description;
	
	public EXPExpertSubjectDetail() {

	}

	/**
	 * @param expert_id
	 * @param subject_id
	 * @param expert_subject_detail_level
	 * @param expert_subject_detail_description
	 */
	public EXPExpertSubjectDetail(int expert_id, int subject_id, String expert_subject_detail_level,
			String expert_subject_detail_description) {
		this.expert_id = expert_id;
		this.subject_id = subject_id;
		this.expert_subject_detail_level = expert_subject_detail_level;
		this.expert_subject_detail_description = expert_subject_detail_description;
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
	 * @return the expert_subject_detail_level
	 */
	public String getExpert_subject_detail_level() {
		return expert_subject_detail_level;
	}

	/**
	 * @param expert_subject_detail_level the expert_subject_detail_level to set
	 */
	public void setExpert_subject_detail_level(String expert_subject_detail_level) {
		this.expert_subject_detail_level = expert_subject_detail_level;
	}

	/**
	 * @return the expert_subject_detail_description
	 */
	public String getExpert_subject_detail_description() {
		return expert_subject_detail_description;
	}

	/**
	 * @param expert_subject_detail_description the expert_subject_detail_description to set
	 */
	public void setExpert_subject_detail_description(String expert_subject_detail_description) {
		this.expert_subject_detail_description = expert_subject_detail_description;
	}
	
	
}
