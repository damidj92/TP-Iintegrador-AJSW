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
            name = "usuario_subasta_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "fk_usuario_subasta",
                    foreignKeyDefinition = "FOREIGN KEY (usuario_subasta_id)\n" +
                            "        REFERENCES public.\"UsuariosSubastas\" (id) MATCH SIMPLE\n" +
                            "        ON UPDATE CASCADE\n" +
                            "        ON DELETE CASCADE",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    @Getter
    @Setter
    private UsuarioSubasta usuarioSubasta;

    @Column(name = "comentario", nullable = false)
    @Getter
    @Setter
    private String comentario;
}
