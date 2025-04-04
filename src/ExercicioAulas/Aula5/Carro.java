package ExercicioAulas.Aula5;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar() {
        velocidadeAtual += +10;
        System.out.println("acelerou 10 km/h");
        System.out.println("Esta a: " + velocidadeAtual);
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual += -10;
            System.out.println("Freiou 10 km/h");
        } else {
            System.out.println("O carro esta parado");
        }
        System.out.println("Esta a: " + velocidadeAtual);
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nVelocidade atual: " + velocidadeAtual + " km/h";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
