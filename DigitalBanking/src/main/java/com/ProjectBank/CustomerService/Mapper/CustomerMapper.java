package com.ProjectBank.CustomerService.Mapper;

import com.ProjectBank.CustomerService.DTO.CustomerRequest;
import com.ProjectBank.CustomerService.DTO.CustomerResponse;
import com.ProjectBank.CustomerService.Model.Customer;

public interface CustomerMapper {

    Customer toEntity(CustomerRequest request);

    CustomerResponse toResponse(Customer customer);


    
}
