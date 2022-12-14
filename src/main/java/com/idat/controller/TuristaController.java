package com.idat.controller;

@Controller
@RequestMapping("/api/turista/v1")
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.idat.model.Turista;
import com.idat.service.TuristaService;

public class TuristaController {
	@Autowired
	private  TuristaService service;

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Turista>> listar(){
		return new ResponseEntity<List<Turista>>(service.listar(), HttpStatus.OK) ;
	}
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Turista turista ){
		service.guardar(turista);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
