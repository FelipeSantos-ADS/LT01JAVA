import javax.swing.JOptionPane;
public class LT01_ESTSEQ03 {
    public static void main (String args[]){
        int base, altura, area;
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura: "));
        area = (base * altura)/ 2;
        JOptionPane.showMessageDialog(null, "A area é igual a: " +area);
    }
    
}
