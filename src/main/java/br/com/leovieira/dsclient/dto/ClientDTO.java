package br.com.leovieira.dsclient.dto;

import java.time.LocalDate;

import br.com.leovieira.dsclient.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ClientDTO {
	private Long id;
	@NotBlank(message = "Nome deve ser informado")
	private String name;
	@NotBlank(message = "CPF deve ser informado")
	private String cpf;
	@Positive(message = "Salário deve ser um valor positivo")
	private Double income;
	@PastOrPresent(message = "Data de nascimento deve ser uma data passada")
	@NotNull(message = "A data de nascimento deve ser informada")
	private LocalDate birthDate;
	@PositiveOrZero(message = "Quantidade de filhos deve ser 0 ou superior")
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
