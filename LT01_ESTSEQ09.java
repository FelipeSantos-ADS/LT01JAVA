import javax.swing.JOptionPane;
public class LT01_ESTSEQ09 {
    public static void main (String args[]){
        int x, y, soma_quad;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número: "));
        soma_quad = (int) ((int) Math.pow(x, 2) + Math.pow(y, 2));
        JOptionPane.showMessageDialog(null, "A soma dos uqadrados é: " + soma_quad);
    }
    
}
