package com.pnclasses.order.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pnclasses.order.dao.PersonalDetailsDao;
import com.pnclasses.order.dao.PersonalDetailsDaoImpl;
import com.pnclasses.order.po.PersonalDetailsPO;
import com.pnclasses.order.service.PersonalDetailsService;
import com.pnclasses.order.service.PersonalDetailsServiceImpl;
import com.pnclasses.order.vo.PersonalDetailsVO;

@ManagedBean(name = "personaldetailsbean")
@Controller
public class PersonalDetailsMPB {

	private String memberId;
	private String memberName;
	private String memberSurName;
	private String memberMobileNumber;
	private String memberEmail;
	private String memberAddress;
	private String relativeName;
	private String relativeMobileNumber;
	private String memberOf;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private String memberGender;
	public PersonalDetailsPO aPersonalDetailsPO;
	@ManagedProperty(value = "#{PersonalDetailsServiceImpl}")
	PersonalDetailsServiceImpl personalDetailsServiceImpl;

	@Autowired
	public void setPersonalDetailsServiceImpl(
			PersonalDetailsServiceImpl personalDetailsServiceImpl) {
		this.personalDetailsServiceImpl = personalDetailsServiceImpl;
	}

	public PersonalDetailsPO getPersonalDetailsPO() {
		if (aPersonalDetailsPO == null) {
			aPersonalDetailsPO = personalDetailsServiceImpl
					.getPersonalDetailsPO();
		}
		return aPersonalDetailsPO;
	}

	public String getMemberId() {
		return getPersonalDetailsPO().getMemberId();
	}

	public void setMemberId(String memberId) {
		getPersonalDetailsPO().setMemberId(memberId);
	}

	public String getMemberName() {
		return getPersonalDetailsPO().getMemberName();
	}

	public void setMemberName(String memberName) {
		getPersonalDetailsPO().setMemberName(memberName);
	}

	public String getMemberSurName() {
		return getPersonalDetailsPO().getMemberSurName();
	}

	public void setMemberSurName(String memberSurName) {
		getPersonalDetailsPO().setMemberSurName(memberSurName);
	}

	public String getMemberMobileNumber() {
		return getPersonalDetailsPO().getMemberMobileNumber();
	}

	public void setMemberMobileNumber(String memberMobileNumber) {
		getPersonalDetailsPO().setMemberMobileNumber(memberMobileNumber);
	}

	public String getMemberEmail() {
		return getPersonalDetailsPO().getMemberEmail();
	}

	public void setMemberEmail(String memberEmail) {
		getPersonalDetailsPO().setMemberEmail(memberEmail);
	}

	public String getMemberAddress() {
		return getPersonalDetailsPO().getMemberAddress();
	}

	public void setMemberAddress(String memberAddress) {
		getPersonalDetailsPO().setMemberAddress(memberAddress);
	}

	public String getRelativeName() {
		return getPersonalDetailsPO().getRelativeName();
	}

	public void setRelativeName(String relativeName) {
		getPersonalDetailsPO().setRelativeName(relativeName);
	}

	public String getRelativeMobileNumber() {
		return getPersonalDetailsPO().getRelativeMobileNumber();
	}

	public void setRelativeMobileNumber(String relativeMobileNumber) {
		getPersonalDetailsPO().setRelativeMobileNumber(relativeMobileNumber);
	}

	public String getMemberOf() {
		return memberOf;
	}

	public void setMemberOf(String memberOf) {
		this.memberOf = memberOf;
	}

	public Date getDateOfBirth() {
		return getPersonalDetailsPO().getDateOfBirth();
	}

	public void setDateOfBirth(Date dateOfBirth) {
		getPersonalDetailsPO().setDateOfBirth(dateOfBirth);
	}

	public Date getDateOfJoining() {
		return getPersonalDetailsPO().getDateOfJoining();
	}

	public void setDateOfJoining(Date dateOfJoining) {
		getPersonalDetailsPO().setDateOfJoining(dateOfJoining);
	}

	public String getMemberGender() {
		return getPersonalDetailsPO().getMemberGender();
	}

	public void setMemberGender(String memberGender) {
		getPersonalDetailsPO().setMemberGender(memberGender);
	}
	
	public List<PersonalDetailsVO> getMembersDetails() {
		System.out.println("brfore");
		List<PersonalDetailsVO> membersDetailsList = new ArrayList<PersonalDetailsVO>();

		membersDetailsList = personalDetailsServiceImpl.getPersonalDetails();
		return membersDetailsList;
	}
	public void doContinue()
	{
		personalDetailsServiceImpl.setPersonalDetails(aPersonalDetailsPO);
	}
}