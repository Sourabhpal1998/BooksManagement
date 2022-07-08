package com.service;

import java.util.List;

import com.entity.StoreDetails;

public interface StoreDetailsService {
	
	public StoreDetails saveStore(StoreDetails storeDetails);
	
	public List<StoreDetails> allListOfStores();
	
	public String deleteStore(Long id);
	
	public StoreDetails updateStoreDetails(Long id, StoreDetails storeDetails);

}
