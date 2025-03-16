package Classes;

public class Cachorro extends Animais{
    String baruhlo;

    public Cachorro(String nome, int pernas, String baruhlo) {
        super(nome, pernas);
        this.baruhlo = baruhlo;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nBarulho: " + baruhlo;
    }

    public String getBaruhlo() {
        return baruhlo;
    }

    public void setBaruhlo(String baruhlo) {
        this.baruhlo = baruhlo;
    }

    
    
}
