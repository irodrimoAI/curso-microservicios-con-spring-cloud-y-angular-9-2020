package com.adriannavarrogabino.microservicios.respuestas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adriannavarrogabino.microservicios.respuestas.models.entity.Respuesta;
import com.adriannavarrogabino.microservicios.respuestas.models.services.IRespuestaService;

@RestController
public class RespuestaController {

	@Autowired
	private IRespuestaService service;
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Iterable<Respuesta> respuestas) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveAll(respuestas));
	}
}
