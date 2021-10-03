package com.unaj.ajsw.tpintegrador.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "UsuarioSubasta")
@Table(name = "\"UsuariosSubastas\"")
@Inheritance(strategy = InheritanceType.JOINED)
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_usuario_subasta"))
public class UsuarioSubasta extends Usuario implements Serializable {

    private static final long serialVersionUID = 351636872921155172L;

    @Column(name = "puntuacion", nullable = true)
    @Getter
    @Setter
    private double puntuacion;

    @OneToMany(mappedBy = "usuarioSubasta", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter
    @Setter
    private List<Comentario> comentarios;
}
