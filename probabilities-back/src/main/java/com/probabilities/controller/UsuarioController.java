package com.probabilities.controller;


import com.probabilities.entity.Usuario;
import com.probabilities.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/add")
    public void addUsuario(@RequestBody Usuario usuario) {
        usuarioService.save(usuario);
    }

}
