//Aula: 27/02/2025
//Exercício: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.

import javax.swing.JOptionPane;

public class exercicio41_simples{
    public static void main (String args[]){
        int dado1, dado2;
        for (dado1 = 1; dado1 <= 6; dado1++){
            for (dado2 = 1; dado2 <= 6; dado2++){
                if (dado1 + dado2 == 7){
                    JOptionPane.showMessageDialog(null, "A soma de " + dado1 + " e " + dado2 + " resulta em 7");
                }
            }
        }
    }
}