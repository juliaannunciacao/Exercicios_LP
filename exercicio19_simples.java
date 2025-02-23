//Aula: 20/02/2025  
//Exercício: Receba 2 valores reais. Calcule e mostre o maior deles.

import javax.swing.JOptionPane;
public class exercicio19_simples{
    public static void main (String Args[]){
        double v1, v2;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
        if (v1 > v2){
            JOptionPane.showMessageDialog(null, "O maior valor é: " + v1);
        }
        else{
            JOptionPane.showMessageDialog(null, "O maior valor é: " + v2);
        }
    }
}