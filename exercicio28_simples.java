//Aula: 20/02/2025
/*Exercício: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
  Venda mensal          Preço Atual         Preço Novo
    < 500                   < 30              + 10%
>= 500 e < 1000         >= 30 e < 80          + 15%
    >= 100                  >= 80             - 5%
OBS.: para outras condições, preço novo será igual ao preço atual.
*/

import javax.swing.JOptionPane;
public class exercicio28_simples{
    public static void main (String Args []){
        double patual, vmensal, pnovo;
        patual = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto:"));
        vmensal = Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade de vendas mensal do produto:"));
        if (vmensal < 500 && patual <30){
            pnovo = patual * 1.10;
        }else if (vmensal >= 500 && vmensal < 1000 && patual >= 30 && patual < 80){
            pnovo = patual * 1.15;
        }else if (vmensal >= 100 && patual >= 80){
            pnovo = patual * (- 0.05) + patual;
        }else{
            pnovo = patual;
        }
        JOptionPane.showMessageDialog(null, "O novo preço do produto é: R$" + pnovo);
    }
}