package org.example;

public class Main {
    static void main() {
        Produto p1 = new ProdutoEletronico("TV", 2000.0, "Eletronicos", 12);
        Produto p2 = new ProdutoAlimenticio("Arroz", 8.0, "Alimentos", "31/12/2026");

        System.out.println(p1 instanceof Produto);           // true
        System.out.println(p1 instanceof ProdutoEletronico); // true
        System.out.println(p1 instanceof ProdutoAlimenticio);// false
        System.out.println(p2 instanceof Produto);           // true
        System.out.println(p1 instanceof Object);            // true
    }
}
