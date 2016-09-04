package com.pnclasses.order.vo;

import java.util.ArrayList;
import java.util.List;

public class PersonalDetailsVO {
	private String memberId;
	private String memberName;
	private String memberSurName;
	private int memberMobileNumber;
	private String memberEmail;
	private String memberAddress;
	private String relativeName;
	private String relativeMobileNumber;
	private String memberOf;

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

	public int getMemberMobileNumber() {
		return memberMobileNumber;
	}

	public void setMemberMobileNumber(int memberMobileNumber) {
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
public List<String> getHeaderDetails()
{
	List<String> headerList = new ArrayList<String>();
	headerList.add("memberId");
	headerList.add("memberName");
	headerList.add("memberSurName");
	headerList.add("memberMobileNumber");
	headerList.add("memberEmail");
	headerList.add("memberAddress");
	headerList.add("relativeName");
	headerList.add("relativeMobileNumber");
	headerList.add("memberOf");
	return headerList;
}
}
