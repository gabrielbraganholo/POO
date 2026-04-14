package exercicios.lista_4.exercicio_7;

public class Carro {
    private String placa;
    private int numChassi;
    private boolean acelerando = false;

    public Carro() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public void Acelerar() {
        System.out.println("Acelerando!");
        acelerando = true;
    }

    public boolean Frear() {
        boolean anterior = acelerando;
        acelerando = false;

        return anterior;
    }

    public void DesligarCarro() {
        System.out.println("Carro desligado");
        acelerando = false;
    }
}
