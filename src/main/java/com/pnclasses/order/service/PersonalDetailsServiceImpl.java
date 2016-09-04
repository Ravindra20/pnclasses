package com.pnclasses.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pnclasses.order.dao.PersonalDetailsDaoImpl;
import com.pnclasses.order.po.PersonalDetailsPO;
import com.pnclasses.order.vo.PersonalDetailsVO;

@Service("personalDetailsServiceImpl")
public class PersonalDetailsServiceImpl {
	
	public PersonalDetailsPO aPersonalDetailsPO;
	PersonalDetailsDaoImpl personalDetailsDaoImpl;

	@Autowired
	public void setPersonalDetailsDaoImpl(
			PersonalDetailsDaoImpl personalDetailsDaoImpl) {
		this.personalDetailsDaoImpl = personalDetailsDaoImpl;
	}

	public List<PersonalDetailsVO> getPersonalDetails() {
		List<PersonalDetailsVO> personalDetailsList = new ArrayList<PersonalDetailsVO>();
		personalDetailsList = personalDetailsDaoImpl.getPersonalDetails();
		return personalDetailsList;
	}
	public PersonalDetailsPO getPersonalDetailsPO() {
		if (aPersonalDetailsPO == null) {
			aPersonalDetailsPO = new PersonalDetailsPO();
		}
		return aPersonalDetailsPO;
	}
	public void setPersonalDetails(PersonalDetailsPO aPersonalDetailsPO) {
		System.out.println(aPersonalDetailsPO.getMemberName());
	}
}