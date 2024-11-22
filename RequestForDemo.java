package com.glats.request.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RequestForDemo")
public class RequestForDemo {
	
	@Id
	@GeneratedValue
	public Integer requestId;
	@Column
	private String fullName;
	@Column
	private String companyName;
	@Column
	private String emailId;
	@Column
	private String comapnyWebsite;
	@Column
	private String phoneNumber;
	@Column
	private String extensionNumber;
	
	public RequestForDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestForDemo(Integer requestId, String fullName, String companyName, String emailId, String comapnyWebsite,
			String phoneNumber, String extensionNumber) {
		super();
		this.requestId = requestId;
		this.fullName = fullName;
		this.companyName = companyName;
		this.emailId = emailId;
		this.comapnyWebsite = comapnyWebsite;
		this.phoneNumber = phoneNumber;
		this.extensionNumber = extensionNumber;
	}
	public Integer getRequestId() {
		return requestId;
	}
	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getComapnyWebsite() {
		return comapnyWebsite;
	}
	public void setComapnyWebsite(String comapnyWebsite) {
		this.comapnyWebsite = comapnyWebsite;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getExtensionNumber() {
		return extensionNumber;
	}
	public void setExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
	}
	@Override
	public String toString() {
		return "RequestForDemo [requestId=" + requestId + ", fullName=" + fullName + ", companyName=" + companyName
				+ ", emailId=" + emailId + ", comapnyWebsite=" + comapnyWebsite + ", phoneNumber=" + phoneNumber
				+ ", extensionNumber=" + extensionNumber + "]";
	}	
}