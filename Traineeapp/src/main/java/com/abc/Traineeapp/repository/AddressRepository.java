package com.abc.Traineeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.Traineeapp.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}