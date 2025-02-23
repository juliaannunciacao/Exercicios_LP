//Aula: 13/02/2025
//Exercício: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12km/litro.
//Receber o tempo de percurso e a velocidade média.

import javax.swing.JOptionPane;
public class exercicio17_simples{
    public static void main (String Args[]){
        double litros, distancia, tempo, velocidademedia, total;
        litros = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros foram gastos na viagem? "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o tempo do percurso?"));
        velocidademedia = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a velocidade média?"));
                distancia = tempo * velocidademedia;
                total = distancia / 12;
                JOptionPane.showMessageDialog(null, "O automóvel gastou " + total + " litros na viagem");
    }
}