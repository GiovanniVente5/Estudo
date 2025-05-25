package ExercicioAulas.Aula19Troco;

public class TrocoMelhorRespota {
    public static void main(String[] args) {
        //respota do professor (BEM melhor)
        //para estudo
        String input = javax.swing.JOptionPane.showInputDialog("Digite o valor do troco (ex: 37.85):");
        double troco = Double.parseDouble(input);

        int[] cedulas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        int valorInteiro = (int) troco;
        int valorCentavos = (int) Math.round((troco - valorInteiro) * 100);

        StringBuilder resultado = new StringBuilder();
        resultado.append("Cédulas:\n");
        for (int cedula : cedulas) {
            int qtd = valorInteiro / cedula;
            if (qtd > 0) {
                resultado.append(qtd).append(" x R$ ").append(cedula).append("\n");
                valorInteiro %= cedula;
            }
        }

        int totalCentavos = valorInteiro * 100 + valorCentavos;
        resultado.append("Moedas:\n");
        for (int moeda : moedas) {
            int qtd = totalCentavos / moeda;
            if (qtd > 0) {
                resultado.append(qtd).append(" x ").append(moeda >= 100 ? "R$ 1,00" : "R$ 0," + String.format("%02d", moeda)).append("\n");
                totalCentavos %= moeda;
            }
        }
        System.out.println(valorInteiro);
        System.out.println(valorCentavos);
        System.out.println(resultado.toString());
    }
}
