package com.myworld.microservices.itemstockservice.entity;

import lombok.Data;

/**
 * @author Jegatheesh <br>
 *         Created on 25-May-2019
 *
 */
@Data
public class ItemMaster {

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

}
