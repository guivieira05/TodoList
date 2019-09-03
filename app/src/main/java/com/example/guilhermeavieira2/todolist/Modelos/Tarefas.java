package com.example.guilhermeavieira2.todolist.Modelos;

public class Tarefas {

    private String id;
    private String nome;
    private Boolean status;
    private String descricao;

    public Tarefas(String id, String nome, String descricao, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
