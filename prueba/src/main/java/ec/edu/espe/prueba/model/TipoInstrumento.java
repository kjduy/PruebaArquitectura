package ec.edu.espe.prueba.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tes_tipo_instrumento")
@Data
@NoArgsConstructor
public class TipoInstrumento {

    @EmbeddedId
    private TipoInstrumentoPK pk;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "tipo_renta", length = 2, nullable = false)
    private String tipoRenta;

    @Column(name = "cod_clase_instrumento", length = 15, nullable = false)
    private String codigoClaseInstrumento;

    @Column(name = "estado", length = 3, nullable = false)
    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(
            name = "cod_empresa", referencedColumnName = "cod_empresa", 
            insertable = false, updatable = false, nullable = false
        ),
        @JoinColumn(
            name = "cod_categoria_instrumento", referencedColumnName = "cod_categoria_instrumento", 
            insertable = false, updatable = false, nullable = false
        )
    })
    private CategoriaInstrumento categoriaInstrumento;

    public TipoInstrumento(TipoInstrumentoPK pk) {
        this.pk = pk;
    }
    
}
