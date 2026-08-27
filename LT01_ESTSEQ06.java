import javax.swing.JOptionPane;
public class LT01_ESTSEQ06 {
    public static void main (String args[]){
        int x, y, aux;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
        aux = y;
        y = x;
        x = aux;
        JOptionPane.showMessageDialog(null, "Os novos valores de x e y são: " + x + " e " + y);
    }
}
