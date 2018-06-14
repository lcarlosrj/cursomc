package com.luiz.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luiz.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
