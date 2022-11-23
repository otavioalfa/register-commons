package br.com.register.commons.domain.v1.entity;

import br.com.register.commons.domain.v1.enums.SexoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "CLIENTE")
@DynamicUpdate
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME_COMPLETO")
    private String nomeCompleto;

    @Column()
    private String email;

    @Column()
    @Enumerated(EnumType.STRING)
    private SexoEnum sexo;

    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CIDADE_ID")
    private CityEntity cidade;

    @Column(name = "IS_ADMIN")
    private Boolean isAdmin;

    @Column()
    private String senha;

    @Transient
    private Integer idade;
}
