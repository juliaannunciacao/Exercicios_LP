//Aula: 13/02/2025 
//Exercício: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3ºângulo.
//Fórmula: z = x + y - 180

import javax.swing.JOptionPane;
public class exercicio14_simples{
    public static void main (String Args[]){
        double x, y, z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro ângulo do triângulo"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo ângulo do triângulo"));
        z = (x + y - 180);
        JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo é: " + z);
    }
}