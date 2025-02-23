//Aula: 20/02/2025
//Exercício: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.

import javax.swing.JOptionPane;
public class exercicio22_simples{
    public static void main (String Args []){
        int v1, v2;
        v1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro valor (diferente do primeiro): "));
        if (v2 == v1){
            JOptionPane.showMessageDialog(null, "Os valores inseridos devem ser DIFERENTES!");
            return;
        }
        if (v1 > v2){
            JOptionPane.showMessageDialog(null, "A ordem é: " + v2 + " e " + v1);
        }
        else{            
            JOptionPane.showMessageDialog(null, "A ordem é: " + v1 + " e " + v2);
        }
    }
}