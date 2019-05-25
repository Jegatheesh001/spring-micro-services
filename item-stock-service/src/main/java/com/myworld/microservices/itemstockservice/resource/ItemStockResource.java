package com.myworld.microservices.itemstockservice.resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myworld.microservices.itemstockservice.entity.ItemStock;
import com.myworld.microservices.itemstockservice.service.ItemStockService;

/**
 * @author Jegatheesh <br>
 *         Created on 24-May-2019
 *
 */
@RestController
@RequestMapping(value = "${context.name}stock")
public class ItemStockResource {

	@Autowired
	private ItemStockService itemStockService;
	
	@RequestMapping
	public String execute() {
		return "Stock Management";
	}
	
	@RequestMapping(value = "/id/{stockId}", method = RequestMethod.GET)
	public ItemStock getStockById(@PathVariable Integer stockId) {
		return itemStockService.getStockById(stockId);
	}
	
	@RequestMapping(value = "/barcode/{barcode}", method = RequestMethod.GET)
	public List<ItemStock> getStockByBarcode(@PathVariable String barcode) {
		return itemStockService.getStockByBarcode(barcode);
	}
	
	@RequestMapping(value = "/{officeId}/{departmentId}/{barcode}", method = RequestMethod.GET)
	public ItemStock getStock(@PathVariable Integer officeId, @PathVariable Integer departmentId, @PathVariable String barcode) {
		ItemStock stock = itemStockService.getStock(officeId, departmentId, barcode);
		/*Resource<ItemStock> resource = new Resource<>(stock);
		Link selfRel = linkTo(methodOn(ItemMasterServiceProxy.class).getItemById(stock.getItemId())).withSelfRel();
		resource.add(selfRel.withRel("item-master"));*/
		return stock;
	}
	
	@RequestMapping(value = "/item/{itemId}", method = RequestMethod.GET)
	public List<ItemStock> getStockByItemId(@PathVariable Integer itemId) {
		return itemStockService.getStockByItemId(itemId);
	}
}
