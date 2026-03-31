package exercicios.lista_3;

import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try
        {
            System.out.print("Digite um valor: ");
            String valor = teclado.nextLine();

            double num = Double.parseDouble(valor);

            System.out.println("Valor convertido: " + num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erro: " + e);
        }
    }
}
