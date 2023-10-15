package com.sumit.playjava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.playjava.server.Server;
import com.sumit.playjava.server.ServerRepository;
import com.sumit.playjava.service.ServerService;

@Service
public class ServerServiceImpl implements ServerService{

	@Autowired
	private ServerRepository serverRepository;
	
	@Override
	public Server setServer(Server server) {
		return serverRepository.save(server);
	}

}
