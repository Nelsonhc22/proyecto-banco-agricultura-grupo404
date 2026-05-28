package com.banco.agricultura.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "dependiente")
public class Dependiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dependiente")
    private Long idDependiente;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "nombre_comercio", length = 100)
    private String nombreComercio;

    @Column(name = "comisiones_acumuladas", precision = 10, scale = 2)
    private BigDecimal comisionesAcumuladas = BigDecimal.ZERO;
}