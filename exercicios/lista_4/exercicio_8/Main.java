package exercicios.lista_4.exercicio_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(3, 5);

        r.Retangulo(r.getX(), r.getY());
        r.calcularArea(r.getX(), r.getY());

        r.inserirLados(2, 4);
        r.Retangulo(r.getX(), r.getY());
        r.calcularArea(r.getX(), r.getY());
    }
}
