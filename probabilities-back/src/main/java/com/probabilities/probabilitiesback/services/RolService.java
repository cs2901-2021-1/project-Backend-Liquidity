package com.probabilities.probabilitiesback.services;

import com.probabilities.probabilitiesback.entity.Roles;
import com.probabilities.probabilitiesback.enums.RolNombre;
import com.probabilities.probabilitiesback.repository.RolRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Roles> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

    public boolean existsRolNombre(RolNombre rolNombre){
        return rolRepository.existsByRolNombre(rolNombre);
    }

    public void save(Roles rol){
        rolRepository.save(rol);
    }
}
