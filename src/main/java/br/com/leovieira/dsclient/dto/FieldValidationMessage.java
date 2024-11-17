package br.com.leovieira.dsclient.dto;

public class FieldValidationMessage {
	private String name;
	private String message;
	
	public FieldValidationMessage(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	
	public String getName() {
		return name;
	}
	public String getMessage() {
		return message;
	}
}
