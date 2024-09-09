package Classes.Cartao;

public class CartaoDebito extends Cartao{

    public CartaoDebito(String nome, String tipo, boolean status) {
        super(nome, "Débito", status);
    }
}
