package com.infy.SpringBoot_JPQLSelect;

import com.infy.SpringBoot_JPQLSelect.dto.CustomerDTO;
import com.infy.SpringBoot_JPQLSelect.service.CustomerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.util.List;

@SpringBootApplication
public class SpringBootJpqlSelectApplication implements CommandLineRunner {

	private static final Log LOGGER = LogFactory.getLog(SpringBootJpqlSelectApplication.class);

	@Autowired
	CustomerService service;

	@Autowired
	Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpqlSelectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
//		getCustomerDetails();
//		getCustomerNameAndDob();
//		getCustomerNames();

//		JPQL Grouping-Demo
		getCityWiseCustomerCount();

	}

//	// Get Customer Details
//	public void getCustomerDetails(){
//		try{
//			List<CustomerDTO> customerDTOs = service.getCustomerDetails();
//			for(CustomerDTO customerDTO : customerDTOs){
//				LOGGER.info(customerDTO);
//			}
//			LOGGER.info("\n");
//		} catch (Exception e){
//			String message = environment.getProperty(e.getMessage(),
//					"Some exception occured. Please check log file for more details.");
//			LOGGER.info(message);
//		}
//	}
//
//	// Get Customer Name and DoB
//	public void getCustomerNameAndDob(){
//		try{
//			List<Object[]> objects = service.getCustomerNameAndDob();
//			for(Object[] object : objects){
//				LOGGER.info(object[0] + "\t\t" +object[1]);
//			}
//			LOGGER.info("\n");
//		} catch (Exception e){
//			String message = environment.getProperty(e.getMessage(),
//					"Some exception occured. Please check log file for more details.");
//			LOGGER.info(message);
//		}
//	}
//
//	// Get Customer Names
//	public void getCustomerNames(){
//		try {
//			List<String> customerNames = service.getCustomerNames();
//			for(String name : customerNames){
//				LOGGER.info(name);
//			}
//			LOGGER.info("\n");
//		} catch (Exception e){
//			String message = environment.getProperty(e.getMessage(),
//					"Some exception occured. Please check log file for more details.");
//			LOGGER.info(message);
//		}
//	}

	//		JPQL Grouping-Demo
	public void getCityWiseCustomerCount(){
		try{
			List<Object[]> objects = service.getCustomerCountForCities();
			for(Object[] object: objects) {
				LOGGER.info(object[0] + " -> " + object[1]);
			}
		} catch (Exception e){
			String message = environment.getProperty(e.getMessage(), "Some exception occured. Please check log file for more details");
			LOGGER.info(message);
		}
	}
}
