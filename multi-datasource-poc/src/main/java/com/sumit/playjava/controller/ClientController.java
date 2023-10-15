package com.sumit.playjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;import com.sumit.playjava.client.Client;
import com.sumit.playjava.service.ClientService;

@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping("/set-client")
	public ResponseEntity<String> setClient(@RequestBody Client client) {
		if(!ObjectUtils.isEmpty(clientService.setClient(client)))
			return new ResponseEntity<>("Client Created !!!",HttpStatus.OK);
		return new ResponseEntity<>("Client Not Created !!!",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
