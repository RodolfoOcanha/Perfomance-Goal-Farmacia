package com.projetofarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.projetofarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
	
	public List <Categoria> findAllByNomeCategoriaContainingIgnoreCase (@Param ("nomeCategoria")String nomeCategoria);

}
