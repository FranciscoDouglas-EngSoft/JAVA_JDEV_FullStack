public class f_estrutura_while {
    public static void main(String[] args){

        int contador = 0;

        while (contador <= 10){
            System.out.println("Contador: " + contador);
            contador++;
        }

        while (true){
            System.out.println("Executando...");
            if (contador == 10){
                break;
            }
        }
    }
}
