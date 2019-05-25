package com.myworld.microservices.itemstockservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myworld.microservices.itemstockservice.entity.ItemStock;
import com.myworld.microservices.itemstockservice.repository.ItemStockRepository;

/**
 * @author Jegatheesh <br>
 *         Created on 24-May-2019
 *
 */
@Service
public class ItemStockService {
	
	@Autowired
	private ItemMasterServiceProxy itemMasterProxy; 

	@Autowired
	private ItemStockRepository itemStockRepository;

	public ItemStock getStockById(Integer stockId) {
		Optional<ItemStock> stock = itemStockRepository.findById(stockId);
		return stock.isPresent() ? stock.get() : null;
	}

	public List<ItemStock> getStockByBarcode(String barcode) {
		return itemStockRepository.findByBarcodeIgnoreCase(barcode);
	}

	public ItemStock getStock(Integer officeId, Integer departmentId, String barcode) {
		Optional<ItemStock> opt = itemStockRepository.findByOfficeIdAndDepartmentIdAndBarcodeIgnoreCase(officeId, departmentId, barcode);
		if(opt.isPresent()) {
			ItemStock stock = opt.get();
			stock.setItem(itemMasterProxy.getItemById(stock.getItemId()));
			return stock;
		}
		return null;
	}
	
	public List<ItemStock> getStockByItemId(Integer itemId) {
		return itemStockRepository.findByItemIdOrderByExpiryDate(itemId);
	}
}
