//Aula: 20/02/2025
//Exercício: Receba hora de início e final de um jogo (HH,MM), sabendo que o tempo máximo é de 24h e pode começar num dia e terminar no outro.

import javax.swing.JOptionPane;
public class exercicio25_simples{
    public static void main (String Args[]){
        double h1, m1, h2, m2, th, tm;
        h1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a hora em que o jogo começou"));
        m1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o minuto em que o jogo começou"));
        h2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a hora em que o jogo acabou"));
        m2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o minuto em que o jogo acabou"));
        if (h2 >= h1){
            th = h2 - h1;
        }
        else{
            th = ((24 - h1) + h2);
        }
        if (m2 >= m1){
            tm = ((60 - m1) + m2);
            th = th - 1;
        }
        else{
            tm = m2 - m1;
        }
        JOptionPane.showMessageDialog(null, "O jogo começou às " + th + " horas e " + tm + " minutos.");
    }
}