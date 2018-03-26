package com.thiscounts.discount;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TBL_COMPANY_DISCOUNT")
@SuppressWarnings("unused")
public class CompanyDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long companyId;
	private long discountId;
	private float percentage;
	private Date expirationDate;
	private boolean active;
	private String stampModifier;
	private long stampModified;

}
