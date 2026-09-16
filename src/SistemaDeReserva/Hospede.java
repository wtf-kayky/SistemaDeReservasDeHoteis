package SistemaDeReserva;

public class Hospede {

    private String nome;
    private int idade;

    public Hospede(String nome, int idade) {
        if (idade < 0) {
            throw new RuntimeException("Idade insuficiente");
        } else {
            this.idade = idade;
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new RuntimeException("Idade isuficiente");
        } else {
            this.idade = idade;
        }
    }
}

