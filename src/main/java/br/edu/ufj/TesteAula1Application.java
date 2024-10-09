package br.edu.ufj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufj.model.Aluno;
import br.edu.ufj.repository.AlunoDAO;

@SpringBootApplication
@RestController
public class TesteAula1Application implements CommandLineRunner {

	@Autowired
	AlunoDAO alunoDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteAula1Application.class, args);
	}
	
	@GetMapping("/auladawtst")
	public String auladaw(@RequestParam(value = "nome", defaultValue = "Davi") String nome) {
		return String.format("Olá turma de DAW, meu nome é %s", nome);
	}

	@Override
	public void run(String... args) throws Exception {
		Aluno aluno = new Aluno(1, "Davi", "davisfeitosa21@gmail.com");
		alunoDAO.save(aluno);
	}
}
