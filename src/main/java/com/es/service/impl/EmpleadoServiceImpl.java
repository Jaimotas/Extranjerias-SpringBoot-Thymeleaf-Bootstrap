package com.es.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.es.models.Extranjero;
import com.es.service.IExtranjeroService;
import com.es.repository.IExtranjeroRepository;

@Service
public class EmpleadoServiceImpl implements IExtranjeroService{

	@Autowired
	private IExtranjeroRepository extranjeroRepository;
	
	@Override
	public List<Extranjero> ListarExtranjeros() {
		return extranjeroRepository.findAll();
	}

}
