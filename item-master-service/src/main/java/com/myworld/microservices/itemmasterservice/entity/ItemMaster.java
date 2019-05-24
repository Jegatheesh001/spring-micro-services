package com.myworld.microservices.itemmasterservice.entity;

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
public class ItemMaster {

	@Id
	@GeneratedValue
	private Integer itemId;
	private String itemName;
	private String itemCode;

	private String salable;
	private String itemType;

	private String purchaseUnit;
	private String saleUnit;
	private Integer multiplier;

	private Double puchasePrice;
	private Double salePrice;

	/**
	 * Constructors starts here
	 */
	public ItemMaster() {
		super();
	}

	public ItemMaster(Integer itemId, String itemName, String itemCode) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCode = itemCode;
	}

}
