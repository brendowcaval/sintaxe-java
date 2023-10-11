public class ExemploFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("contando : " + i);
        }

        // for com arrays
        String campeoesPosicao[] = { "breno", "joao", "anderson" };

        for (int posicao = 0; posicao < campeoesPosicao.length; posicao++) {
            System.out.println("posicao " + posicao + " é o : " + campeoesPosicao[posicao]);
        }

        // com break e continue
        for (int i = 0; i <= 10; i++) {
            if (i == 5)
                break; // interrompe o programa
            System.out.println("com o break : " + i);
        }
        // com o continue, ele interrompe mas depois continua a execução
        for (int i = 0; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println("com o continue : " + i);
        }

    }
}
