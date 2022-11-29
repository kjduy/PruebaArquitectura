package ec.edu.espe.prueba.service;

import java.util.List;

import ec.edu.espe.prueba.model.Empresa;

public interface EmpresaService {
    
    Empresa crearEmpresa(Empresa empresa);

    List<Empresa> listarEmpresas();

    Empresa listarEmpresaPorNombre(String nombre);

    Empresa actualizarEmpresa(Empresa empresa, Integer codigo);

    void borrarEmpresa(String codigo);

}
