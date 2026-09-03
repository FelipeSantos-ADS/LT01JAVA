import javax.swing.JOptionPane;
public class LT01_ESTSEQ10 {
    public static void main (String args[]){
        double x, y, dif;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: "));
        dif = x - y;
        JOptionPane.showMessageDialog(null, "A diferença entre os dois números é: " + dif);
    }
}
