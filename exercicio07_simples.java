//Aula: 13/02/2025
//Exercício 07: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
// Fórmula: V = A * B * C

import javax.swing.JOptionPane;
public class exercicio07_simples{
    public static void main (String Args[]){
        Double A, B, C, volume;
        A = Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento do paralelepípedo: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Insira a largura do paralelepípedo: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do paralelepípedo: "));
        volume = (A * B * C);
        JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é: " + volume);
    }
}