package ExercicioAulas.Aula6;

public class Personagem {
    private String nome = "";
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    public Personagem(String nome, int energia, int fome, int sono) {
        this.nome = nome;
        if (energia >= 1 && energia <= 10)
            this.energia = energia;

        if (fome >= 1 && fome <= 10)
            this.fome = fome;

        if (sono >= 1 && sono <= 10)
            this.sono = sono;
    }

    public void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " esta dormindo.");
            sono--;
            energia = Math.min(energia + 1, 10);
        } else {
            System.out.println(nome + " sem sono");
        }
    }

    public void comer() {
        if (fome >= 1) {
            System.out.println(nome + " esta comendo.");
            fome--;
            energia = Math.min(energia + 1, 10);
        } else {
            System.out.println(nome + " sem fome");
        }
    }

    public void cacar() {
        if (energia > 2) {
            System.out.println(nome + " esta caçando.");
            energia -= 2;
        } else {
            System.out.println(nome + " esta muito cansado.");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSono() {
        return sono;
    }

    public void setSono(int sono) {
        this.sono = sono;
    }

}
