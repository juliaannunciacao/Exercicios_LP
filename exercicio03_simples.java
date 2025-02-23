//Aula: 13/02/2025  
//Exercício 03: Receba a base e a altura de um triângulo. Calcule e mostre sua área.
//Fórmula: (b * h) / 2

import javax.swing.JOptionPane;
public class exercicio03_simples{
    public static void main (String Args[]){
    Double base, altura, área;
    base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base: "));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura: "));
    área = ((base * altura) / 2);
    JOptionPane.showMessageDialog(null, "O valor da área do triângulo é: " + área);
    }
}