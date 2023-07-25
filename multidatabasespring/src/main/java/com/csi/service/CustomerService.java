package com.csi.service;

import com.csi.model.Customer;
import com.csi.repo.customer.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepoImpl;

    public List<Customer> getAllData(){
        return customerRepoImpl.findAll();
    }


    public Customer saveData(Customer customer){
        return customerRepoImpl.save(customer);
    }
}
