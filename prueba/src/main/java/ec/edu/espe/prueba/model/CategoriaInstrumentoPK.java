package ec.edu.espe.prueba.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
public class CategoriaInstrumentoPK implements Serializable {

    @Column(name = "cod_empresa", nullable = false)
    private Integer codigo;

    @Column(name = "cod_categoria_instrumento", length = 15, nullable = false)
    private String codigoCategoriaInstrumento;
    
}
