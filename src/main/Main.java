package main;

import Classes.Manager.CartaoManager;

public class Main {
    public static void main(String[] args) {
        CartaoManager c1 = new CartaoManager();
        c1.adicionarCartao("Teste",true);
        c1.exibirCartoes();
    }
}