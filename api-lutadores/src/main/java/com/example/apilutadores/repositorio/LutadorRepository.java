package com.example.apilutadores.repositorio;

import com.example.apilutadores.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {
    List<Lutador> findByVivoFalse();
    Integer countAllByVivoTrue();

}
