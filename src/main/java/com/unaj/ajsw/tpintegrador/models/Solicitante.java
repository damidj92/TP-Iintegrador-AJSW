package com.unaj.ajsw.tpintegrador.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "Solicitante")
@Table(name = "\"Solicitantes\"")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_usuario_solicitante"))
public class Solicitante extends Usuario implements Serializable {

    private static final long serialVersionUID = 7745171180867429686L;


}
