package ExercicioAulas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula4{
    public static void main(String[] args) {
        //exercicio 1: ler numero inteiro e real, caso real seja maior que inteiro escreva: numero real maior, caso contrario desliga
        //Minha execução:
        int numeroInteiro = 0;
        double numeroReal = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero inteiro: ");
        numeroInteiro = scan.nextInt();
        System.out.println("Numero Real:");
        numeroReal = scan.nextDouble();

        if(numeroInteiro > numeroReal){
            System.out.println("Inteiro é menor que real");
        }
    }
}