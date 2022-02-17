package com.will.loja.service;

import com.will.loja.entity.Funcionario;
import com.will.loja.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public void salvar(Funcionario funcionario){
        repository.save(funcionario);
    }
}
