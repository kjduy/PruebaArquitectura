package ec.edu.espe.prueba.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tes_categoria_instrumento")
@Data
@NoArgsConstructor
public class CategoriaInstrumento {
    
    @EmbeddedId
    private CategoriaInstrumentoPK pk;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "tipo_renta", length = 2, nullable = false)
    private String tipoRenta;

    @ManyToOne
    @JoinColumn(name = "cod_empresa", referencedColumnName = "cod_empresa", insertable = false, updatable = false)
    private Empresa empresa;

    public CategoriaInstrumento(CategoriaInstrumentoPK pk) {
        this.pk = pk;
    }

}
