package com.infy.SpringBoot_JPQLSelect.repository;


import com.infy.SpringBoot_JPQLSelect.dto.CustomerDTO;
import com.infy.SpringBoot_JPQLSelect.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public List<CustomerDTO> getCustomerDetails(){
        List<CustomerDTO> customerDTOS = null;
        String queryString = "select c from Customer c";
        Query query = entityManager.createQuery(queryString);
        List<Customer> customers = query.getResultList();

        customerDTOS = new ArrayList<>();
        for(Customer customerEntity : customers){
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustomerId(customerEntity.getCustomerId());
            customerDTO.setDateOfBirth(customerEntity.getDateOfBirth());
            customerDTO.setEmailId(customerEntity.getEmailId());
            customerDTO.setName(customerEntity.getName());
            customerDTO.setCity(customerEntity.getCity());
            customerDTOS.add(customerDTO);
        }
        return customerDTOS;
    }

    public List<Object[]> getCustomerNameAndDob() {
        String queryString = "select c.name, c.dataOfBirth from Customer c";
        Query query = entityManager.createQuery(queryString);
        List<Object[]> result = query.getResultList();
        return result;
    }

    public List<String> getCustomerNames(){
        List<String> customerNames = null;
        String queryString = "select c.name from Customer c";
        Query query = entityManager.createQuery(queryString);
        return customerNames;
    }
}
