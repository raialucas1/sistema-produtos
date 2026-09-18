package org.example;

public class ProdutoAlimenticio extends Produto{

    private String dataDeValidade;
    public ProdutoAlimenticio(String nome, Double price, String categoria,String dataDeValidade) {
        super(nome, price, categoria);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Data de Validade: "+dataDeValidade;
    }
}
