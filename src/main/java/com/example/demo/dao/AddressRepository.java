package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
}
