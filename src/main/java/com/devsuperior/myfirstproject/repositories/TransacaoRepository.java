package com.devsuperior.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}
