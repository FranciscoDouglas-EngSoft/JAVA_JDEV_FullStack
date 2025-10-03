import javax.swing.JOptionPane;

public class n_calculoMedia {
    public static void main(String[] args) {
        int tot_notas = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas deseja calcular: "));
        double[] list_notas = new double[tot_notas];
        double soma = 0;

        for (int i = 0; i < tot_notas; i++) {
            list_notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "ª nota: "));
            soma += list_notas[i];
        }

        double media = soma / tot_notas;
        JOptionPane.showMessageDialog(null, "A média das notas é: " + media);
    }
}