package com.jambodev.biblioteca.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.jambodev.biblioteca.repositories.EmprestimoRepository;
import com.jambodev.biblioteca.entities.Emprestimo;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {
    @Autowired
    EmprestimoRepository er;

    public List<Emprestimo> listarEmprestimos(){
        return er.findAll();
    }

    public Emprestimo buscarEmprestimo(Long id) throws Exception {
        Optional<Emprestimo> emprestimo_optional = er.findById(id);
        if(emprestimo_optional.isEmpty()){
            throw new Exception("Emprestimo não existe.");
        }
        return emprestimo_optional.get();
    }

    public Emprestimo criarEmprestimo(Emprestimo emprestimo){
        er.save(emprestimo);
        return emprestimo;
    }

    public Emprestimo atualizarEmprestimo(Emprestimo emprestimo) throws Exception {
        Optional<Emprestimo> emprestimo_optional = er.findById(emprestimo.getId());
        if(emprestimo_optional.isEmpty()){
            throw new Exception("Empréstimo não existe.");
        }
        er.save(emprestimo);
        return emprestimo;
    }

    public void deleterEmprestimo(Emprestimo emprestimo) throws Exception {
        Optional<Emprestimo> emprestimo_optional = er.findById(emprestimo.getId());
        if(emprestimo_optional.isEmpty()){
            throw new Exception("Empréstimo não existe.");
        }
        er.delete(emprestimo);
    }
}
