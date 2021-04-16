package com.example.apilutadores.controle;

import com.example.apilutadores.dominio.Golpe;
import com.example.apilutadores.dominio.Lutador;
import com.example.apilutadores.repositorio.LutadorRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    @PostMapping("")
    private ResponseEntity cadastroLutador(@RequestBody @Valid Lutador lutador){
        repository.save(lutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("")
    private ResponseEntity consultaLutador(){
        return ResponseEntity.ok().body(repository.findAll());
    }

    @GetMapping("/contagem-vivos")
    private ResponseEntity contaLutadoresVivos(){
        return ResponseEntity.ok().body(repository.countAllByVivoTrue());
    }

    @GetMapping("/mortos")
    private ResponseEntity consultaLutadoresMortos(){
        return ResponseEntity.ok().body(repository.findByVivoFalse());
    }

    @PostMapping("/golpe")
    private ResponseEntity golpe(@RequestBody Golpe golpe){
        Optional<Lutador> lista = repository.findById(golpe.getIdLutadorBate());
        //lista.
        //Não consegui pegar os dados dos lutadores :/
        return ResponseEntity.ok().build();
    }
}
