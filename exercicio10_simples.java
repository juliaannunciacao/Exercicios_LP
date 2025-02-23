//Aula: 13/02/2025  
//Exercício 10: Receba 2 números reais. Calcule e mostre a diferença desses valores.

import javax.swing.JOptionPane;
public class exercicio10_simples{
    public static void main (String Args[]){
        Double n1, n2, diferença;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo número: "));
        if (n1 > n2){
            JOptionPane.showMessageDialog(null, "A diferença é de " + (n1 - n2));
        }
        else{
        JOptionPane.showMessageDialog(null, "A diferença é de " + (n2 - n1));
            }
        }
    }