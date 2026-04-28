package com.crud.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.cliente.entity.ClienteEntity;

@Repository

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    // Essa interface herda automaticamente vários métodos prontos:

    // save() -> Salvar ou atualizar um cliente
    // findAll() -> Buscar todos os clientes
    // findById() -> Buscar por ID
    // deleteById() -> Deletar por ID
    // existsById() -> Verificar se existe

    // <ClienteEntity, Long> significa:
    // ClienteEntity -> tipo da entidade
    // Long -> tipo da chave primária (id)
}