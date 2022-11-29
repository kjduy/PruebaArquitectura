package ec.edu.espe.prueba.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gen_empresa")
@Data
@NoArgsConstructor
public class Empresa {

    @Id
    @Column(name = "cod_empresa", nullable = false)
    private Integer codigo;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "cod_logotipo_empresa", scale = 8, nullable = false)
    private BigDecimal codigoLogotipoEmpresa;

    @Column(name = "cod_logotipo_reporte", scale = 8, nullable = false)
    private BigDecimal codigoLogotipoReporte;

    public Empresa(Integer codigo) {
        this.codigo = codigo;
    }

}
