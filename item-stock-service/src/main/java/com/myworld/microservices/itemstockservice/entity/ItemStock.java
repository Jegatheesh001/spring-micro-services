package com.myworld.microservices.itemstockservice.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Jegatheesh <br>
 *         Created on 24-May-2019
 *
 */
@Entity
@Data
@ApiModel(description = "Information About Item Stock Details")
public class ItemStock {

	@Id
	@GeneratedValue
	private Integer stockId;
	private Integer batch;
	@ApiModelProperty(notes = "Item Barcode details")
	private String barcode;
	private Double quantity;

	private Integer itemId;
	@Transient
	private ItemMaster item;
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
