package Classes.Manager;

import Classes.Cartao.Cartao;
import Classes.Cartao.CartaoCredito;
import Classes.Cartao.CartaoDebito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoManager {
    private List<CartaoCredito> cartoesCredito;
    private List<CartaoDebito> cartoesDebito;
    private List<Cartao> cartoes;

    public CartaoManager() {
        cartoes = new ArrayList<>();
        cartoesCredito = new ArrayList<>();
        cartoesDebito = new ArrayList<>();
    }

    public void adicionarCartao(String nome, boolean status) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipo de cartão (Débito ou Crédito): ");
        String tipo = sc.nextLine().trim();

        Cartao novoCartao;

        if (tipo.equalsIgnoreCase("Débito")) {
            novoCartao = new CartaoDebito(nome,tipo="Débito", status);
            cartoesDebito.add((CartaoDebito) novoCartao);
        } else if (tipo.equalsIgnoreCase("Crédito")) {
            novoCartao = new CartaoCredito(nome,tipo="Crédito", status);
            cartoesCredito.add((CartaoCredito) novoCartao);
        } else {
            throw new IllegalArgumentException("Tipo de cartão inválido");
        }

        cartoes.add(novoCartao);
    }

    public void removerCartao(Cartao cartao) {
        cartoes.remove(cartao);
        if (cartao instanceof CartaoCredito) {
            cartoesCredito.remove(cartao);
        } else if (cartao instanceof CartaoDebito) {
            cartoesDebito.remove(cartao);
        }
    }

    public void exibirCartoes() {
        System.out.println("Cartões:");
        for (Cartao cartao : cartoes) {
            System.out.println(cartao);
        }
    }

    public void exibirCartoesCredito() {
        System.out.println("Cartões de Crédito:");
        for (CartaoCredito cartaoCredito : cartoesCredito) {
            System.out.println(cartaoCredito);
        }
    }

    public void exibirCartoesDebito() {
        System.out.println("Cartões de Débito:");
        for (CartaoDebito cartaoDebito : cartoesDebito) {
            System.out.println(cartaoDebito);
        }
    }
}
