package com.mx.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mx.springboot.model.Beer;


@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long>{

}
