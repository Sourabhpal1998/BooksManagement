package com.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.StoreDetails;

@Repository
public interface StoreDetailsRepositiory extends JpaRepository<StoreDetails, Long> {

}
