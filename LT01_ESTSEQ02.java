import javax.swing.JOptionPane;
public class LT01_ESTSEQ02 {
    public static void main (String args[]){
        double salario, novo_salario;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario atual: "));
        novo_salario = salario * 1.15;
        JOptionPane.showMessageDialog(null, "O novo salário é de: " + novo_salario +" reais");
    }
    
}
