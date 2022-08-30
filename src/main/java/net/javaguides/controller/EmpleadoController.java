package net.javaguides.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.model.Empleado;
import net.javaguides.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleado")

public class EmpleadoController {

	private EmpleadoService empleadoService;

	public EmpleadoController(EmpleadoService empleadoService) {
		super();
		this.empleadoService = empleadoService;
	}
	
	//Crear empleado Rest API
	
	@PostMapping()
	public ResponseEntity<Empleado> saveEmpleado(@RequestBody Empleado empleado){
		return new ResponseEntity<Empleado>(empleadoService.saveEmpleado(empleado), HttpStatus.CREATED);
		
	}
	
}
