import javax.swing.JOptionPane;
public class LT01_ESTSEQ01 {
    public static void main(String args []){
        int lado = 0, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de lado: " + lado));
        area = lado * lado;
        JOptionPane.showMessageDialog(null, "A área é igual a: " +area);
    }
    
}
