package ec.edu.espe.prueba.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
public class TipoInstrumentoPK implements Serializable {
    
    @Column(name = "cod_empresa", length = 8, nullable = false)
    private String codigo;

    @Column(name = "cod_tipo_instrumento", length = 15, nullable = false)
    private String codigoTipoInstrumento;

}
