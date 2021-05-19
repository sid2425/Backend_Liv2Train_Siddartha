package com.example.rest.repository;

import com.example.rest.entities.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//- This represents Data access layer in j2ee architecture

@Repository
public interface TrainingCenterDao extends JpaRepository<TrainingCenter,Integer> {
}
