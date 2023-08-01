import java.util.Scanner;
import java.util.InputMismatchException;

public class BoletimEscolarTernario {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua média escolar? ");
        int nota = sc.nextInt();

       String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" :"Reprovado";
       System.out.println(resultado);
       
       }
}
