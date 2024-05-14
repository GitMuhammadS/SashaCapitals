package com.shahbaz.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahbaz.entity.Sasha;
import com.shahbaz.repository.SashaRepository;

@Service
public class SashaServiceImpl implements ISashaService{
	@Autowired
	private SashaRepository repo;
	
	@Override
	public String saveSasha(Sasha sasha) {
		String username="SHA"+new Random().nextInt(999999);
		sasha.setUserId(username);
		repo.save(sasha);
		
		return "You have been registered with username: "+username;
	}

}
