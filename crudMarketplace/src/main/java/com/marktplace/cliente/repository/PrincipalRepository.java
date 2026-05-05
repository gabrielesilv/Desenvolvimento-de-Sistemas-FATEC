package com.marktplace.cliente.repository;

import com.marktplace.cliente.entity.PrincipalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincipalRepository extends JpaRepository<PrincipalEntity, Long> {
}