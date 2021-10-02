package com.unaj.ajsw.tpintegrador.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Administrador")
@Table(name = "\"Administradores\"")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_usuario_administrador"))
public class Administrador extends Usuario implements Serializable {

    private static final long serialVersionUID = 6239493446604506958L;

}
