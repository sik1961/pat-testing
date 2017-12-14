package com.sik.pat.web;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sik.pat.repository.CustomerRepository;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerRepository customerRepo;
	
	

	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ModelAndView home() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("customerSet", customerRepo.findActiveCustomers());
		return new ModelAndView("customers",map);
	}

}
