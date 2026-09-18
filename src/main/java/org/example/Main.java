package org.example;

public class Main {
    static void main() {
        ProdutoEletronico eletronico= new ProdutoEletronico("Tv", 2.500,"Eletro",5);

        System.out.println(eletronico);
        ProdutoAlimenticio alimento=new ProdutoAlimenticio("12/09/2037", "Farinha",3.0,"Grãos");

        System.out.println(alimento);
    }
}
