package com.unaj.ajsw.tpintegrador.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Comentario")
@Table(name = "\"Comentarios\"")
public class Comentario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long key_comentario;

    @ManyToOne
    @JoinColumn(
            name = "solicitante_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "fk_usuario_solicitante",
                    foreignKeyDefinition = "FOREIGN KEY (solicitante_id)\n" +
                            "        REFERENCES public.\"Solicitantes\" (id) MATCH SIMPLE\n" +
                            "        ON UPDATE CASCADE\n" +
                            "        ON DELETE CASCADE",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    @Getter
    @Setter
    private Solicitante solicitante;

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

    @Column(name = "comentario", nullable = false)
    @Getter
    @Setter
    private String comentario;
}
