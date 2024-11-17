package br.com.leovieira.dsclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leovieira.dsclient.dto.ClientDTO;
import br.com.leovieira.dsclient.services.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {
	@Autowired
	ClientService service;
	
	@GetMapping
	public Page<ClientDTO> allClients(Pageable pageable){
		return service.findAll(pageable);
	}
}
