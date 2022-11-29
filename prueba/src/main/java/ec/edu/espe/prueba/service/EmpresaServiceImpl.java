package ec.edu.espe.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ec.edu.espe.prueba.model.Empresa;
import ec.edu.espe.prueba.repository.EmpresaRepository;

@Repository
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Empresa> listarEmpresas() {
        return this.empresaRepository.findAll();
    }

    @Override
    public Empresa listarEmpresaPorNombre(String nombre) {
        return this.empresaRepository.buscarPorNombre(nombre).get(0);
    }

    @Override
    public Empresa actualizarEmpresa(Empresa empresa, Integer codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void borrarEmpresa(String codigo) {
        // TODO Auto-generated method stub
        
    }
    
}
