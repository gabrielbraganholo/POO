package exercicios.lista_4.exercicio_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            p[i] = new Pessoa();

            System.out.println("Pessoa " + (i+1) );
            System.out.println("Digite o nome: ");
            p[i].setNome(sc.nextLine());
            System.out.println("Digite seu CPF: ");
            p[i].setCpf(sc.nextLine());
            System.out.println("Digite sua idade: ");
            p[i].setIdade(sc.nextInt());
            sc.nextLine();
        }

        for (Pessoa pess : p) {
            System.out.println("-----------------");
            System.out.println("Nome: " + pess.getNome());
            System.out.println("CPF: " + pess.getCpf());
            System.out.println("Idade " + pess.getIdade());

            if(pess.verificarMaiorDeIdade(pess.getIdade())) {
                System.out.println("\n-> Maior de idade");
            }
            else {
                System.out.println("\n-> Menor de idade");
            }
        }
    }
}
