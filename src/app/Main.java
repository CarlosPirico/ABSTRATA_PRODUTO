package app;

import models.*;

public class Main {

	public static void main(String[] args) {
        // Testando a classe ProdutoAlimenticio
        ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio("Maçã", 1.00, 2.00, "2024-12-31", "Fonte de fibras");
        System.out.println(produtoAlimenticio.calcularLucro());
        System.out.println(produtoAlimenticio.insert());
        System.out.println(produtoAlimenticio.update(1.10, 2.20, "2025-01-31", "Fonte de fibras e vitamina C"));
        System.out.println(produtoAlimenticio.delete());

        System.out.println("\n"); // Para separar a saída dos produtos

        // Testando a classe ProdutoVestuario
        ProdutoVestuario produtoVestuario = new ProdutoVestuario("Camiseta", 20.00, 35.00, "M", "Azul", "Algodão");
        System.out.println(produtoVestuario.calcularLucro());
        System.out.println(produtoVestuario.insert());
        System.out.println(produtoVestuario.update(22.00, 37.00, "G", "Verde", "Poliéster"));
        System.out.println(produtoVestuario.delete());
	}

}
