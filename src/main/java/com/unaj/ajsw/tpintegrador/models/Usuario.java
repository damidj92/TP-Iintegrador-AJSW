package com.unaj.ajsw.tpintegrador.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Usuario")
@Table(name = "\"Usuarios\"")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    @Setter
    private Integer Id;

    @Column(name = "usuario", nullable = false)
    @Getter
    @Setter
    private String usuario;

    @Column(name = "password", nullable = false)
    @Getter
    @Setter
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    @Getter
    @Setter
    private String email;

    @Column(name = "nombre", nullable = false)
    @Getter
    @Setter
    private String nombre;

    @Column(name = "apellido", nullable = false)
    @Getter
    @Setter
    private String apellido;
}
