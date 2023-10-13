import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcesao {
    public static void main(String[] args) {

        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("digite seu nome : ");
            String nome = scn.next();

            System.out.println("digite sua idade : ");
            int idade = scn.nextInt();

            System.out.println("seu nome é " + nome + " e sua idade " + idade + " anos.");

        } catch (InputMismatchException e) { // (nomeDaExcecao nomeandoela)
            System.out.println("a idade precisa ser um valor numérico.");

        }

        // também existe a possibilidade para nós criarmos nossa própria exceção
    }
}