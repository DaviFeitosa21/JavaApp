package br.edu.ufj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufj.model.Aluno;
import br.edu.ufj.repository.AlunoDAO;

@RequestMapping("/auladaw")
@RestController
public class AlunoController {
	
	@Autowired
	AlunoDAO dao;
	
	@GetMapping
	public List<Aluno> auladaw() {
		return dao.findAll();
	}

	@GetMapping("/{nome}")
	public String auladaw(@PathVariable(value="nome") String nome) {
		return String.format("Olá turma, meu nome é %s", nome);
	}
}
