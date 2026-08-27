import javax.swing.JOptionPane;
public class LT01_ESTSEQ04 {
    public static void main(String args[]){
        int c, f;
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
        f = (9 * c + 160)/5;
        JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + f + " graus");
    }
    
}
