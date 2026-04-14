package exercicios.lista_4.exercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro[] c = new Carro[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            c[i] = new Carro();

            System.out.println("Digite a marca do carro: ");
            c[i].setMarca(sc.nextLine());

            System.out.println("Digite o modelo do carro: ");
            c[i].setModelo(sc.nextLine());

            System.out.println("Digite o ano do carro: ");
            c[i].setAno(Integer.parseInt(sc.nextLine()));
        }

        for (Carro item : c) {
            System.out.println("-------------------");
            System.out.println("Marca: " + item.getMarca());
            System.out.println("Modelo: " + item.getModelo());
            System.out.println("Ano: " + item.getAno());
        }
    }
}
