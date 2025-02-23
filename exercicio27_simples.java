//Aula: 20/02/2025
//Exercício: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule a velocidade média em km/h.
//Fórmula: vm = distancia/tempo

import javax.swing.JOptionPane;
public class exercicio27_simples{
    public static void main (String Args[]){
        double voltas, extensao, tempoduracao, vm;
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Insira o número de voltas"));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Informe a extensão do circuito (em metros)"));
        tempoduracao = Double.parseDouble(JOptionPane.showInputDialog("Quanto tempo (em minutos) durou?"));
        vm = ((voltas * extensao) / (tempoduracao * 60)) * (3.6);
        JOptionPane.showMessageDialog(null, "A velocidade média foi de " + vm + "km/h.");
    }
}