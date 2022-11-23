package br.com.register.commons.domain.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Generated;
import java.io.Serializable;
import java.util.Objects;

/**
 * Devolutivas
 */
@SuppressWarnings("serial")
@Validated
@Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-12T19:44:09.952Z")
@JsonInclude(Include.NON_NULL)
public class Devolutiva implements Serializable {

    @JsonProperty("codigo")
    private Integer codigo = null;

    @JsonProperty("tipo")
    private String tipo = null;

    @JsonProperty("descricao")
    private String descricao = null;

    public Devolutiva() {
    }

    ;

    public Devolutiva(Integer codigo, String tipo, String descricao) {
        super();
        this.codigo = codigo;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Devolutiva codigo(Integer codigo) {
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

    public Devolutiva descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * Get descricao
     *
     * @return descricao
     **/
    @ApiModelProperty(example = "Nome da devolutiva", value = "")

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Devolutiva devolutivas = (Devolutiva) o;
        return Objects.equals(this.codigo, devolutivas.codigo) && Objects.equals(this.descricao, devolutivas.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descricao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Devolutivas {\n");

        sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
        sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
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
