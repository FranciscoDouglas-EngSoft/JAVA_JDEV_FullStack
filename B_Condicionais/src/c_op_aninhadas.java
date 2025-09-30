public class c_op_aninhadas {
    public static void main(String[] args){
        //Operacoes Logicas Aninhadas

        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        int[] list = {a, b, c, d};
        int media = (a + b + c + d) / list.length;
        System.out.println("media = " + media);

        if(media >= 10){
            if(media < 15){
                System.out.println("media entre 10 e 15");
            } else {
                System.out.println("media maior ou igual a 15");
            }
        } else {
            System.out.println("media menor que 10");
        }
    }
}
