package com.davi.spring.model;

import java.util.ArrayList;

public class Sede {

    private String fantasia;
    private String estado;
    private String cidade;
    private String bairro;
    private String telefone;
    private String enderecoWeb;
    private ArrayList<Membro> membros;
    private ArrayList<Atividade> atividades;

    public Sede() {
    }

    public Sede(String fantasia, String estado, String cidade, String bairro, String telefone,
                String enderecoWeb, ArrayList<Membro> membros, ArrayList<Atividade> atividades) {
        this.fantasia = fantasia;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.telefone = telefone;
        this.enderecoWeb = enderecoWeb;
        this.membros = membros;
        this.atividades = atividades;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnderecoWeb() {
        return enderecoWeb;
    }

    public void setEnderecoWeb(String enderecoWeb) {
        this.enderecoWeb = enderecoWeb;
    }

    public ArrayList<Membro> getMembros() {
        return membros;
    }

    public void setMembros(ArrayList<Membro> membros) {
        this.membros = membros;
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }
}
