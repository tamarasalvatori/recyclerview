package com.example.ex03_recyclerview.Model;

public class Arquivo {

    String titulo;
    String data;
    Boolean tipo;

    public Arquivo(String titulo, String data, Boolean tipo) {
        this.titulo = titulo;
        this.data = data;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getTipo() {
        return tipo;
    }

    public void setTipo(Boolean tipo) {
        this.tipo = tipo;
    }
}
