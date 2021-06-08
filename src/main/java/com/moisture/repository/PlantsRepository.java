package com.moisture.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.moisture.entity.Plants;



public interface PlantsRepository extends JpaRepository<Plants, Long>{
	
	
}
