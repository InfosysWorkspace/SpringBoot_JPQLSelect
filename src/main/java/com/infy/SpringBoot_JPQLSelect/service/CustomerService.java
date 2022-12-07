package com.infy.SpringBoot_JPQLSelect.service;

import com.infy.SpringBoot_JPQLSelect.dto.CustomerDTO;
import com.infy.SpringBoot_JPQLSelect.exception.InfyBankException;

import java.util.List;

public interface CustomerService {
//    public List<CustomerDTO> getCustomerDetails() throws InfyBankException;
//    public List<Object[]> getCustomerNameAndDob() throws InfyBankException;
//    public List<String> getCustomerNames() throws InfyBankException;

    //		JPQL Grouping-Demo
    public List<Object[]> getCustomerCountForCities() throws InfyBankException;
}
