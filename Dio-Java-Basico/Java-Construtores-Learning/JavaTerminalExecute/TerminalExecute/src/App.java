import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Qual seu CEP? ");
        int cep = scanner.nextInt();

        System.out.println("Qual seu email? ");
        String email = scanner.next();





       /*  String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        int cep = Integer.valueOf(args[2]);
        String email = args[3];
        */

       System.out.println("Olá, me chamo "+ nome);
       System.out.println("Tenho " + idade + " anos");
       System.out.println("Moro no CEP: " + cep);
       System.out.println("Meu email de contato é: "+ email);
    }
}
