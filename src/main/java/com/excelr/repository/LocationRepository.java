package com.excelr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long>   {

}
