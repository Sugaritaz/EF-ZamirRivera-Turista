package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.model.Turista;
import com.idat.repository.TuristaRepository;


public class TuristaServiceImpl implements TuristaService {

	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<Turista> listar() {
		return repository.findAll();
		
	}

	@Override
	public void guardar(Turista turista) {
		repository.save(turista);
		
	}

}
