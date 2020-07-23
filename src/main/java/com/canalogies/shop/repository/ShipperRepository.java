package com.canalogies.shop.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.canalogies.shop.model.Shipper;

@Repository
public interface ShipperRepository extends CrudRepository<Shipper, Integer>{
	
	public List<Shipper> findByShipperName(String shipperName);
}
