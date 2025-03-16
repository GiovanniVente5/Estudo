package Executar;
import Classes.Animais;
import Classes.Cachorro;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Doguinho",4,"woof");
        System.out.println(cachorro.toString());

        Animais animal = new Animais("Largatixa",4);
        System.out.println("-------------------------------------");
        System.out.println(animal.toString());
    }
}
