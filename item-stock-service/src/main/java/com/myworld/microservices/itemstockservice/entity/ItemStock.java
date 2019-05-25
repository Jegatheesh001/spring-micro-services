package com.myworld.microservices.itemstockservice.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Jegatheesh <br>
 *         Created on 24-May-2019
 *
 */
@Entity
@Data
public class ItemStock {

	@Id
	@GeneratedValue
	private Integer stockId;
	private Integer batch;
	private String barcode;
	private Double quantity;

	private Integer itemId;
	private Integer departmentId;
	private Integer officeId;

	private Double stockPrice;

	private Integer validity;
	private LocalDate expiryDate;

	/**
	 * Constructors starts here
	 */
	public ItemStock() {
		super();
	}
}
