import javax.swing.JOptionPane;
public class LT01_ESTSEQ07 {
    public static void main (String args[]){
        double c, l, a, v;
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o  comprimento: "));
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: "));
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
        v = (c * l * a);
        JOptionPane.showMessageDialog(null, "O volume é igual a: " + v);
    }
    
}
