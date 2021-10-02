package com.unaj.ajsw.tpintegrador.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "Solicitante")
@Table(name = "\"Solicitantes\"")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_usuario_solicitante"))
public class Solicitante extends Usuario implements Serializable {

    private static final long serialVersionUID = 7745171180867429686L;

    @Column(name = "puntuacion", nullable = true)
    @Getter
    @Setter
    private double puntuacion;

    @OneToMany(mappedBy = "solicitante", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter
    @Setter
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "solicitante", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter
    @Setter
    private List<Trabajo> trabajos;
}
