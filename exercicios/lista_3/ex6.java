package exercicios.lista_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex6 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double premio = 5000.0;

        try
        {
            System.out.print("Quantos ganhadores? ");
            int pessoas = teclado.nextInt();

            double valor = premio / pessoas;

            System.out.println("Cada um recebe: " + valor);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Erro: " + e);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Erro: " + e);
        }
    }
}
