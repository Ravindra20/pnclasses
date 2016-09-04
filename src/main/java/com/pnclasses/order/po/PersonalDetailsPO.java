package com.pnclasses.order.po;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*@Entity
@Table(name = "personaldetails")*/
public class PersonalDetailsPO {
	@Id @GeneratedValue
	@Column(name = "MemberId")
	private String memberId;
	@Column(name = "Name")
	private String memberName;
	@Column(name = "Surname")
	private String memberSurName;
	@Column(name = "MobileNmber")
	private String memberMobileNumber;
	@Column(name = "Email")
	private String memberEmail;
	@Column(name = "Address")
	private String memberAddress;
	@Column(name = "MemberId")
	private String relativeName;
	@Column(name = "MemberId")
	private String relativeMobileNumber;
	@Column(name = "MemberId")
	private String memberOf;
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	@Column(name = "DATE_OF_JOINING")
	private Date dateOfJoining;
	@Column(name = "GENDER")
	private String memberGender;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberSurName() {
		return memberSurName;
	}
	public void setMemberSurName(String memberSurName) {
		this.memberSurName = memberSurName;
	}
	public String getMemberMobileNumber() {
		return memberMobileNumber;
	}
	public void setMemberMobileNumber(String memberMobileNumber) {
		this.memberMobileNumber = memberMobileNumber;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getRelativeName() {
		return relativeName;
	}
	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}
	public String getRelativeMobileNumber() {
		return relativeMobileNumber;
	}
	public void setRelativeMobileNumber(String relativeMobileNumber) {
		this.relativeMobileNumber = relativeMobileNumber;
	}
	public String getMemberOf() {
		return memberOf;
	}
	public void setMemberOf(String memberOf) {
		this.memberOf = memberOf;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	

}
