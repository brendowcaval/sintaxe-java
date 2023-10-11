import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        int km = 10;

        while (km > 0) {
            System.out.println("sua velocidade : " + km + "KM");
            km--;
        }

        System.out.println("você freiou!");

        // do while
        Scanner scanner = new Scanner(System.in);
        boolean contaFechada = true;
        int senhaDoBanco = 123;

        do {
            System.out.println("Digite a senha da sua conta do banco : ");
            int senhaDigitada = scanner.nextInt();

            if (senhaDigitada == senhaDoBanco)
                contaFechada = false;
            else
                System.out.println("Senha errada.");

        } while (contaFechada);

        System.out.println("você agora tem acesso ao banco!");
    }
}