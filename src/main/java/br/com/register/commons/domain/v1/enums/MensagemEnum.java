package br.com.register.commons.domain.v1.enums;

public enum MensagemEnum {
	MSG_NEGOCIO_SISTEMA_INDISPONIVEL(1, "Sistema Indisponivel."),

	MSG_NEGOCIO_VALIDACAO_CAMPOS(2, "Erro na validação de campos."),

	MSG_NEGOCIO_NAO_ENCONTRADO(3, "Registro não encontrado."),

	MSG_ERRO_ACESSO_BASE(4, "Erro ao acessar a base."),

	MSG_ERRO_ENTRADA_INVALIDA(5, "Campos inválidos."),

	MSG_ERRO_INTEGRACAO(6, "Erro na integração.");

	/** id. */
	private final int id;

	/** description. */
	private final String description;


	/**
	 * Cria uma nova instancia de MessagesEnum.
	 * 
	 * @param id id
	 * @param description description
	 * @param resourceKey resource key
	 */
	private MensagemEnum(final int id, final String description) {
		this.id = id;
		this.description = description;
	}

	/**
	 * Retorna o/a id.
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Retorna o/a description.
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
}
