package net.javaguides.service.impl;

import org.springframework.stereotype.Service;

import net.javaguides.model.Empleado;
import net.javaguides.repository.EmpleadoRepository;
import net.javaguides.service.EmpleadoService;

@Service

public class EmpleadoServiceImpl implements EmpleadoService {

	private EmpleadoRepository empleadoRepository;
	
	public EmpleadoServiceImpl(EmpleadoRepository empleadoRepository) {
		super();
		this.empleadoRepository = empleadoRepository;
	}



	@Override
	public Empleado saveEmpleado(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	
}
