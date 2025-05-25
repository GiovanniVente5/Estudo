package ExercicioAulas.Aula19Troco;

import javax.swing.JOptionPane;

public class Executavel {
    public static void main(String[] args) {
        double pagar = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser pago:"));
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Valor Pago:"));
        CalcularTroco calc = new CalcularTroco();

        if (pago < pagar){
            JOptionPane.showMessageDialog(null, "Valor entregue menor que valor a ser pago", "Error", 2);
        } else {
            calc.Troco(pago, pagar);
            JOptionPane.showMessageDialog(null, calc.Trocado(), "Trocado", 3);
        }
        
    }
}
