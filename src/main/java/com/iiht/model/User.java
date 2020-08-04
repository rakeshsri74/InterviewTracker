package com.iiht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "User")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserId")
	private long userId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "ReportingTo")
	private String reportingTo;
	
	@Column(name = "UserType")
	private String userType;
	
	@Column(name = "UserStatus")
	private String userStatus;
	
	@Column(name = "Mobile")
	private String mobile;
	
		
}
