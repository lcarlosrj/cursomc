package com.luiz.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayway.jsonpath.Option;
import com.luiz.cursomc.domain.Categoria;
import com.luiz.cursomc.repositories.CategoriaRepository;
import com.luiz.cursomc.services.execptions.ObjectNotFoundExeption;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExeption("Objeto nao encontrado! Id:"+ id+", Tipo: "+Categoria.class.getName()));
	}
	
}
