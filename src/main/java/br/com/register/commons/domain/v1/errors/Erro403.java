package br.com.register.commons.domain.v1.errors;

import br.com.register.commons.domain.v1.enums.MensagemEnum;
import br.com.register.commons.domain.v1.model.Devolutiva;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Erro400
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-18T20:14:52.535Z")
@JsonInclude(Include.NON_NULL)
public class Erro403 {
    @JsonProperty("codigo")
    private Integer codigo = null;

    @JsonProperty("mensagem")
    private String mensagem = null;

    @JsonProperty("erros")
    @Valid
    private List<Erro> erros = null;

    @JsonProperty("devolutivas")
    @Valid
    private List<Devolutiva> devolutivas = null;

    public Erro403() {
    }

    public Erro403(Integer codigo, String mensagem) {
        this.codigo = codigo;
        this.mensagem = mensagem;
    }

    public Erro403(Integer codigo, String mensagem, Erro erros) {
        this.codigo = codigo;
        this.mensagem = mensagem;
        this.addErrosItem(erros);
    }

    public Erro403(MensagemEnum mensagemEnum, Erro erro) {
        this.codigo = mensagemEnum.getId();
        this.mensagem = mensagemEnum.getDescription();
        this.addErrosItem(erro);
    }

    public Erro403(Integer codigo, String mensagem, List<Erro> erros) {
        this.codigo = codigo;
        this.mensagem = mensagem;
        this.erros = erros;
    }

    public Erro403 codigo(Integer codigo) {
        this.codigo = codigo;
        return this;
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

    public Erro403 mensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    /**
     * Get mensagem
     *
     * @return mensagem
     **/
    @ApiModelProperty(example = "Erro nos parametros enviados", value = "")

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Erro403 erros(List<Erro> erros) {
        this.erros = erros;
        return this;
    }

    public Erro403 addErrosItem(Erro errosItem) {
        if (this.erros == null) {
            this.erros = new ArrayList<Erro>();
        }
        this.erros.add(errosItem);
        return this;
    }

    /**
     * Get erros
     *
     * @return erros
     **/
    @ApiModelProperty(value = "")

    public List<Erro> getErros() {
        return erros;
    }

    public void setErros(List<Erro> erros) {
        this.erros = erros;
    }

    public Erro403 devolutivas(List<Devolutiva> devolutivas) {
        this.devolutivas = devolutivas;
        return this;
    }

    public Erro403 addDevolutivasItem(Devolutiva devolutivasItem) {
        if (this.devolutivas == null) {
            this.devolutivas = new ArrayList<Devolutiva>();
        }
        this.devolutivas.add(devolutivasItem);
        return this;
    }

    /**
     * Get devolutivas
     *
     * @return devolutivas
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<Devolutiva> getDevolutivas() {
        return devolutivas;
    }

    public void setDevolutivas(List<Devolutiva> devolutivas) {
        this.devolutivas = devolutivas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Erro403 erro400 = (Erro403) o;
        return Objects.equals(this.codigo, erro400.codigo) && Objects.equals(this.mensagem, erro400.mensagem)
                && Objects.equals(this.erros, erro400.erros) && Objects.equals(this.devolutivas, erro400.devolutivas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, mensagem, erros, devolutivas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Erro400 {\n");

        sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
        sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
        sb.append("    erros: ").append(toIndentedString(erros)).append("\n");
        sb.append("    devolutivas: ").append(toIndentedString(devolutivas)).append("\n");
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
