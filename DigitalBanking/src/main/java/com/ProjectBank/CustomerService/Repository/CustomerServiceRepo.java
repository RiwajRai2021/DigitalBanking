package com.ProjectBank.CustomerService.Repository;

import com.ProjectBank.CustomerService.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerServiceRepo extends JpaRepository<Customer, Long> {
    Optional<Customer>findByEmail(String email);
    Optional<Customer>findByExternalId(String externalId);
    boolean existsByEmail(String email);

}
