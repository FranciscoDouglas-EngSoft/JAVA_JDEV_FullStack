public class b_op_ternario {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        String c = (a >= b) ? "A e Maior ou Igual a B" : "B e Maior que A";
        System.out.println(c);

        String d = (a % 2 == 0) ? "A e Par" : "A e Impar";
        System.out.println(d);
    }
}
