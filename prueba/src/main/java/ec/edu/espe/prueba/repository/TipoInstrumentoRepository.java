package ec.edu.espe.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.prueba.model.TipoInstrumento;
import ec.edu.espe.prueba.model.TipoInstrumentoPK;

public interface TipoInstrumentoRepository extends JpaRepository<TipoInstrumento, TipoInstrumentoPK>{
    
}
