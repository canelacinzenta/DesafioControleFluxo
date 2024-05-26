import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO PARÂMETRO: ");
        int parametroUm = terminal.nextInt();
        System.out.println("DIGITE O SEGUNDO PARÂMETRO: ");
        int parametroDois = terminal.nextInt();

        terminal.close();

        contar(parametroUm, parametroDois);

        try {
            contar(parametroUm, parametroDois);
        }catch(InputMismatchException e){
            System.out.println("O PARÂMETRO DOIS TEM QUE SER MAIOR QUE O PARÂMETRO UM");
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        int contagem = parametroDois - parametroUm;
        
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }

    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
    
}