//Aula: 27/02/2025
/*Exercício: Receba a data de nascimento e atual em ano, mês e dia. 
Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
*/

import javax.swing.JOptionPane;
public class exercicio30_simples{
    public static void main (String Args[]){
        double an, mn, dn, aa, ma, da, iddia, idmes, idano;
        dn = Double.parseDouble(JOptionPane.showInputDialog("Insira o dia de nascimento"));
        mn = Double.parseDouble(JOptionPane.showInputDialog("Insira o mês de nascimento"));
        an = Double.parseDouble(JOptionPane.showInputDialog("Insira o ano de nascimento"));
        da = Double.parseDouble(JOptionPane.showInputDialog("Insira o dia atual"));
        ma = Double.parseDouble(JOptionPane.showInputDialog("Insira o mês atual"));
        aa = Double.parseDouble(JOptionPane.showInputDialog("Insira o ano atual"));
        if (da < dn){
            iddia = dn - da;
        }else{
            iddia = da - dn;
        }
        if (ma < mn){
            idmes = mn - ma;
        }else{
            idmes = ma - mn;
        }
        if (aa < an){
            idano = an - aa;
        }else{
            idano = aa - an;
        }
    JOptionPane.showMessageDialog(null, "A idade atual é: " + iddia + " dia(s), " + idmes + " mes(es) e " + idano + " ano(s).");
    }
}