package aulas.aula_4;

import aula_4.Carro;
import aula_4.Main;

import java.util.ArrayList;

public class Locadora {
    private ArrayList<Carro> carros;

    public Locadora(ArrayList<Carro> carros)
    {
        this.carros = carros;
    }

    public void alugarCarro(int i)
    {
        if(i < 0 || i >= carros.size())
        {
            System.out.println("Esse carro não existe ou ainda não foi cadastrado");
        }

        Carro c = carros.get(i);

        if(c.alugado)
        {
            System.out.println("O carro de marca "+c.marca+" e modelo "+c.modelo+" já foi alugado por alguém");
        } else
        {
            System.out.println("O carro de marca "+c.marca+" e modelo "+c.modelo+" foi alugado para você");
            c.alugado = true;
        }
    }

    public void devolver(int i)
    {
        if(i < 0 || i >= carros.size())
        {
            System.out.println("Esse carro não existe ou ainda não foi cadastrado");
        }

        Carro c = carros.get(i);

        if(!c.alugado)
        {
            System.out.println("Você já devolveu o carro de marca "+c.marca+" e modelo "+c.modelo);
        } else
        {
            System.out.println("O carro de marca "+c.marca+" e modelo "+c.modelo+" foi devolvido por você");
            c.alugado = false;
        }
    }

    public void listarCarros()
    {
        for(int i = 0; i < carros.size(); i++)
        {
            Carro c = carros.get(i);
            System.out.println("ID: "+i+"\t || Marca: "+c.marca+"\t || Modelo: "+c.modelo+"\t || Alugado: "+c.alugado);
        }
        System.out.println(" ");
    }
}
