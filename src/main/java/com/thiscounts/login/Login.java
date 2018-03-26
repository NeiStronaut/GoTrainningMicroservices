package com.thiscounts.login;

import javax.persistence.Entity;

import lombok.Data;

@Data
//@Entity
public class Login {
	
	private long id;
	private long employeeId;
	private String hash;
	private String roles;
	private int failedAttempts;
	private boolean openSession;
	private boolean locked;
	private String stampModifier;
	private long stampModified;

}
