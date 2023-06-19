package com.mehmed.validationandexceptionhandle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmed.validationandexceptionhandle.model.CustomerModel;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long>{

}
