package com.marcelocamillo.cursomc.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private Integer cod;
	private String descricao;
	
	// construtor de tipo enumerado é private
	private EstadoPagamento(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	// tipo enumerado é só get pq não muda mais o nome dele
	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}	
		
		throw new IllegalArgumentException("ID inválido: " + cod);	
	}
}
