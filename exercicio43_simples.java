//Aula: 27/02/2025
/* Exercício: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que 
Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
*/

import javax.swing.JOptionPane;

public class exercicio43_simples{
    public static void main (String args[]){
        double ana = 1.1, maria = 1.5, anos = 0;
        while (ana < maria){
            ana = ana + 0.3;
            maria = maria + 0.2;
            anos = anos + 1;
        }
        JOptionPane.showMessageDialog(null, "Serão necessários " + anos + " anos até que Ana seja maior que Maria");
    }
}