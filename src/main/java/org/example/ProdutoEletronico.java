package org.example;

public class ProdutoEletronico  extends Produto{

    private int garantiaDeMeses;

    public ProdutoEletronico( String nome, double price, String categoria, int garantiaDeMeses) {
        super(nome,price,categoria);
        this.garantiaDeMeses = garantiaDeMeses;

    }

    public int getGarantiaDeMeses() {
        return garantiaDeMeses;
    }

    public void setGarantiaDeMeses(int garantiaDeMeses) {
        this.garantiaDeMeses = garantiaDeMeses;
    }

    @Override
    public String toString(){
        return super.toString()+"\nGarantia Do produto:"+getGarantiaDeMeses();

    }
}
