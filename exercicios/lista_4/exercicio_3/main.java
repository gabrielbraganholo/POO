package exercicios.lista_4.exercicio_3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(0, 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da altura: ");
        r.setAltura(sc.nextDouble());
        System.out.println("Digite o valor da base: ");
        r.setBase(sc.nextDouble());

        double area = r.calcularArea(r.getAltura(), r.getBase());
        System.out.printf("Área do retângulo: %.2f", area);
    }
}
