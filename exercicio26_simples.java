//Aula: 20/02/2025
//Exercício: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.

import javax.swing.JOptionPane;
public class exercicio26_simples{
    public static void main (String Args[]){
        int v1, v2;
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro."));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor inteiro."));
        if ((v1 >= v2) && (v1 % v2 == 0)){
            JOptionPane.showMessageDialog(null, v1 + " é maior e múltiplo de " + v2);
        }
        else if ((v2 >= v1) && (v2 % v1 == 0)){
            JOptionPane.showMessageDialog(null, v2 + " é maior e múltiplo de " + v1);
        }
        else{
            JOptionPane.showMessageDialog(null, v1 + " e " + v2 + " não são múltiplos.");
        }
    }
}