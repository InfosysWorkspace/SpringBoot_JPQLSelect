package com.infy.SpringBoot_JPQLSelect.repository;

import com.infy.SpringBoot_JPQLSelect.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepository {
//    public List<CustomerDTO> getCustomerDetails();
//    public List<Object[]> getCustomerNameAndDob();
//    public List<String> getCustomerNames();

//    JPQL GROUPING Demo
    public List<Object[]> getCustomerCountForCities();
}
