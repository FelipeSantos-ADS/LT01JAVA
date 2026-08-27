import javax.swing.JOptionPane;
public class LT01_ESTSEQ08 {
    public static void main (String args[]){
        double dep, valfinal;
        dep = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        valfinal = (dep * 1.013);
        JOptionPane.showMessageDialog(null, "O valor do investimento depois de um mês é: " + valfinal);
    }
    
}
