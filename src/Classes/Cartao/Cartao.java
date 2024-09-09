package Classes.Cartao;

public class Cartao {
    private String nome;
    private String tipo;
    private boolean status;

    public Cartao(String nome, String tipo, boolean status){
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
    }

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public boolean isStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}

    @Override
    public String toString() {
        return "Cartao{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", status=" + status +
                '}';
    }
}



