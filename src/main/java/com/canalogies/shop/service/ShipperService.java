package com.canalogies.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canalogies.shop.model.Shipper;
import com.canalogies.shop.repository.ShipperRepository;

@Service
public class ShipperService {

	@Autowired
	private ShipperRepository shipperRepository;
	
	public List<Shipper> getAllShippers(){
		return (List<Shipper>)shipperRepository.findAll();
	}
	
	public List<Shipper> getShipperByName(String shipperName){
		return (List<Shipper>)shipperRepository.findByShipperName(shipperName);
	}
	
	public Shipper getShipperById(int id){
		return shipperRepository.findById(id).get();
	}
	
	public void saveShipper(Shipper shipper){
		shipperRepository.save(shipper);
		shipper = shipperRepository.findById(shipper.getId()).get();
		shipper.setShipperId("SHIP_"+shipper.getId());
		updateShipper(shipper);
	}
	
	public void updateShipper(Shipper shipper) {
		shipper = shipperRepository.findById(shipper.getId()).get();
		shipperRepository.save(shipper);
	}
}
