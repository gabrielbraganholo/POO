package aula_4;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Carro {
    public String marca;
    public String modelo;
    public boolean alugado = false;

    public void cadastrar() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Marca do carro: ");
        this.marca = teclado.nextLine();

        System.out.println("Modelo do carro: ");
        this.modelo = teclado.nextLine();


        char pergunta = ' ';
        do {
            System.out.println("Alugado? (S || N)");
            pergunta = teclado.nextLine().toUpperCase().charAt(0);

            if(pergunta == 'S')
                alugado = true;

            if(pergunta == 'N')
                alugado = false;

        }while(pergunta != 'S' && pergunta != 'N');
    }

    public void exibir()
    {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);

        if(alugado)
        {
            System.out.println("Alugado: Sim");
        } else
        {
            System.out.println("Alugado: Não");
        }
    }
}
