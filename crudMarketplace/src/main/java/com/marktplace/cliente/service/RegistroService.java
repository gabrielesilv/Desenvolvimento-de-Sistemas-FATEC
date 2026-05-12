package com.marktplace.cliente.service;

import com.marktplace.cliente.entity.RegistroEntity;
import com.marktplace.cliente.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

    @Autowired
    private RegistroRepository repository;

    public List<RegistroEntity> listarTodos() {
        return repository.findAll();
    }

    public RegistroEntity buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public RegistroEntity salvar(RegistroEntity registro) {
        return repository.save(registro);
    }

    public RegistroEntity atualizar(Long id, RegistroEntity registro) {

        RegistroEntity existente = buscarPorId(id);

        if (existente != null) {

            existente.setUsuario(registro.getUsuario());
            existente.setStatus(registro.getStatus());

            return repository.save(existente);
        }

        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}