// Exemplo de variáveis local e global em Java

        public class c_variaveisLocalGlobal {

            // Variável global (membro da classe, acessível por todos os métodos da classe)
            static int varGlobal = 20;

            public static void main(String[] args) {

                // Variável local (só existe dentro deste método)
                int varLocal = 10;

                // Exibindo o valor da variável local
                System.out.println("Valor da variável local: " + varLocal);

                // Exibindo o valor da variável global
                System.out.println("Valor da variável global: " + varGlobal);

                // Chamando outro método para mostrar o acesso à variável global
                mostrarGlobal();
            }

            // Método que acessa a variável global
            public static void mostrarGlobal() {
                System.out.println("Acessando a variável global em outro método: " + varGlobal);
            }
        }