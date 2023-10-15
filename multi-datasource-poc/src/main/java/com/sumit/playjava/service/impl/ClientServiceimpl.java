package com.sumit.playjava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.playjava.client.Client;
import com.sumit.playjava.client.ClientRepository;
import com.sumit.playjava.service.ClientService;

@Service
public class ClientServiceimpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Client setClient(Client client) {
		return clientRepository.save(client);
	}

}
