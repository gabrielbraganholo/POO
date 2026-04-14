package exercicios.lista_4.exercicio_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangulo t= new Triangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado A: ");
        t.setLadoA(sc.nextInt());
        System.out.println("Digite o valor do lado B: ");
        t.setLadoB(sc.nextInt());
        System.out.println("Digite o valor do lado C: ");
        t.setLadoC(sc.nextInt());

        boolean verificar = t.verificarEquilatero(t.getLadoA(), t.getLadoB(), t.getLadoC());
        if (verificar) {
            System.out.println("Triângulo equilátero");
        }
        else {
            System.out.println("Trinângulo não equilátero");
        }
    }
}
