package com.canalogies.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canalogies.shop.model.Shipper;
import com.canalogies.shop.repository.ShipperRepository;
import com.canalogies.shop.service.ShipperService;

@RestController
public class ShipperController {

	@Autowired
	private ShipperService shipperService;
	
	@RequestMapping("/shippers")
	public List<Shipper> getAllShipper(){
		return shipperService.getAllShippers();
	}
	
	@RequestMapping("/shippers/name/{name}")
	public List<Shipper> getShipperByName(@PathVariable("name") String name){
		return shipperService.getShipperByName(name);
		}
	
	@RequestMapping("/shippers/id/{id}")
	public Shipper getShipperById(@PathVariable("id") int  id){
		return shipperService.getShipperById(id);
	}
	
	@RequestMapping(value = "/shippers",method = RequestMethod.POST)
	public void getShipper(@RequestBody Shipper shipper){
		shipperService.saveShipper(shipper);
	}
	
	@RequestMapping(value = "/shippers",method = RequestMethod.PUT)
	public void updateShipper(@RequestBody Shipper shipper){
		shipperService.updateShipper(shipper);
	}
}
