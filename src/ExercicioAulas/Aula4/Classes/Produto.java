package ExercicioAulas.Aula4.Classes;

public class Produto {
    private String nome;
    private double preco = 0;
    private int quantEstoque = 0;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public void vender(int vendido) {
        if (quantEstoque >= 1) {
            quantEstoque += -vendido;
            System.out.println("Quantidade vendida de " + nome + ": " + vendido);
        } else {
            System.out.println("Não há itens no estoque");
        }
        System.out.println("No estoque: " + quantEstoque);
    }

    public void repor(int reposto) {
        quantEstoque += +reposto;
        System.out.println("Reposto " + nome + ": " + reposto);
        System.out.println("No estoque: " + quantEstoque);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + "\nPreço: " + preco + "\nQuantidade no estoque: " + quantEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

}
