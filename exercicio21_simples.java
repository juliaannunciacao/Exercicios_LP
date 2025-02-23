//Aula: 20/02/2025
//Exercício: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
//a. Se a média for >= 6.0, exibir "APROVADO"
//b. Se a média for >= 3.0, exibir "EXAME"
//c. Se a média for < 3.0, exibir "RETIDO"

import javax.swing.JOptionPane;
public class exercicio21_simples{
    public static void main (String Args []){
        double n1, n2, n3, n4, media;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a terceira nota"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota"));
        media = ((n1 + n2 + n3 + n4) / 4);
        if (media >= 6.0){
            JOptionPane.showMessageDialog(null, "APROVADO!!!");
        }
        else if (media >= 3.0){
            JOptionPane.showMessageDialog(null, "EXAME...");
        }
        else{
            JOptionPane.showMessageDialog(null, "RETIDO.");
        }   
    }
}