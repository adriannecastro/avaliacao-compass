import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Login {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String usuario;
        System.out.println("Usuário: ");
        usuario = ler.nextLine();

        String senha;
        System.out.println("Senha: ");
        senha = ler.nextLine();

        Date data = new Date();
        Calendar calendario = GregorianCalendar.getInstance();
        int horas = calendario.get(Calendar.HOUR_OF_DAY);
        System.out.println("Data/Hora atual: " + calendario.getTime());

        if (usuario.equals("Adrianne") && horas > 6 && horas < 12 && senha.equals("1234")){
            System.out.println("Bom dia, você se logou ao nosso sistema");
        } else if (usuario.equals("Adrianne") && horas > 12 && horas < 18 && senha.equals("1234")){
            System.out.println("Boa tarde, você se logou ao nosso sistema");
        } else if (usuario.equals("Adrianne") && horas < 24 && senha.equals("1234")){
            System.out.println("Boa noite, você se logou ao nosso sistema");
        } else if (usuario.equals("Adrianne") && horas > 0 && horas < 6 && senha.equals("1234")){
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        } else {
            System.out.println("Usuário e/ou senha incorretos");
        }
    }
}


