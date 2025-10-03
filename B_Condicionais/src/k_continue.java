public class k_continue {
    public static void main(String[] args) {
        for(int numero = 0; numero < 10; numero++){
            if(numero == 4){
                System.out.println("Pulando o Numero: " + numero);
                continue;
            }
            else{
                System.out.println("Numero atual: " + numero);
            }
        }
    }
}
