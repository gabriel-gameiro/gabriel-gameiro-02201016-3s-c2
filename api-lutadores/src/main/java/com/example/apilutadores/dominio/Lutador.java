package com.example.apilutadores.dominio;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Entity
public class Lutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Size(min = 3, max = 12)
    private String nome;

    @NotNull
    @DecimalMin("0.01")
    private Double forcaGolpe;

    @ColumnDefault(value = "100.0")
    private Double vida;

    @ColumnDefault(value = "0")
    @DecimalMax("3.0")
    private Integer concentracoesRealizadas;

    @ColumnDefault(value = "true")
    private Boolean vivo;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getForcaGolpe() {
        return forcaGolpe;
    }
    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }
    public Double getVida() {
        return vida;
    }
    public void setVida(Double vida) {
        this.vida = vida;
    }
    public Integer getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }
    public void setConcentracoesRealizadas(Integer concentracoesRealizadas) {
        this.concentracoesRealizadas = concentracoesRealizadas;
    }
    public Boolean getVivo() {
        return vivo;
    }
    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
}
