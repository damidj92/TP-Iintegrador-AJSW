package com.unaj.ajsw.tpintegrador.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "Solicitud")
@Table(name = "\"Solicitudes\"")
public class Solicitud implements Serializable {

    private static final long serialVersionUID = -4115948181188605247L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long key_solicitud;

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
    @Getter
    @Setter
    private TipoTrabajo tipo;

    @Column(name = "fecha_realizar", nullable = false)
    @Getter
    @Setter
    private LocalDate fechaRealizar;

    @Column(name = "zona", nullable = false)
    @Getter
    @Setter
    private String zona;

    @Column(name = "descripcion", nullable = false)
    @Getter
    @Setter
    private String descripcion;

    @JsonIdentityInfo(
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "key_oferta"
    )
    @JsonIdentityReference(alwaysAsId = true)
    @OneToMany(mappedBy = "solicitud", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter
    @Setter
    private List<Oferta> ofertas;
}
