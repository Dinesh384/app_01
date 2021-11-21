package com.dk.Entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="CONTACT_DETAILS")
public class Contact { 

	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID") 
	private Integer contactId;
  int a = 10;
  int b = 500;
  a+b = int c;
	 
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="CONTACT_PHO_NO") 
	private Long contactPhoNo;
	
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	 
	@Column(name="ACTIVE_SW")
	private String activeSw;
	
	@Column(name="CREATED_DATE",updatable = false)
	@CreationTimestamp
	private LocalTime createdDate;
	
	@Column(name="UPDATED_DATE", insertable = false)
	@UpdateTimestamp
	private LocalTime updateddate;
	
	

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	} 

	public Long getContactPhoNo() {
		return contactPhoNo;
	}

	public void setContactPhoNo(Long contactPhoNo) {
		this.contactPhoNo = contactPhoNo;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public LocalTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalTime createdDate) {
		this.createdDate = createdDate;
	}
 
	public LocalTime getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(LocalTime updateddate) {
		this.updateddate = updateddate;
	}
	
	

	}

