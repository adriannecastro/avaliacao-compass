import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int correta = 0;
        int erros = 0;

        System.out.println("Bem-vindo(a) ao Quiz!\n");

        System.out.println("Digite seu nome: ");
        String nome = ler.next();

        System.out.println("1) Qual a soma de 2 + 2? ");
        System.out.println("a. 1");
        System.out.println("b. 4"); // Resposta correta
        System.out.println("c. 3");
        System.out.println("Digite sua resposta: ");

        String resposta = ler.next();

        if (resposta.equals("b")) {
            System.out.println("Parabéns! Resposta correta!\n");
            correta++;
        } else {
            System.out.println("Que pena! Resposta errada!\n");
            erros++;
        }

        System.out.println("2) Qual a capital da França? ");
        System.out.println("a. Paris"); // Resposta correta
        System.out.println("b. Roma");
        System.out.println("c. Londres");
        System.out.println("Digite sua resposta: ");

        resposta = ler.next();

        if (resposta.equals("a")) {
            System.out.println("Parabéns! Resposta correta!\n");
            correta++;
        } else {
            System.out.println("Que pena! Resposta errada!\n");
            erros++;
        }

        System.out.println("3) Qual o nome do presidente do Brasil? ");
        System.out.println("a. Lula");
        System.out.println("b. Ciro Gomes");
        System.out.println("c. Jair Bolsonaro"); // Resposta correta
        System.out.println("Digite sua resposta: ");

        resposta = ler.next();

        if (resposta.equals("c")) {
            System.out.println("Parabéns! Resposta correta!\n");
            correta++;
        } else {
            System.out.println("Que pena! Resposta errada!\n");
            erros++;
        }

        System.out.println("4) Qual a capital do Tocantins? ");
        System.out.println("a. Gurupi");
        System.out.println("b. Palmas"); // Resposta correta
        System.out.println("c. Araguaína");
        System.out.println("Digite sua resposta: ");

        resposta = ler.next();

        if (resposta.equals("b")) {
            System.out.println("Parabéns! Resposta correta!\n");
            correta++;
        } else {
            System.out.println("Que pena! Resposta errada!\n");
            erros++;
        }

        int total = 4;
        int pontuacao = correta;
        int incorretas = erros - total;

        System.out.println("*** Resultado do Quiz ***");
        System.out.println("Usuário: " + nome);
        System.out.println("Acertos: " + pontuacao);
        System.out.println("Erros: " + erros);

    }
}
