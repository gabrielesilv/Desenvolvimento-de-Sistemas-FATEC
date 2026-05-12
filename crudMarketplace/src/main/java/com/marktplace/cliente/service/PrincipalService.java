package com.marktplace.cliente.service;

import com.marktplace.cliente.entity.PrincipalEntity;
import com.marktplace.cliente.repository.PrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrincipalService {

    @Autowired
    private PrincipalRepository repository;

    public List<PrincipalEntity> listarTodos() {
        return repository.findAll();
    }

    public PrincipalEntity buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public PrincipalEntity salvar(PrincipalEntity principal) {
        return repository.save(principal);
    }

    public PrincipalEntity atualizar(Long id, PrincipalEntity principal) {

        PrincipalEntity existente = buscarPorId(id);

        if (existente != null) {
            existente.setNome(principal.getNome());
            existente.setDescricao(principal.getDescricao());

            return repository.save(existente);
        }

        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}