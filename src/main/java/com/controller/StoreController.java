package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.StoreDetails;
import com.service.StoreDetailsService;

@RestController
public class StoreController {
	
	@Autowired
	private StoreDetailsService storeDetailsService;
	
	@PostMapping("/save/store")
    public StoreDetails saveStore(@RequestBody StoreDetails storeDetails) {
    	return storeDetailsService.saveStore(storeDetails);
    }
	
	@GetMapping("/list/all/store")
	public List<StoreDetails> allListOfStores(){
		return storeDetailsService.allListOfStores();
	}
	
	@DeleteMapping("/delete/store")
	public String deleteStore(@PathVariable Long id) {
		return storeDetailsService.deleteStore(id);
	}
	
	@PutMapping("/update/store")
	public StoreDetails updateStoreDetails(@PathVariable Long id, @RequestBody StoreDetails storeDetails) {
		return storeDetailsService.updateStoreDetails(id,storeDetails);
	}

}
