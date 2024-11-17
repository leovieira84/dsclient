package br.com.leovieira.dsclient.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 3612389949216085581L;
	
	public ResourceNotFoundException() {
		super("Recurso não encontrado");
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
