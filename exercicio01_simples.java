//Aula: 13/02/2025 
//Exercício: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
//Fórmula: lado * lado

import javax.swing.JOptionPane;
public class exercicio01_simples{
    public static void main (String Args[]){
    Double lado, área;
    lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do lado do quadrado:"));
    área = (lado * lado);
    JOptionPane.showMessageDialog(null, "O valor da área do quadrado é: " + área);
    }
}