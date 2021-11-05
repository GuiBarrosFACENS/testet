package com.devsuperior.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.Descricao;

@Repository
public interface DescricaoRepository extends JpaRepository<Descricao, Long>{

}
