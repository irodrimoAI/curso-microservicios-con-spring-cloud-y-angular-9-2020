package com.adriannavarrogabino.microservicios.respuestas.models.services;

import com.adriannavarrogabino.microservicios.respuestas.models.entity.Respuesta;

public interface IRespuestaService {
	
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);

}
