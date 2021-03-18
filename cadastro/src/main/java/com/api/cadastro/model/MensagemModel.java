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
	
	public String MensagemModelSucesso(String mensagem) {
		this.mensagem = mensagem;
		return mensagem;
	}

	public String MensagemModelErro(String mensagem) {
		this.mensagem = mensagem;
		return mensagem;
	}

	
}
