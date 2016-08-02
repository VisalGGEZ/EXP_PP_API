package org.khmeracademy.epseeker.entities.employer;

public class EXPFavorite {
	private int expert_id;
	private int employer_id;
	
	public EXPFavorite() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expert_id
	 * @param employer_id
	 */
	public EXPFavorite(int expert_id, int employer_id) {
		this.expert_id = expert_id;
		this.employer_id = employer_id;
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
	
	
	
}
