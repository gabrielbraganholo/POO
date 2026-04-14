package exercicios.lista_4.exercicio_2;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio > 0){
            this.raio = raio;
        }
        else {
            System.err.println("O valor precisa ser positivo");
        }
    }

    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);

        return area;
    }
}
