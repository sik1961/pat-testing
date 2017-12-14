package com.sik.pat.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.sik.pat.domain.Customer;
@Component
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	List<Customer> findByEmail(String email);

    List<Customer> findByName(String name);

    @Query("select c from Customer c where c.active = 'y'")
    Set<Customer> findActiveCustomers();
	
}
