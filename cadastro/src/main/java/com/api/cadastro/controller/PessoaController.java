package com.api.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.cadastro.repository.PessoaRepository;
import com.api.cadastro.model.MensagemModel;
import com.api.cadastro.model.PessoaModel;

@RestController
@RequestMapping("/api")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	// Método para visualizar todas as pessoas cadastradas
	@RequestMapping(value = "/pessoas", method = RequestMethod.GET)
	public @ResponseBody List<PessoaModel> consultarPessoas() {
		return this.pessoaRepository.findAll();
	}
	
	// Método para salvar e inserir pessoas
	@RequestMapping(value = "/pessoas", method = RequestMethod.POST)
	public @ResponseBody MensagemModel salvarPessoa(@RequestBody PessoaModel pessoa) {
		
		try {
			this.pessoaRepository.save(pessoa);
			return new MensagemModel("Registro salvo com sucesso");

		} catch (Exception e) {
			return new MensagemModel("Falha ao gravar registro " + e.getMessage());

		}
	}
	
	
}
