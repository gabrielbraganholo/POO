package exercicios.lista_4.exercicio_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro c = new Carro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a placa do carro: ");
        c.setPlaca(sc.nextLine());
        System.out.println("Digite o número do chassi: ");
        c.setNumChassi(sc.nextInt());
        sc.nextLine();

        System.out.println("\n-----------------");
        System.out.println("Placa: " + c.getPlaca());
        System.out.println("Número do Chassi: " + c.getNumChassi());
        System.out.println("-----------------\n");

        int opcao;
        do {
            System.out.println("1 - Acelerar | 2 - Frear | 3 - Desligar carro");
            opcao = sc.nextInt();

            if(opcao == 1) {
                c.Acelerar();
            }
            else if (opcao == 2) {
                if(c.Frear()) {
                    System.out.println("Freando!");
                }
                else {
                    System.err.println("O carro não está em movimento!");
                }
            }
            else if (opcao == 3) {
                c.DesligarCarro();
            }
            else {
                System.err.println("Opção inválida!");
            }
        } while(opcao != 3);
    }
}
