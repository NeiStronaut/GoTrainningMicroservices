package com.thiscounts.discount;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TBL_COMPANY_DISCOUNT")
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

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id")
	private Discount discount;
}
