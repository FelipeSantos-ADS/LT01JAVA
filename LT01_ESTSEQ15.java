import javax.swing.JOptionPane;
public class LT01_ESTSEQ15 {
    public static void main (String args[]){
        double cateto1, cateto2, hipotenusa;
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1° cateto: "));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2° cateto: "));
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        JOptionPane.showMessageDialog(null, "A hipotenusa é igual á: " + hipotenusa);
    }
    
}
