package com.probabilities.probabilitiesback.security;

import com.probabilities.probabilitiesback.entity.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import com.probabilities.probabilitiesback.enums.RolNombre;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioPrincipalFactory {

    public static UsuarioPrincipal build(Usuario usuario){
        List<GrantedAuthority> authorities =
                usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol.getName())).collect(Collectors.toList());
        return new UsuarioPrincipal(usuario.getEmail(), usuario.getPassword(), authorities);
    }
}
