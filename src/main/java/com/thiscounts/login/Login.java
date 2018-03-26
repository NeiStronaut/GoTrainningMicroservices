package com.thiscounts.login;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TBL_VAULT")
@SuppressWarnings("unused")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
