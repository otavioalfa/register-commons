package br.com.register.commons.domain.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<String, Integer> {

//	@Query(value = "SELECT * FROM ESTADOS LIMIT 1", nativeQuery = true)
//	Optional<EstadoEntity> findOne();
//
//	@Query(value = "SELECT * FROM ESTADOS WHERE SIGLA = :sigla", nativeQuery = true)
//	Optional<EstadoEntity> findBySiglaEstado(@Param("sigla") String sigla);
}
