package ec.edu.espe.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.prueba.model.TipoInstrumento;
import ec.edu.espe.prueba.model.TipoInstrumentoPK;

public interface TipoInstrumentoRepository extends JpaRepository<TipoInstrumento, TipoInstrumentoPK>{

    List<TipoInstrumento> findByPkCodigo(String codigo);

    List<TipoInstrumento> findByPkCodigoTipoInstrumento(String codigoTipoInstrumento);
    
}
