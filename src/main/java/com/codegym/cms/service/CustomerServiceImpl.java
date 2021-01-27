package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

//    @Override
//    public List<Customer> findAll() {
//        return new ArrayList<>(customers.values());
//    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void update(Long id, Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }
}
