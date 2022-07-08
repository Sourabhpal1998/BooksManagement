package com.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.StoreDetails;
import com.exception.ResourceNotFoundException;
import com.repositiory.StoreDetailsRepositiory;
import com.service.StoreDetailsService;

@Service
public class StoreDetailsImpl implements StoreDetailsService {

	@Autowired
	private StoreDetailsRepositiory storeDetailsRepositiory;
	
	
	@Override
	public StoreDetails saveStore(StoreDetails storeDetails) {
		return storeDetailsRepositiory.save(storeDetails);
	}

	@Override
	public List<StoreDetails> allListOfStores() {
		return storeDetailsRepositiory.findAll();
	}

	@Override
	public String deleteStore(Long id){
		StoreDetails storeDetails = storeDetailsRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("Store id is invalid" +id));
		storeDetailsRepositiory.delete(storeDetails);
		return "Store Deleted";
	}

	@Override
	public StoreDetails updateStoreDetails(Long id, StoreDetails storeDetails) {
		StoreDetails storeDetails2 = storeDetailsRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("Store id is invalid" +id));
		storeDetails2.setStoreName(storeDetails2.getStoreName());
		storeDetails2.setLocation(storeDetails.getLocation());
		storeDetailsRepositiory.save(storeDetails2);
		return storeDetails2;
	}

}
