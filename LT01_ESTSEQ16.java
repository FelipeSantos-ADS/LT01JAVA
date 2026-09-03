import javax.swing.JOptionPane;
public class LT01_ESTSEQ16 {
    public static void main (String args[]){
        double horas, valor_hora, desconto, sal_bruto, sal_liquido, sal_final;
        int dependentes; 
        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
        valor_hora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));
        desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual desconto: "));
        dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));
        sal_bruto = horas * valor_hora;
        sal_liquido = sal_bruto * (1 - desconto / 100);
        sal_final = (sal_liquido + dependentes) * 100;
        JOptionPane.showMessageDialog(null, "O salário á receber: " + sal_final + " reais");
    }
}
