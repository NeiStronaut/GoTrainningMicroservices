package com.thiscounts.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TBL_COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private boolean active;
	private String stampModifier;
	private long stampModified;
	
}
