package ec.edu.espe.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.prueba.model.CategoriaInstrumento;
import ec.edu.espe.prueba.model.CategoriaInstrumentoPK;

public interface CategoriaInstrumentoRepository extends JpaRepository<CategoriaInstrumento, CategoriaInstrumentoPK> {

    List<CategoriaInstrumento> findByPkCodigo(Integer codigo);

    List<CategoriaInstrumento> findByPkCodigoCategoriaInstrumento(String codigoCategoriaInstrumento);
    
}
