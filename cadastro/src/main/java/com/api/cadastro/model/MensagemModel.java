package com.api.cadastro.model;

public class MensagemModel {
	
	private String mensagem;
	
	public String setMensagem() {
		return mensagem;
	}
	
	public void getMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public MensagemModel() {
		
	}
	
	public MensagemModel(String mensagem) {
		this.mensagem = mensagem;
	}

}
