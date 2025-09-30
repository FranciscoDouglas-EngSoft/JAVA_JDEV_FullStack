public class a_tiposDados {

    //tipos de Dados em Java

    public static void main(String[] args){

        byte numeroByte = 127; //1 byte
        short numeroShort = 32767; //2 bytes
        int numeroInt = 2147483647; //4 bytes
        long numeroLong = 9223372036854775807L; //8 bytes
        float numeroFloat = 3.4028235E38F; //4 bytes
        double numeroDouble = 1.7976931348623157E308; //8 bytes
        char caractere = 'A'; //2 bytes
        boolean verdadeiroFalso = true; //1 bit

        System.out.println("Byte: " + numeroByte);
        System.out.println("Short: " + numeroShort);
        System.out.println("Int: " + numeroInt);
        System.out.println("Long: " + numeroLong);
        System.out.println("Float: " + numeroFloat);
        System.out.println("Double: " + numeroDouble);
        System.out.println("Char: " + caractere);
        System.out.println("Boolean: " + verdadeiroFalso);
    }
}
