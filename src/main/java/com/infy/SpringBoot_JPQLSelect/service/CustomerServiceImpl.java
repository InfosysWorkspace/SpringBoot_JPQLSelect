package com.infy.SpringBoot_JPQLSelect.service;

import com.infy.SpringBoot_JPQLSelect.dto.CustomerDTO;
import com.infy.SpringBoot_JPQLSelect.exception.InfyBankException;
import com.infy.SpringBoot_JPQLSelect.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements  CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
//
//    @Override
//    public List<CustomerDTO> getCustomerDetails() throws InfyBankException{
//        return customerRepository.getCustomerDetails();
//    }
//
//    @Override
//    public List<Object[]> getCustomerNameAndDob() throws InfyBankException{
//        return customerRepository.getCustomerNameAndDob();
//    }
//
//    @Override
//    public List<String> getCustomerNames() throws InfyBankException{
//        return customerRepository.getCustomerNames();
//    }


    //		JPQL Grouping-Demo
    @Override
    public List<Object[]> getCustomerCountForCities() throws InfyBankException {
        return customerRepository.getCustomerCountForCities();
    }
}
