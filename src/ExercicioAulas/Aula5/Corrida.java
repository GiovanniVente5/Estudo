package ExercicioAulas.Aula5;

public class Corrida {
    public static void main(String[] args) {
        Carro fusca = new Carro("Volskwagen","Typ 1",0);
        fusca.acelerar();
        fusca.frear();
        fusca.frear();
        System.out.println(fusca.getVelocidadeAtual());
        System.out.println(fusca.toString());
    }
}
