//Aula: 27/02/2025
/*Exercício: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 1 2 3 4 ... 64
Qte: 1 2 4 8 ... N
*/

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class exercicio39_simples{
    public static void main (String args[]){
        BigInteger qtd = BigInteger.ZERO, graos = BigInteger.ONE;
        for (int i = 1; i <= 64; i++) {
            qtd = qtd.add(graos);
            graos = graos.multiply(BigInteger.TWO);
        }
        JOptionPane.showMessageDialog(null, "Há " + qtd + " grãos no tabuleiro de xadrez.");
    }
}