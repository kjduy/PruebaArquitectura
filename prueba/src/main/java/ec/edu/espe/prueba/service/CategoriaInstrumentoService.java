package ec.edu.espe.prueba.service;

import java.util.List;

import ec.edu.espe.prueba.model.CategoriaInstrumento;

public interface CategoriaInstrumentoService {
    
    CategoriaInstrumento crearCategoriaInstrumento(CategoriaInstrumento categoriaInstrumento);

    List<CategoriaInstrumento> listarCategoriaInstrumentos();

    Empresa actualizarEmpresa(Empresa empresa, Integer codigo);

    void borrarEmpresa(String codigo);

}
