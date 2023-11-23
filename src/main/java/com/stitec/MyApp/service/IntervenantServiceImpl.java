package com.stitec.MyApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stitec.MyApp.dao.IntervenantRepository;
import com.stitec.MyApp.entity.Intervenant;


@Service
public class IntervenantServiceImpl implements IntervenantService {
	
	private IntervenantRepository intervenantRepository;
	
	@Autowired
	public IntervenantServiceImpl(IntervenantRepository theIntervenantRepository) {
		intervenantRepository = theIntervenantRepository;
	}

	@Override
	public List<Intervenant> findAll() {
		
		return intervenantRepository.findAll();

	}
}
