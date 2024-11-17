package br.com.leovieira.dsclient.dto;

import java.time.LocalDate;

import br.com.leovieira.dsclient.entities.Client;

public class ClientDTO {
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private LocalDate birthDate;
	private Integer children;
	
	public ClientDTO() {}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birthDate = entity.getBirthDate();
		this.children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
}
