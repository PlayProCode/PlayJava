package com.sumit.playjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.playjava.server.Server;
import com.sumit.playjava.service.ServerService;

@RestController
public class ServerController {
	
	@Autowired
	private ServerService serverService;

	@PostMapping("/set-server")
	public ResponseEntity<String> setServer(@RequestBody Server server) {
		if(!ObjectUtils.isEmpty(serverService.setServer(server)))
			return new ResponseEntity<>("Server Created !!!",HttpStatus.OK);
		return new ResponseEntity<>("Server Not Created !!!",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
