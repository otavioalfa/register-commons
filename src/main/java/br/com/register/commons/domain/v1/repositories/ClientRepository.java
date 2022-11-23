package br.com.register.commons.domain.v1.repositories;

import br.com.register.commons.domain.v1.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {

    @Query(value = "SELECT * FROM CLIENTE WHERE EMAIL = :email", nativeQuery = true)
    Optional<ClientEntity> findByEmail(@Param("email") String email);

    @Query(value = "SELECT * FROM CLIENTE WHERE NOME_COMPLETO = :nomeCompleto", nativeQuery = true)
    Optional<ClientEntity> findByNomeCompleto(@Param("nomeCompleto") String nomeCompleto);
}
