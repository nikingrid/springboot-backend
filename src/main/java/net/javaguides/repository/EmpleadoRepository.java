package net.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.model.Empleado;

public interface EmpleadoRepository extends JpaRepository <Empleado, Long>{
	

}
