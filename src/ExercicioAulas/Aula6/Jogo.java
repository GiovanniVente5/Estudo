package ExercicioAulas.Aula6;

import javax.swing.JOptionPane;

import ExercicioAulas.Aula6.Classes.Personagem;

public class Jogo {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Rodriguinho", 10, 0, 0);
        String[] opcoes = { "Caçar", "Dormir", "Comer","Sair"};

        while (personagem1.getEnergia() > 0 && personagem1.getFome() != 10 && personagem1.getSono() != 10 && personagem1
        .getExperiencia() != 10) {
            int resposta = JOptionPane.showOptionDialog(null, personagem1.toString(), "Sobreviva", 0, 1, null, opcoes, opcoes[0]);

            switch (resposta) {
                case 0:
                    personagem1.cacar();
                    break;
                case 1:
                    personagem1.dormir();
                    break;
                case 2:
                    personagem1.comer();
                    break;                      
                default:
                    personagem1.setEnergia(0);
                    break;
            }
        }
        
        if (personagem1.getExperiencia() >= 10) {
            JOptionPane.showMessageDialog(null, "GANHOU!", null, 1);
        } else {
        JOptionPane.showMessageDialog(null, "Perdeu!", "Perdeu:", 0);
        }
    }
}
