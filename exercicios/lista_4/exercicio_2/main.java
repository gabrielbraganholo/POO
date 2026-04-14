package exercicios.lista_4.exercicio_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        Circulo c = new Circulo(raio);

        System.out.println("Raio: "+c.getRaio());
        System.out.println("Mudar raio: ");
        c.setRaio(sc.nextDouble());
        System.out.println("Novo raio: "+c.getRaio());

        double area = c.calcularArea();
        System.out.printf("Área do círculo de raio %.2f -> %.2f", c.getRaio(), area);
    }
}
