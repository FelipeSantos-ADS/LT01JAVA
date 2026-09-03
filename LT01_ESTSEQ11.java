import javax.swing.JOptionPane;
public class LT01_ESTSEQ11 {
    public static void main (String args[]){
        double raio, comprimento;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
        comprimento = (2 * 3.14) * raio;
        JOptionPane.showMessageDialog(null, "O comprimento da circunferência é: " + comprimento);
    }
    
}
