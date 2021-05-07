package com.dev.rctvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.rctvendas.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long> {

}
