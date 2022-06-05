import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        String Funcionario;
        System.out.println("Funcionário: ");
        Funcionario = ler.nextLine();

        double salario;
        System.out.println("Salário: ");
        salario = ler.nextDouble();

        double bonus = salario * 0.20;
        double salarioliquido = salario + bonus;

        if (salario <= 1000) {
            System.out.println("Funcionário: " + Funcionario);
            System.out.println("Salário: " + salario);
            System.out.println("Bonus: " + bonus);
            System.out.printf("Salário Líquido: R$ %.2f%n", salarioliquido);
        }

        ler = new Scanner(System.in);

        System.out.println("Funcionário: ");
        Funcionario = ler.nextLine();

        System.out.println("Salário: ");
        salario = ler.nextDouble();

        bonus = salario * 0.10;
        salarioliquido = salario + bonus;

        if (salario > 1000 || salario <= 2000) {
            System.out.println("Funcionário: " + Funcionario);
            System.out.println("Salário: " + salario);
            System.out.println("Bonus: " + bonus);
            System.out.printf("Salário Líquido: R$ %.2f%n", salarioliquido);
        }


        ler.close();


    }

}