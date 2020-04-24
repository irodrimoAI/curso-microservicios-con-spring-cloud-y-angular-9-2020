package com.adriannavarrogabino.microservicios.respuestas.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adriannavarrogabino.microservicios.respuestas.models.entity.Respuesta;
import com.adriannavarrogabino.microservicios.respuestas.models.repository.IRespuestaRepository;

@Service
public class RespuestaServiceImpl implements IRespuestaService {

	@Autowired
	private IRespuestaRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {
		
		return repository.saveAll(respuestas);
	}

}
