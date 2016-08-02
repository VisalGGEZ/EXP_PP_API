package org.khmeracademy.epseeker.repositories.expert.education;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.expert.education.EXPEducation;

public interface EXPEducationRepository {
	interface SQL{
		String SELECT = "SELECT expert_id, school_id, major_id, education_start_year, education_end_year, education_description "
					  + "FROM exp_education";

		String SELECT_ONE = "SELECT expert_id, school_id, major_id, education_start_year, education_end_year, education_description "
				  		  + "FROM exp_education WHERE expert_id = #{expert_id}, school_id = #{school_id}, major_id = #{major_id}";
				
		String INSERT = "INSERT INTO exp_education "
					  + "(expert_id, shool_id, major_id, education_start_year, education_end_year, education_description) "
					  + "VALUES(#{expert_id}, #{school_id}, #{major_id}, #{education_start_year}, #{educatioin_end_year}, #{education_description})";
		
		String UPDATE = "UPDATE exp_education SET "
					  + "school_id = #{school_id}"
					  + "major_id = #{major_id},"
					  + "education_start_year = #{education_start_year},"
					  + "education_end_year = #{education_end_year},"
					  + "education_description = #{education_description}"
					  + "WHERE expert_id = #{expert_id}";
		
		String DELETE = "DELETE FROM exp_education WHERE expert_id = #{expert_id} AND school_id = #{school_id} AND major_id = #{major_id}";
		
		String IF_EXIST = "SELECT * FROM exp_education "
						+ "WHERE expert_id = #{expert_id} AND school_id = #{school_id} AND major_id = #{major_id}";
	}
	
	@Select(SQL.SELECT)
	ArrayList<EXPEducation> find();
	
	@Select(SQL.SELECT_ONE)
	EXPEducation findOne(EXPEducation exp_e);
	
	@Insert(SQL.INSERT)
	boolean save(EXPEducation exp_e);
	
	@Update(SQL.UPDATE)
	boolean update(EXPEducation exp_e);
	
	@Delete(SQL.DELETE)
	boolean delete(EXPEducation exp_e);
		
	@Select(SQL.IF_EXIST)
	boolean ifExist(EXPEducation exp_e);
	
}
