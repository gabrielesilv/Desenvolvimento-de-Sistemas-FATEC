package com.marktplace.cliente.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

import org.hibernate.annotations.CurrentTimestamp;

@Data
@Entity
@Table(name = "tbl_registro")
public class RegistroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;

    @CurrentTimestamp
    private LocalDateTime dataRegistro;

    private String status;

    @PrePersist
    public void prePersist() {
        this.dataRegistro = LocalDateTime.now();
    }
}