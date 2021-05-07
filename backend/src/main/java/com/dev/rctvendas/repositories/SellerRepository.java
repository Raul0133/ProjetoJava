package com.dev.rctvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.rctvendas.entities.Seller;


public interface SellerRepository extends JpaRepository<Seller, Long> {

}
