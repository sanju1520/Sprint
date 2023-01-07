package com.abc.Traineeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.Traineeapp.entity.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee,Integer>{
	Trainee findBytraineeName(String name);

}
