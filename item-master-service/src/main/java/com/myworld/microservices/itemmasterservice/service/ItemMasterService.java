package com.myworld.microservices.itemmasterservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myworld.microservices.itemmasterservice.entity.ItemMaster;
import com.myworld.microservices.itemmasterservice.repository.ItemMasterRepository;

/**
 * @author Jegatheesh <br>
 *         Created on 24-May-2019
 *
 */
@Service
public class ItemMasterService {

	@Autowired
	private ItemMasterRepository itemMasterRepository;

	public List<ItemMaster> getAllItems() {
		return itemMasterRepository.findAll();
	}

	public ItemMaster getItemById(Integer itemId) {
		Optional<ItemMaster> item = itemMasterRepository.findById(itemId);
		return item.isPresent() ? item.get() : null;
	}

	public ItemMaster getItemByName(String itemName) {
		return itemMasterRepository.findByItemNameIgnoreCase(itemName);
	}

	public ItemMaster getItemByCode(String itemCode) {
		return itemMasterRepository.findByItemCode(itemCode);
	}

	public List<ItemMaster> getItemByType(String itemType) {
		return itemMasterRepository.findByItemTypeContainingIgnoreCase(itemType);
	}
}
