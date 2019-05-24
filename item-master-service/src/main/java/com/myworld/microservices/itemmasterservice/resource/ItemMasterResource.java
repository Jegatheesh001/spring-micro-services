package com.myworld.microservices.itemmasterservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myworld.microservices.itemmasterservice.entity.ItemMaster;
import com.myworld.microservices.itemmasterservice.service.ItemMasterService;

/**
 * @author Jegatheesh <br>
 *         Created on 24-May-2019
 *
 */
@RestController
@RequestMapping(value = "${context.name}items")
public class ItemMasterResource {

	@Autowired
	private ItemMasterService itemMasterService;

	@RequestMapping
	public List<ItemMaster> getAllItems() {
		return itemMasterService.getAllItems();
	}
	
	@RequestMapping(value = "/{itemId}", method = RequestMethod.GET)
	public ItemMaster getItemById(@PathVariable Integer itemId) {
		return itemMasterService.getItemById(itemId);
	}
	
	@RequestMapping(value = "/name/{itemName}", method = RequestMethod.GET)
	public ItemMaster getItemByName(@PathVariable String itemName) {
		return itemMasterService.getItemByName(itemName);
	}
	
	@RequestMapping(value = "/code/{itemCode}", method = RequestMethod.GET)
	public ItemMaster getItemByCode(@PathVariable String itemCode) {
		return itemMasterService.getItemByCode(itemCode);
	}
	
	@RequestMapping(value = "/type/{itemType}", method = RequestMethod.GET)
	public List<ItemMaster> getItemByType(@PathVariable String itemType) {
		return itemMasterService.getItemByType(itemType);
	}

}
