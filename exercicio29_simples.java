//Aula: 20/02/2025
/*Exercício: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor
corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
*/

import javax.swing.JOptionPane;
public class exercicio29_simples{
    public static void main (String Args[]){
        double tipoinvest, invest;
        invest = Double.parseDouble(JOptionPane.showInputDialog("Quanto foi investido (em reais)?"));
        tipoinvest = Double.parseDouble(JOptionPane.showInputDialog("Qual é o tipo de investimento? \n1 - Poupança \n2 - Renda fixa \n3 - Outro"));
        if (tipoinvest == 1){
            JOptionPane.showMessageDialog(null, "O valor corrigido após 30 dias é: R$" + invest * 1.03);
        }
        else if (tipoinvest == 2){
            JOptionPane.showMessageDialog(null, "O valor corrigido após 30 dias é: R$" + invest * 1.05);
        }
        else{
            JOptionPane.showMessageDialog(null, "Sinto muito, só calculamos investimentos em poupança ou renda fixa.");
        }
    }
}