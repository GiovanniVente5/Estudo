package ExercicioAulas.Aula5;

import ExercicioAulas.Classes.Produto;

public class GerenciamentoEstoque {
    public static void main(String[] args) {
        Produto pringles = new Produto("Pringles");
        Produto lays = new Produto("Lays",10.99,1000);

        pringles.repor(100);
        pringles.vender(1);
        pringles.setPreco(8.99);

        lays.vender(900);
        lays.repor(50);
    }

}
