package exercicios.lista_4.exercicio_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria(1000, 200);
        Scanner sc = new Scanner(System.in);

        System.out.println("Saldo disponível: "+c.getSaldo());
        System.out.println("Limite: "+c.getLimite());

        System.out.println("Mudar limite: ");
        c.setLimite(sc.nextInt());
        System.out.println("Novo limite: "+c.getLimite());

        System.out.println("Saldo atual: "+ c.getSaldo() +"\nQuanto deseja sacar?");
        c.Sacar(sc.nextInt());

        System.out.println("Saldo atual: "+ c.getSaldo());
    }
}
