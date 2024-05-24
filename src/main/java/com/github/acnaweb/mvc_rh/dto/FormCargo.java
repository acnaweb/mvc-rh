package com.github.acnaweb.mvc_rh.dto;

import java.util.Optional;

import com.github.acnaweb.mvc_rh.model.Cargo;
import com.github.acnaweb.mvc_rh.model.Departamento;

public class FormCargo {
    private Long id;
    private String nome;
	private Long id_departamento;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getId_departamento() {
        return id_departamento;
    }
    public void setId_departamento(Long id_departamento) {
        this.id_departamento = id_departamento;
    }

    public Cargo toModel(Departamento departamento) {
        Cargo cargo = new Cargo();
        cargo.setId(this.getId());
        cargo.setNome(this.getNome());
        cargo.setDepartamento(departamento);
        return cargo;
    }
    
    public FormCargo toForm(Cargo cargo) {
        this.id = cargo.getId();
        this.nome = cargo.getNome();
        this.id_departamento = Optional.ofNullable(cargo.getDepartamento())
            .map(d -> d.getId())
            .orElse(null);
        return this;
    }
    
    @Override
    public String toString() {
        return "FormCargo [id=" + id + ", nome=" + nome + ", id_departamento=" + id_departamento + "]";
    }

    
}
