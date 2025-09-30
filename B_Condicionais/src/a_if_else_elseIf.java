import java.util.Scanner;
public class a_if_else_elseIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a primeira Nota: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Digite a segunda Nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}
