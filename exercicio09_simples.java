//Aula: 13/02/2025  
//Exercício 09: Receba dois números inteiros. Calcule e mostre a soma dos quadrados.

import javax.swing.JOptionPane;
public class exercicio09_simples{
    public static void main (String Args[]){
        Double n1, n2, soma;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número: "));
        soma = ((n1 * n1) + (n2 * n2));
        JOptionPane.showMessageDialog(null, "O valor da soma dos quadrados é: " + soma);
    }
}