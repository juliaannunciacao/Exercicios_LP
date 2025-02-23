//Aula: 20/02/2025
//Exercício: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 em ordem crescente.

import javax.swing.JOptionPane;
public class exercicio23_simples{
    public static void main (String Args[]){
        double v1, v2, v3, v4;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor (deve ser maior que o primeiro)"));
        v3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o terceiro valor (deve ser maior que o primeiro e segundo)"));
        v4 = Double.parseDouble(JOptionPane.showInputDialog("Insira o quarto valor"));

        if (v1 > v2 && v1 > v3 && v2 > v3){
            JOptionPane.showMessageDialog(null, "Os valores devem estar em ordem CRESCENTE!");
            return;
        }
        if (v4 < v1){
            JOptionPane.showMessageDialog(null, "Os valores organizados são: " + v4 + ", " + v1 + ", " + v2 + ", " + v3);
        }
        else if (v4 < v2 && v4 > v1){
            JOptionPane.showMessageDialog(null, "Os valores organizados são: " + v1 + ", " + v4 + ", " + v2 + ", " + v3);
        }
        else if (v4 < v3 && v4 > v2){
            JOptionPane.showMessageDialog(null, "Os valores organizados são: " + v1 + ", " + v2 + ", " + v4 + ", " + v3);
        }
        else{
            JOptionPane.showMessageDialog(null, "Os valores organizados são: " + v1 + ", " + v2 + ", " + v3 + ", " + v4);
        }
    }
}