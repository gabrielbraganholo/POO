package exercicios.lista_4.exercicio_1;

public class ContaBancaria {
    private int saldo;
    private int limite;

    public ContaBancaria(int saldo, int limite) {
        this.setLimite(limite);
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        if (limite > 0) {
            this.limite = limite;
        }
        else {
            System.err.println("O limite precisa ser maior que 0");
        }
    }

    public int Sacar(int valor){
        if (valor > limite) {
            System.err.println("Você não pode sacar mais que o seu limite");
        }
        else {
            saldo -= valor;
        }
        return saldo;
    }
}
