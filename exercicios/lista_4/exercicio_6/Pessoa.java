package exercicios.lista_4.exercicio_6;

public class Pessoa {
    private int idade;
    private String nome;
    private String cpf;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11) {
            System.err.println("CPF deve ter 11 números!");
        }
        else if (!cpf.matches("\\d+")) {
            System.err.println("CPF deve conter apenas números!");
        }
        else {
            this.cpf = cpf;
        }
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean verificarMaiorDeIdade(int idade) {
        return idade > 18;
    }
}
