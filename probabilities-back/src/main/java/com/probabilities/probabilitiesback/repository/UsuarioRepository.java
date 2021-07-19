package com.probabilities.probabilitiesback.repository;

import com.probabilities.probabilitiesback.entity.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);

    //Ver como meterle este query
    @Query(value = "")
    int getrolebyID(int id);

}
