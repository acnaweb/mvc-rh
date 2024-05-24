package com.github.acnaweb.mvc_rh.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import com.github.acnaweb.mvc_rh.model.Cargo;
import com.github.acnaweb.mvc_rh.model.Funcionario;
import com.github.acnaweb.mvc_rh.model.Uf;

public class FormFuncionario {
    private Long id;
    private String nome;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private BigDecimal salario;
	private Long idCargo;
	private String bairro;
	private String cep;
	private String cidade;
	private String complemento;
	private String logradouro;
	private Long numero;
	private Uf uf;

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
    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public LocalDate getDataSaida() {
        return dataSaida;
    }
    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public Long getNumero() {
        return numero;
    }
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    public Uf getUf() {
        return uf;
    }
    public void setUf(Uf uf) {
        this.uf = uf;
    }

    public Long getIdCargo() {
        return idCargo;
    }
    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    } 

    public Funcionario toModel(Cargo cargo) {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(this.getId());
        funcionario.setNome(this.getNome());
        funcionario.setDataEntrada(this.getDataEntrada());
        funcionario.setDataSaida(this.getDataSaida());
        funcionario.setSalario(this.getSalario());
        // funcionario.setEndereco(null);
        funcionario.setCargo(cargo);
        return funcionario;
    }

    public FormFuncionario toForm(Funcionario funcionario) {
        this.setId(funcionario.getId());
        this.setNome(funcionario.getNome());
        this.setDataEntrada(funcionario.getDataEntrada());
        this.setDataSaida(funcionario.getDataSaida());
        this.setSalario(funcionario.getSalario());
        
        Long idCargo = Optional.ofNullable(funcionario.getCargo()).map(c -> c.getId()).orElse(null);

        this.setIdCargo(idCargo);
        
        // this.setBairro();

        return this;
    }
    @Override
    public String toString() {
        return "FormFuncionario [id=" + id + ", nome=" + nome + ", dataEntrada=" + dataEntrada + ", dataSaida="
                + dataSaida + ", salario=" + salario + ", idCargo=" + idCargo + ", bairro=" + bairro + ", cep=" + cep
                + ", cidade=" + cidade + ", complemento=" + complemento + ", logradouro=" + logradouro + ", numero="
                + numero + ", uf=" + uf + "]";
    }


    
}
