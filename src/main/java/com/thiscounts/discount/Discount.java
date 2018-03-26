package com.thiscounts.discount;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TBL_DISCOUNT")
@SuppressWarnings("unused")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String shop;
	private String shopType;
	private String description;
	private boolean active;
	private String stampModifier;
	private long stampModified;

}
