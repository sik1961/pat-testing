package com.sik.pat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.sik.pat.domain.Customer;
@Component
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}
