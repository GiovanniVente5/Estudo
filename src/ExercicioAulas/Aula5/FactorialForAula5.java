package ExercicioAulas.Aula5;

import java.util.Scanner;

public class FactorialForAula5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Escreva um numero para ser fatorado:");
        int numero = scan.nextInt();
        int resultado = numero;

        for (int i = numero - 1; i >= 1; i--) {
            resultado = resultado * i;
        }
        System.out.println("Resultado: " + resultado);
        scan.close();
    }
}
