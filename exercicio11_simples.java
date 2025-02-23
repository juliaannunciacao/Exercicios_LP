//Aula: 13/02/2025
//Exercício: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
//Fórmula: C = 2 * π * r.

import javax.swing.JOptionPane;
public class exercicio11_simples{
    public static void main (String Args[]){
        double raio, comprimento;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o raio da circunferência: "));
        comprimento = (2 * 3.14 * raio);
        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é: " + comprimento);
    }
}