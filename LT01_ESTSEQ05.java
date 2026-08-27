import javax.swing.JOptionPane;
public class LT01_ESTSEQ05 {
    public static void main(String args[]){
        int a, b ,c;
        double delta, x1, x2;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
        delta = Math.pow(b, 2) - (4 * a * c);
        x1 = (- b + Math.sqrt(delta))/(2 * a);
        x2 = (- b - Math.sqrt(delta))/(2 * a);
        JOptionPane.showMessageDialog(null, "O valor da 1ª raiz é: " + x1 + " e o valor da 2ª raiz é " + x2);
    }
    
}
