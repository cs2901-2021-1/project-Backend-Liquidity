package com.probabilities.controller;

import com.probabilities.entity.Proyeccion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proyeccion")
@CrossOrigin
public class ProyeccionController {


    @GetMapping("/lista")
    public ResponseEntity<List<Proyeccion>> lista(){


        return null;
    }
}
