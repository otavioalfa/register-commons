package br.com.register.commons.domain.v1.errors;

import br.com.register.commons.domain.v1.enums.MensagemEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Erro500
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-18T20:14:52.535Z")
@JsonInclude(Include.NON_NULL)
public class Erro500 {
    @JsonProperty("codigo")
    private Integer codigo = null;

    @JsonProperty("mensagem")
    private String mensagem = null;

    @JsonProperty("erro")
    private String erro = null;


    public Erro500 codigo(Integer codigo) {
        this.codigo = codigo;
        return this;
    }

    public Erro500() {
        // TODO Auto-generated constructor stub
    }

    public Erro500(Integer codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }

    public Erro500(MensagemEnum mensagemEnum, String erro) {
        this.codigo = mensagemEnum.getId();
        this.mensagem = mensagemEnum.getDescription();
        this.erro = erro;
    }

    /**
     * Get codigo
     *
     * @return codigo
     **/
    @ApiModelProperty(example = "1", value = "")

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Erro500 mensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    /**
     * Get mensagem
     *
     * @return mensagem
     **/
    @ApiModelProperty(example = "Erro ao consultar o serviço XYZ", value = "")

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Erro500 erro500 = (Erro500) o;
        return Objects.equals(this.codigo, erro500.codigo) && Objects.equals(this.mensagem, erro500.mensagem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, mensagem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Erro500 {\n");

        sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
        sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
