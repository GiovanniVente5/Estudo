package ExercicioAulas.Aula4;

import javax.swing.JOptionPane;

public class UsandoJOptionPaneAula4 {
    public static void main(String[] args) {
     //exercicio
     //modo em que o professor fez
     //JOptionPane = abre uma tela / outras opções do oque fazer 
     int numeroInt = Integer.parseInt(JOptionPane.showInputDialog("escreva um numero inteiro"));
     double numeroDouble = Double.parseDouble(JOptionPane.showInputDialog("insira um numero Real"));

     if (numeroInt < numeroDouble) {
        JOptionPane.showMessageDialog(null, "Numero inteiro menor que numero real!");
     }
    }
}
