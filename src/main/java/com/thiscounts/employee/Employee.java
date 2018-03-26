package com.thiscounts.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TBL_EMPLOYEE")
@SuppressWarnings("unused")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long companyId;
	private String name;
	private String nameAdditionals;
	private String lastName;
	private String lastNameAdditionals;
	private String rfc;
	private String mailBusines;
	private String mailPersonal;
	private boolean active;
	private String stampModifier;
	private long stampModified;

}
