public class i_break {
    public static void main(String[] args){

        int contador = 1;

        while(contador <= 20){
            System.out.println("Numero atual: " + contador);
            contador++;
            if(contador == 6){
                System.out.println("Parando no Numero: " + contador);
                break;
            }
        }
    }
}
