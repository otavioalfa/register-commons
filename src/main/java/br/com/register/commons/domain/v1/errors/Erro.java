package br.com.register.commons.domain.v1.errors;

public class Erro {

	private String path;
	private String mensagemNegocio;
	private String mensagemSistema;
	private String valorRejeitado;

	public Erro() {
	}

	public Erro(String mensagemSistema) {
		this.mensagemSistema = mensagemSistema;
		this.mensagemNegocio = "Não foi possível processar a requisição.";
	}

	public Erro(String mensagemNegocio, String mensagemSistema) {
		this.mensagemSistema = mensagemSistema;
		this.mensagemNegocio = mensagemNegocio;
	}

	public Erro(final String mensagemNegocio, final String mensagemSistema, final String valorRejeitado) {
		this.mensagemSistema = mensagemSistema;
		this.mensagemNegocio = mensagemNegocio;
		this.valorRejeitado = valorRejeitado;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMensagemNegocio() {
		return mensagemNegocio;
	}

	public void setMensagemNegocio(String mensagemNegocio) {
		this.mensagemNegocio = mensagemNegocio;
	}

	public String getMensagemSistema() {
		return mensagemSistema;
	}

	public void setMensagemSistema(String mensagemSistema) {
		this.mensagemSistema = mensagemSistema;
	}

	public String getValorRejeitado() {
		return valorRejeitado;
	}

	public void setValorRejeitado(String valorRejeitado) {
		this.valorRejeitado = valorRejeitado;
	}

	@Override
	public String toString() {
		return "Erro{" + "path='" + path + '\'' + ", mensagemNegocio='" + mensagemNegocio + '\'' + ", mensagemSistema='"
				+ mensagemSistema + '\'' + ", valorRejeitado='" + valorRejeitado + '\'' + '}';
	}
}
