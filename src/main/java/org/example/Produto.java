package org.example;

public class Produto {

    private String nome;
    private Double price;
    private String categoria;

    public Produto(String name, Double price,String categoria){
        this.nome = name;
        this.price = price;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nome do produto:"+this.nome+
                "\nPreço:"+this.price+
                "\nCategoria:"+this.categoria;
    }
}
