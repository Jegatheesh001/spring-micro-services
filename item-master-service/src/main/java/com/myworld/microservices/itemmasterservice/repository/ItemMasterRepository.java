package com.myworld.microservices.itemmasterservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myworld.microservices.itemmasterservice.entity.ItemMaster;

/**
 * @author Jegatheesh <br>
 *         Created on 24-May-2019
 *
 */
public interface ItemMasterRepository extends JpaRepository<ItemMaster, Integer> {

	public ItemMaster findByItemName(String itemName);
	public ItemMaster findByItemNameIgnoreCase(String itemName);
	public ItemMaster findByItemNameContainingIgnoreCase(String itemName);
	
	public ItemMaster findByItemCode(String itemCode);
	
	public List<ItemMaster> findByItemType(String itemType);
	public List<ItemMaster> findByItemTypeIgnoreCase(String itemType);
	public List<ItemMaster> findByItemTypeContainingIgnoreCase(String itemType);

}
