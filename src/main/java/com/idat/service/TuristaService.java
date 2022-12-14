package com.idat.service;

import java.util.List;

import com.idat.model.Turista;



public interface TuristaService {
	List<Turista> listar();
	void guardar(Turista turista);
}
