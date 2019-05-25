package com.myworld.microservices.itemstockservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myworld.microservices.itemstockservice.entity.ItemMaster;

/**
 * @author Jegatheesh <br>
 *         Created on 25-May-2019
 *
 */
@FeignClient(name = "item-master-service", path = "/items")
public interface ItemMasterServiceProxy {

	@RequestMapping(value = "/{itemId}", method = RequestMethod.GET)
	public ItemMaster getItemById(@PathVariable Integer itemId);
	
}
