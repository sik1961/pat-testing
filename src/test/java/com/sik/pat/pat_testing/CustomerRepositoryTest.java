package com.sik.pat.pat_testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sik.pat.repository.CustomerRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository custRepo;
	
	@Test
	public void test() {
		System.out.println(custRepo.findAll());
	}

}
