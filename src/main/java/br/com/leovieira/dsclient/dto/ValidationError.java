package br.com.leovieira.dsclient.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {
	
	private List<FieldValidationMessage> errors = new ArrayList<>();

	public ValidationError(Instant timestamp, Integer status, String error, String path) {
		super(timestamp, status, error, path);
	}

	public List<FieldValidationMessage> getErrors() {
		return errors;
	}
	
	public void addErro(String field, String msg) {
		errors.add(new FieldValidationMessage(field, msg));
	}

}
