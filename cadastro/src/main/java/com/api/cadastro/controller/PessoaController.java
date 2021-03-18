package com.api.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping(value = "/pessoas", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<PessoaModel> consultarPessoas() {
		return this.pessoaRepository.findAll();
	}
	
	// Método para salvar e inserir pessoas
	@RequestMapping(value = "/pessoas", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody String cadastrarPessoa(@RequestBody PessoaModel pessoa) {
		
		try {
			this.pessoaRepository.save(pessoa);
			return new MensagemModel().MensagemModelSucesso("Registro salvo com sucesso.");

		} catch (Exception e) {
			return new MensagemModel().MensagemModelErro("Falha ao gravar registro " + e.getMessage());

		}
	}
	
	// Método para consultar por código
	@RequestMapping(value = "/pessoas/{idPessoa}", method = RequestMethod.GET)
	public @ResponseBody PessoaModel buscarPorId(@PathVariable("idPessoa") Integer idPessoa) {
		return this.pessoaRepository.findByIdPessoa(idPessoa);
	}
	
	
	// Método para alterar os dados 
	@RequestMapping(value = "/pessoas/{idPessoa}", method = RequestMethod.PUT)
	public @ResponseBody String alterarPessoa(@PathVariable("idPessoa") Integer idPessoa, @RequestBody PessoaModel pessoa) {
		PessoaModel pessoaModel = pessoaRepository.findByIdPessoa(idPessoa);
		try {
			pessoaModel.setNomePessoa(pessoa.getNomePessoa());
			pessoaModel.setEnderecoPessoa(pessoa.getEnderecoPessoa());
			pessoaModel.setNumeroEndPessoa(pessoa.getNumeroEndPessoa());
			pessoaModel.setComplementoEndPessoa(pessoa.getComplementoEndPessoa());
			pessoaModel.setBairroEndPessoa(pessoa.getBairroEndPessoa());
			pessoaModel.setCidadeEndPessoa(pessoa.getCidadeEndPessoa());
			pessoaModel.setTelefonePessoa(pessoa.getTelefonePessoa());
			this.pessoaRepository.save(pessoaModel);
			return new MensagemModel().MensagemModelSucesso("Registro alterado com sucesso.");
		} catch (Exception e){
			return new MensagemModel().MensagemModelErro("Falha ao alterar registro " + e.getMessage());
		}
	}
	
	// Método para deletar os dados
	@RequestMapping(value = "/pessoas/{idPessoa}", method = RequestMethod.DELETE)
	public @ResponseBody String deletarPessoas(@PathVariable("idPessoa") Integer idPessoa) {
		PessoaModel pessoaModel = pessoaRepository.findByIdPessoa(idPessoa);
		try {
			this.pessoaRepository.delete(pessoaModel);
			return new MensagemModel().MensagemModelSucesso("Registro deletado com sucesso.");
		} catch (Exception e) {
			return new MensagemModel().MensagemModelErro("Falha ao deletar registro " + e.getMessage());
		}
	}
	
}
