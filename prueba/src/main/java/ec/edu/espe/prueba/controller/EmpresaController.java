package ec.edu.espe.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.prueba.model.Empresa;
import ec.edu.espe.prueba.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/all")
    public List<Empresa> listarEmpresas() {
        return this.empresaService.listarEmpresas();
    }
    
}
