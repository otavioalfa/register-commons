package br.com.register.commons.domain.v1.dto;

import br.com.register.commons.domain.v1.enums.SexoEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ClientDTO {

    @JsonIgnore
    private Integer id;

    private String nomeCompleto;

    private String email;

    private SexoEnum sexo;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataNascimento;

    private StateDTO cidade;

    private Boolean isAdmin;

    private String senha;

    private Integer idade;

}
