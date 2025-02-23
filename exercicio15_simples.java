//Aula: 13/02/2025
//Exercício: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
//Fórmula: hipotenusa² = cateto1² + cateto2²

import javax.swing.JOptionPane;
public class exercicio15_simples{
    public static void main (String Args[]){
        double cateto1, cateto2, soma, hipotenusa;
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do primeiro cateto"));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do segundo cateto"));
        soma = (cateto1 * cateto1) + (cateto2 * cateto2);
        hipotenusa = Math.sqrt(soma);
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + hipotenusa);
    }
}