package com.unaj.ajsw.tpintegrador.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Oferta")
@Table(name = "\"Ofertas\"")
public class Oferta implements Serializable {

    private static final long serialVersionUID = -6621208977822715633L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long key_oferta;

    @ManyToOne
    @JoinColumn(
            name = "ofertante_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "fk_usuario_ofertante",
                    foreignKeyDefinition = "FOREIGN KEY (ofertante_id)\n" +
                            "        REFERENCES public.\"Ofertantes\" (id) MATCH SIMPLE\n" +
                            "        ON UPDATE CASCADE\n" +
                            "        ON DELETE CASCADE",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    @Getter
    @Setter
    private Ofertante ofertante;

    @ManyToOne
    @JoinColumn(
            name = "solicitud_id",
            referencedColumnName = "key_solicitud"
    )
    @Getter
    @Setter
    private Solicitud solicitud;

    @Column(name = "precio", nullable = false)
    @Getter
    @Setter
    private double precio;

    @Column(name = "descripcion", nullable = false)
    @Getter
    @Setter
    private String descripcion;

    @Column(name = "aprobado", columnDefinition = "boolean default false")
    @Getter
    @Setter
    private Boolean aprobado;
}
