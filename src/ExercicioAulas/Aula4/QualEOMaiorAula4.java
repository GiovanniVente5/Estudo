package ExercicioAulas.Aula4;

import javax.swing.JOptionPane;

public class QualEOMaiorAula4 {
    public static void main(String[] args) {
        // leia dois numeros inteiros caso o primeiro seja maior que o segundo; escreva:
        // primeiro maior que segundo e vice e versa
        Double num1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro numero inteiro:"));
        Double num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo numero inteiro:"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "Primeiro numero é maior que o segundo: " + num1);
        } else if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "Segundo numero maior que o primeiro: " + num2);
        } else {
            JOptionPane.showMessageDialog(null, "Numeros iguais");
        }
        
        
    }
}
