package com.myworld.microservices.itemstockservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myworld.microservices.itemstockservice.entity.ItemStock;

/**
 * @author Jegatheesh <br>
 *         Created on 24-May-2019
 *
 */
public interface ItemStockRepository extends JpaRepository<ItemStock, Integer> {

	public List<ItemStock> findByBarcodeIgnoreCase(String barcode);

	public Optional<ItemStock> findByOfficeIdAndDepartmentIdAndBarcodeIgnoreCase(Integer officeId, Integer departmentId,
			String barcode);
	
	public List<ItemStock> findByItemId(Integer itemId);
	public List<ItemStock> findByItemIdOrderByExpiryDate(Integer itemId);

}
