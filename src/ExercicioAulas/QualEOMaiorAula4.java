package ExercicioAulas;

import javax.swing.JOptionPane;

public class QualEOMaiorAula4 {
    public static void main(String[] args) {
        // leia dois numeros inteiros caso o primeiro seja maior que o segundo; escreva:
        // primeiro maior que segundo e vice e versa
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro numero inteiro:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo numero inteiro:"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "Primeiro numero é maior que o segundo");
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "Segundo numero maior que o primeiro");
        } else {
            JOptionPane.showMessageDialog(null, "Numeros iguais");
        }
        
        
    }
}
