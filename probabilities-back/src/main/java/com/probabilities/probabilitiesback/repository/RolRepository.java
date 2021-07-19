package com.probabilities.probabilitiesback.repository;

import com.probabilities.probabilitiesback.entity.Roles;
import com.probabilities.probabilitiesback.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Roles, Integer> {
    Optional<Roles> findByRolNombre(RolNombre rolNombre);
    boolean existsByRolNombre(RolNombre rolNombre);
}
