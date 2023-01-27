package com.region.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.region.entities.Region;


public interface RegionRepository extends JpaRepository<Region,Long> {

}
