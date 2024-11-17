package br.com.leovieira.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.leovieira.dsclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
