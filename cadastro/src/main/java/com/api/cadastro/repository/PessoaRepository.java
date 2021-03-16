package com.api.cadastro.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.api.cadastro.model.PessoaModel;

public interface PessoaRepository extends Repository<PessoaModel, Integer>{
	
	void save(PessoaModel pessoa);
	
	List<PessoaModel> findAll();
	
	PessoaModel findByIdPessoa(Integer id);
	
	void delete(PessoaModel pessoa);	

}
