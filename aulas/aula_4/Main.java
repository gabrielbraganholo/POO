package aula_4;

import java.util.ArrayList;
import java.util.Scanner;
import aula_4.Carro;
import aulas.aula_4.Locadora;

public class Main {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();
        Locadora l = new Locadora(carros);


        int opcao;

        do {
            System.out.print("1 - Cadastrar carro | 2 - Listar carros | 3 - Alugar | 4 - Devolver | 5 - Sair -> ");
            opcao = Integer.parseInt(teclado.nextLine());

            if (opcao == 1)
            {
                Carro c = new Carro();
                c.cadastrar();
                carros.add(c);
            }
            else if (opcao == 2)
            {
                l.listarCarros();

            } else if (opcao == 3)
            {
                if(!carros.isEmpty())
                {
                    l.listarCarros();
                    System.out.print("Digite o ID do carro que você deseja alugar:?\n ->");
                    int indice = Integer.parseInt(teclado.nextLine());
                    l.alugarCarro(indice);
                } else
                {
                    System.out.println("Nenhum carro cadastrado");
                }
            } else if (opcao == 4)
            {
                if(!carros.isEmpty())
                {
                    l.listarCarros();
                    System.out.print("Digite o ID do carro que você deseja devolver:\n ->");
                    int indice = Integer.parseInt(teclado.nextLine());
                    l.devolver(indice);
                } else
                {
                    System.out.println("Nenhum carro cadastrado");
                }
            }

        } while (opcao != 5);
    }
}
