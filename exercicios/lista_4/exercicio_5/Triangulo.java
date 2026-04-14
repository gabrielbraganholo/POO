package exercicios.lista_4.exercicio_5;

public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo() {
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoA(int ladoA) {
        if (ladoA > 0) {
            this.ladoA = ladoA;
        }
        else {
            System.err.println("O valor precisa ser maior que 0!");
        }
    }

    public void setLadoB(int ladoB) {
        if (ladoB > 0) {
            this.ladoB = ladoB;
        }
        else {
            System.err.println("O valor precisa ser maior que 0!");
        }
    }

    public void setLadoC(int ladoC) {
        if (ladoC > 0) {
            this.ladoC = ladoC;
        }
        else {
            System.err.println("O valor precisa ser maior que 0!");
        }
    }

    public boolean verificarEquilatero(int ladoA, int ladoB, int ladoC) {
        return ladoA == ladoB && ladoA == ladoC;
    }
}