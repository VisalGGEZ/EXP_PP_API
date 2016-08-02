package org.khmeracademy.epseeker.entities.expert.experience;

public class EXPPosition {
	private int position_id;
	private String position_name;
	
	public EXPPosition() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param position_id
	 * @param position_name
	 */
	public EXPPosition(int position_id, String position_name) {
		this.position_id = position_id;
		this.position_name = position_name;
	}

	/**
	 * @return the position_id
	 */
	public int getPosition_id() {
		return position_id;
	}

	/**
	 * @param position_id the position_id to set
	 */
	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}

	/**
	 * @return the position_name
	 */
	public String getPosition_name() {
		return position_name;
	}

	/**
	 * @param position_name the position_name to set
	 */
	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}

	
}
