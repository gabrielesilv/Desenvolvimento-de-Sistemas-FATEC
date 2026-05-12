package com.marktplace.cliente.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

import org.hibernate.annotations.CurrentTimestamp;

@Data
@Entity
@Table(name = "tbl_principal")
public class PrincipalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDe;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    @CurrentTimestamp
    private LocalDateTime dataCadastro;

    @PrePersist
    public void prePersist() {
        this.dataCadastro = LocalDateTime.now();
    }
}