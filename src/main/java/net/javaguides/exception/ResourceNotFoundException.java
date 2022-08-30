package net.javaguides.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String resourceNombre;
	private String fieldNombre;
	private Object fieldValor;
	
	
	public ResourceNotFoundException(String resourceNombre, String fieldNombre, Object fieldValor) {
		super(String.format("%s not found with %s : '%s'", resourceNombre, fieldNombre, fieldValor));
		this.resourceNombre = resourceNombre;
		this.fieldNombre = fieldNombre;
		this.fieldValor = fieldValor;
	}

	public String getResouceNombre() {
		return resourceNombre;
	}
	
	public String getFieldNombre() {
		return fieldNombre;
	}
	
	public Object getFieldValor() {
		return fieldValor;
	}
	
	
}
