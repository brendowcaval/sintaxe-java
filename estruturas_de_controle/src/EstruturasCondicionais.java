public class EstruturasCondicionais {
    public static void main(String[] args) {

        // condicional simples
        int senhaDigitadaPeloUsuario = 100;
        int senhaDoBanco = 100;

        if (senhaDigitadaPeloUsuario == senhaDoBanco)
            System.out.println("você tem acesso ao banco.");

        // condicional composta
        int notaAluno = 10;
        if (notaAluno > 5)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");

        // condicional encadeada
        String nomeAluno = "Brendow";
        if (notaAluno >= 6 && notaAluno <= 8) { // com mais de 1 linha de codigo, use o {}
            System.out.println("Sua nota é : " + notaAluno);
            System.out.println(nomeAluno + ", você foi aprovado!");
        } else if (notaAluno >= 9) {
            System.out.println("Sua nota é : " + notaAluno);
            System.out.println(nomeAluno + ", você foi aprovado. E parabéns pela nota alta!");
        } else
            System.out.println(nomeAluno + ", você foi reprovado!");

        // condição ternária
        char genero = 'f';
        String generoDoUsuario = genero == 'm' ? "masculino" : "feminino";
        System.out.println("seu gênero é " + generoDoUsuario);

        // condição ternária com else if
        // String generoDoUsuario = genero == 'm' ? "masculino" : genero == 'f' ?
        // "feminino" : "nao identificado";

        // switch case
        String tamanho = "G";

        switch (tamanho) {
            case "P":
                System.out.println("tamanho pequeno");
                break;
            case "M":
                System.out.println("tamanho médio");
                break;
            case "G":
                System.out.println("tamanho grande");
                break;
            default:
                System.out.println("tamanho indefinido");
        }

    }
}
