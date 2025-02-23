//Aula: 13/02/2025
//Exercício: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.

import javax.swing.JOptionPane;
public class exercicio13_simples{
    public static void main (String Args[]){
        double quilos, dias;
        quilos = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade (em kg) do alimento"));
        dias = (quilos / 0.05);
        JOptionPane.showMessageDialog(null, "O alimento durará " + dias + " dias.");
    }
}