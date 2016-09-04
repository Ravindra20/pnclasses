package com.pnclasses.order.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.pnclasses.order.vo.PersonalDetailsVO;

@Component("personalDetailsDaoImpl")
public class PersonalDetailsDaoImpl {

	private JdbcTemplate jdbc;

	/*@Autowired
	private SessionFactory sessionFactory;*/

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}

	/*public Session getSession() {
		return sessionFactory.getCurrentSession();
	}*/

	public List<PersonalDetailsVO> getPersonalDetails() {
		return jdbc.query("SELECT * FROM personaldetails",
				new RowMapper<PersonalDetailsVO>() {

					@Override
					public PersonalDetailsVO mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						PersonalDetailsVO objPersonalDetailsVO = new PersonalDetailsVO();
						objPersonalDetailsVO.setMemberName(rs.getString("Name"));
						objPersonalDetailsVO.setMemberSurName(rs
								.getString("SurName"));
						/*
						 * objPersonalDetailsVO.setMemberMobileNumber(rs
						 * .getInt("MobileNumber"));
						 */
						objPersonalDetailsVO.setMemberEmail(rs
								.getString("Email"));
						objPersonalDetailsVO.setMemberAddress(rs
								.getString("Address"));
						objPersonalDetailsVO.setRelativeName(rs
								.getString("RelativeName"));
						objPersonalDetailsVO.setRelativeMobileNumber(rs
								.getString("RelativeMobileNumber"));
						objPersonalDetailsVO.setMemberOf(rs
								.getString("MemberOf"));

						// TODO Auto-generated method stub
						return objPersonalDetailsVO;
					}

				});

	}
	
}