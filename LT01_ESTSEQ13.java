import javax.swing.JOptionPane;
public class LT01_ESTSEQ13 {
    public static void main (String args[]){
        double quant_kg, dias;
        quant_kg = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em kg: "));
        int cons_diario = 50;
        dias = (quant_kg * 1000) / cons_diario;
        JOptionPane.showMessageDialog(null, "O alimento durará: " + dias + " dias");
        
    }
    
}
