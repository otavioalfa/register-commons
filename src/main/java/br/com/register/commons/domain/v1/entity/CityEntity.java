package br.com.register.commons.domain.v1.entity;

import javax.persistence.*;

@Entity
@Table(name = "CIDADES")
public class CityEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column()
	private String nome;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ESTADO_ID")
	private StateEntity estado;
	
	public CityEntity() {}
	
	public CityEntity(Integer id, String nome, StateEntity estado) {
		this.id = id;
		this.nome = nome;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public StateEntity getEstado() {
		return estado;
	}

	public void setEstado(StateEntity estado) {
		this.estado = estado;
	}
}
