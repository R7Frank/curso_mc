package com.r7frank.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r7frank.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
