package com.devsuperior.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.formaPagamento;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<formaPagamento,Long>{

}
