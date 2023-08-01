package TesteDeCodigo1.TesteDeCodigo2;

// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

// Abaixo segue um exemplo de código que você pode ou não utilizar


public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++)
			nomes[i] = sc.nextLine();
			System.out.println(nomes[2]);
            System.out.println(nomes[8]);
            System.out.println(nomes[6]);
            sc.close();

	}
}