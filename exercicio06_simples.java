//Aula: 13/02/2025
//Exercício 06: Receba x e y. Efetue a troca de seus valore e mostre.

import javax.swing.JOptionPane;
public class exercicio06_simples{
    public static void main (String Args[]){
        Double x, y;
        x = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de y: "));
        JOptionPane.showMessageDialog(null, "O valor de x é " + y + " e o valor de y é " + x);
    }
}