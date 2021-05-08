package com.dev.rctvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.rctvendas.dto.SaleSuccessDTO;
import com.dev.rctvendas.dto.SaleSumDTO;
import com.dev.rctvendas.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.dev.rctvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))  "
			+ " FROM Sale AS obj  GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.dev.rctvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))  "
			+ " FROM Sale AS obj  GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

	
}
