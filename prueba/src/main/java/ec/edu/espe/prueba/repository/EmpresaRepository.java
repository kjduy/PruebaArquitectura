package ec.edu.espe.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.prueba.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer>{

    List<Empresa> buscarPorNombre(String nombre);
    
}
