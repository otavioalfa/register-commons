package br.com.register.commons.domain.v1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class CityDTO {

	private Integer id;

	private String nome;

	private StateDTO estado;
}
