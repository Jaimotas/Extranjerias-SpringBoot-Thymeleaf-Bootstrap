package com.es.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.es.models.Extranjero;

@Repository
public interface IExtranjeroRepository extends JpaRepository<Extranjero, Integer> {

}
