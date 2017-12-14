package com.sik.pat.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.sik.pat.domain.Customer;
import com.sik.pat.domain.TestResult;

@Component
public interface TestResultRepository extends CrudRepository<TestResult, String>{
	
	@Query("select r from TestResult r where r.cust_id = ':cust_id'")
    Set<Customer> findResultsByCustomer(@Param(value="cust_id") String customerId);

}
