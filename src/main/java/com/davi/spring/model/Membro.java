package com.davi.spring.model;

import java.util.Date;

public class Membro {

    private int id;
    private String nome;
    private String funcao;
    private String email;
    private Date dataEntradaFuncao;
    private Date dataSaidaFuncao;

    public Membro() {
    }

    public Membro(int id, String nome, String funcao, String email, Date dataEntradaFuncao, Date dataSaidaFuncao) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.email = email;
        this.dataEntradaFuncao = dataEntradaFuncao;
        this.dataSaidaFuncao = dataSaidaFuncao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataEntradaFuncao() {
        return dataEntradaFuncao;
    }

    public void setDataEntradaFuncao(Date dataEntradaFuncao) {
        this.dataEntradaFuncao = dataEntradaFuncao;
    }

    public Date getDataSaidaFuncao() {
        return dataSaidaFuncao;
    }

    public void setDataSaidaFuncao(Date dataSaidaFuncao) {
        this.dataSaidaFuncao = dataSaidaFuncao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Membro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", email='" + email + '\'' +
                ", dataEntradaFuncao=" + dataEntradaFuncao +
                ", dataSaidaFuncao=" + dataSaidaFuncao +
                '}';
    }
}
