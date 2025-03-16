package Classes;

public class Animais {
    private String nome;
    private int pernas;

    public Animais(String nome, int pernas){
        this.nome = nome;
        this.pernas = pernas;
    }

    @Override
    public String toString(){
            return "Nome: " + nome + "\nPernas: " + pernas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPernas() {
        return pernas;
    }

    public void setPernas(int pernas) {
        this.pernas = pernas;
    }

    
}
