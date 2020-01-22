package com.marcelocamillo.cursomc.domain.enums;

public enum TipoCliente {
	// controle total do código atribuido a cada enumeração
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private Integer cod;
	private String descricao;
	
	// construtor de tipo enumerado é private
	private TipoCliente(Integer cod, String descricao) {
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
	
	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID inválido: " + cod);
	}
}
