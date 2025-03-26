package ExercicioAulas.Aula4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComparaRealEInteiroAula4 {
    public static void main(String[] args) {
        // exercicio 1: ler numero inteiro e real, caso real seja maior que inteiro
        // escreva: numero real maior, caso contrario desliga
        // Minha execução:

        System.out.println("Exercicio 1:");
        int numeroInteiro = 0;
        double numeroReal = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero inteiro: ");
        numeroInteiro = scan.nextInt();
        System.out.println("Numero Real:");
        numeroReal = scan.nextDouble();

        if (numeroInteiro > numeroReal) {
            System.out.println("Inteiro é menor que real");
        }
        scan.close();
        System.out.println("-------------------------------------");

        // Exercicio 2: leia dois numeros reais caso os dois sejam iguais, escreva: Os
        // numeros são o mesmo, caso contrario apenas termine
        System.out.println("Exercicio 2:");
        double numeroReal1 = Double.parseDouble(JOptionPane.showInputDialog("Numero Real 1"));
        double numeroReal2 = Double.parseDouble(JOptionPane.showInputDialog("Numero Real 2"));
        if (numeroReal1 == numeroReal2) {
            JOptionPane.showMessageDialog(null, "Os dois numeros são iguas");
        }
    }
}