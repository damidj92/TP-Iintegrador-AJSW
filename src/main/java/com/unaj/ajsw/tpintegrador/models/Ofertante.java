package com.unaj.ajsw.tpintegrador.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "Ofertante")
@Table(name = "\"Ofertantes\"")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_usuario_ofertante"))
public class Ofertante extends Usuario implements Serializable {

    private static final long serialVersionUID = 7207794638481755919L;

    @Column(name = "puntuacion", nullable = true)
    @Getter
    @Setter
    private double puntuacion;

    @OneToMany(mappedBy = "ofertante", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter
    @Setter
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "ofertante", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter
    @Setter
    private List<Oferta> ofertas;
}
