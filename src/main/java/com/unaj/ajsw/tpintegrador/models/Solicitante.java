package com.unaj.ajsw.tpintegrador.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
public class Solicitante extends UsuarioSubasta implements Serializable {

    private static final long serialVersionUID = 7745171180867429686L;

    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "key_solicitud"
    )
    @JsonIdentityReference(alwaysAsId = true)
    @OneToMany(mappedBy = "solicitante", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter
    @Setter
    private List<Solicitud> solicitudes;
}
