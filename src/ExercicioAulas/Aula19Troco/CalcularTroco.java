package ExercicioAulas.Aula19Troco;

public class CalcularTroco {
    private double troco;
    private double troco2;
    private double pago;
    private double pagar;

    private int cedula200;
    private int cedula100;
    private int cedula50;
    private int cedula25;
    private int cedula10;
    private int cedula5;
    private int cedula2;

    private int real;
    private int cent50;
    private int cent25;
    private int cent10;
    private int cent5;

    //Método que calcula quantidade de notas a serem entregas como troco
    public void Troco(double pago, double pagar) {
        troco = pago - pagar;
        troco2 = pago - pagar;
        this.pago = pago;
        this.pagar = pagar;
        System.out.println("Pagar: " + pagar);
        System.out.println("Pago: " + pago);
        System.out.println("troco: " + troco);
        while (troco > 0) {
            if (troco >= 200) {
                System.out.println("200");
                troco = troco - 200;
                cedula200++;
            } else if (troco >= 100) {
                System.out.println("100");
                troco = troco - 100;
                cedula100++;
            } else if (troco >= 50) {
                System.out.println("50");
                troco = troco - 50;
                cedula50++;
            } else if (troco >= 25) {
                System.out.println("25");
                troco = troco - 25;
                cedula25++;
            } else if (troco >= 10) {
                System.out.println("10");
                troco = troco - 10;
                cedula10++;
            } else if (troco >= 5) {
                System.out.println("5");
                troco = troco - 5;
                cedula5++;
            } else if (troco >= 2) {
                System.out.println("2");
                troco = troco - 2;
                cedula2++;
            } else if (troco >= 1) {
                System.out.println("1");
                troco = troco - 1;
                real++;
            } else if (troco >= 0.50) {
                System.out.println("0.50");
                troco = troco - 0.50;
                cent50++;
            } else if (troco >= 0.25) {
                System.out.println("0.25");
                troco = troco - 0.25;
                cent25++;
            } else if (troco >= 0.10) {
                System.out.println("0.10");
                troco = troco - 0.1;
                cent10++;
            } else if (troco >= 0.05){
                System.out.println("0.05");
                troco = troco - 0.05;
                cent5++;
            } else {
              troco = 0;  
            }
            System.out.println(troco);
        }
    }

    // Método para retornar apenas os atributos com valor diferente de zero em uma String
    public String Trocado() {
        StringBuilder sb = new StringBuilder();
        sb.append("Valor a ser pago: ").append(pagar);
        sb.append("\nValor pago: ").append(pago);
        sb.append("\nTroco: ").append(troco2).append("\n");
        if (cedula200 > 0) sb.append(cedula200).append(" notas de 200\n");
        if (cedula100 > 0) sb.append(cedula100).append(" notas de 100\n");
        if (cedula50 > 0) sb.append(cedula50).append(" notas de 50\n");
        if (cedula25 > 0) sb.append(cedula25).append(" notas de 25\n");
        if (cedula10 > 0) sb.append(cedula10).append(" notas de 10\n");
        if (cedula5 > 0) sb.append(cedula5).append(" notas de 5\n");
        if (cedula2 > 0) sb.append(cedula2).append(" notas de 2\n");
        if (real > 0) sb.append(real).append(" moeda de 1 Real\n");
        if (cent50 > 0) sb.append(cent50).append(" moeda de 50 Centavos\n");
        if (cent25 > 0) sb.append(cent25).append(" moeda de 25 Centavos\n");
        if (cent10 > 0) sb.append(cent10).append(" moeda de 10 Centavos\n");
        if (cent5 > 0) sb.append(cent5).append(" moeda de 5 Centavos\n");
        if (sb.isEmpty()) sb.append("nenhum Trocado");
        return sb.toString();
    }

    public double getTroco() {
        return troco;
    }
}
