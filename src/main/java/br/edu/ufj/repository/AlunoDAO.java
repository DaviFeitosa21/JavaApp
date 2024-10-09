package br.edu.ufj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ufj.model.Aluno;

public interface AlunoDAO extends JpaRepository<Aluno, Integer>{
}
