//Aula: 20/02/2025
//Exercício: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor

import javax.swing.JOptionPane;
public class exercicio18_simples{
    public static void main (String Args[]){
        double v1, v2, diferenca;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor"));
        if (v1 > v2){
            diferenca = v1 - v2;
            JOptionPane.showMessageDialog(null, "A diferença é: " + diferenca);
            }
            else{
                    diferenca = v2 - v1;
                    JOptionPane.showMessageDialog(null, "A diferença é: " + diferenca);
                    }
    }
}