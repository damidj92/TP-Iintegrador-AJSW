package com.unaj.ajsw.tpintegrador.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "Trabajo")
@Table(name = "\"Trabajos\"")
public class Trabajo implements Serializable {

    private static final long serialVersionUID = -4115948181188605247L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long key_trabajo;

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

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tipo_trabajo", nullable = false)
    private TipoTrabajo tipo;

    @Column(name = "fecha_realizar", nullable = false)
    @Getter
    @Setter
    private LocalDate fecha_realizar;

    @Column(name = "zona", nullable = false)
    @Getter
    @Setter
    private String zona;

    @Column(name = "descripcion", nullable = false)
    @Getter
    @Setter
    private String descripcion;

    @OneToMany(mappedBy = "trabajo", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter
    @Setter
    private List<Oferta> ofertas;
}
