import javax.swing.JOptionPane;

public class m_entradaDados {
    public static void main(String[] args){
        //Entrada de Dados
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));

        //Divisao de Valores
        int valor3 = valor1 + valor2;
        System.out.println("O Resultado final e: " + valor3);
    }
}
