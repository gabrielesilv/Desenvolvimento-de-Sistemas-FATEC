package com.marktplace.cliente.service;

import com.marktplace.cliente.entity.UsuarioEntity;
import com.marktplace.cliente.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioEntity> listarTodos() {
        return repository.findAll();
    }

    public UsuarioEntity buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public UsuarioEntity salvar(UsuarioEntity usuario) {
        return repository.save(usuario);
    }

    public UsuarioEntity atualizar(Long id, UsuarioEntity usuario) {
        UsuarioEntity existente = buscarPorId(id);
        if (existente != null) {
            existente.setNomeUsuario(usuario.getNomeUsuario());
            existente.setEmail(usuario.getEmail());
            existente.setTelefone(usuario.getTelefone());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}