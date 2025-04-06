package ExercicioAulas.Aula7;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        String[] semana = { "1 - Domingo", "2 - Segunda", "3 - Terça", "4 - Quarta", "5 - Quinta", "6 - Sexta", "7 - Sábado"};
        Scanner scan = new Scanner(System.in);
        int selecionado;

        boolean rodando = true;
        while (rodando) {
            System.out.println("Escolha um dia da semana: ");

            for (String x : semana) {
                System.out.println(x);
            }

            selecionado =scan.nextInt() - 1;
            if(selecionado <= 6 && selecionado >= 0){
                System.out.println("Dia selecionado: " + semana[selecionado]);
                rodando = false;
            } else {
                System.out.println("Dia invalido! \nTente novamente\n");
            }
        }
        scan.close();
    }
}
