package exercicios.lista_3;

import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] nomes = {"Ana", "Carlos", "João", "Maria", "Pedro"};

        try
        {
            System.out.print("Digite um índice (0 a 4): ");
            int indice = teclado.nextInt();

            System.out.println("Nome: " + nomes[indice]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Erro: " + e);
        }
        catch(Exception e)
        {
            System.out.println("Erro: " + e);
        }
    }
}
