import javax.swing.JOptionPane;
public class LT01_ESTSEQ12 {
    public static void main (String args[]){
        int ano_nasc, ano_atual, idade, idade_futura;
        ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        idade = ano_atual - ano_nasc;
        idade_futura = idade + 17;
        JOptionPane.showMessageDialog(null, "A idade é de: " + idade + " anos");
        JOptionPane.showMessageDialog(null, "A idade futura é de: " + idade_futura + " anos");
    }
    
}
