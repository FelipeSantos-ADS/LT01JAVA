import javax.swing.JOptionPane;
public class LT01_ESTSEQ14 {
    public static void main (String args[]){
        double angulo1, angulo2, angulo3;
        angulo1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° ângulo: "));
        angulo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° ângulo: "));
        angulo3 = 180 - (angulo1 + angulo2);
        JOptionPane.showMessageDialog(null, "O valor do 3° ângulo é: " + angulo3);
    }
    
}
