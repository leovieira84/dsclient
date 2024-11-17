package br.com.leovieira.dsclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.leovieira.dsclient.dto.ClientDTO;
import br.com.leovieira.dsclient.entities.Client;
import br.com.leovieira.dsclient.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		return new ClientDTO(repository.findById(id).get()) ;
	}
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAll(Pageable pageable){
		Page<Client> page = repository.findAll(pageable);
		return page.map(x -> new ClientDTO(x));
	}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client client = new Client();
		copyDtoToEntity(dto, client);
		repository.save(client);
		return new ClientDTO(client);
	}
	
	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		Client client = repository.getReferenceById(id);
		copyDtoToEntity(dto, client);
		repository.save(client);
		return new ClientDTO(client);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void delete(Long id) {
		repository.deleteById(id);
	}

	private void copyDtoToEntity(ClientDTO dto, Client client) {
		client.setName(dto.getName());
		client.setCpf(dto.getCpf());
		client.setIncome(dto.getIncome());
		client.setBirthDate(dto.getBirthDate());
		client.setChildren(dto.getChildren());
	}
}
