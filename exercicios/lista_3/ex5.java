package exercicios.lista_3;

import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try
        {
            System.out.print("Digite a temperatura em Celsius: ");
            String temp = teclado.nextLine();

            double celsius = Double.parseDouble(temp);
            double fahrenheit = (celsius * 9/5) + 32;

            System.out.println("Fahrenheit: " + fahrenheit);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erro: " + e);
        }
    }
}
