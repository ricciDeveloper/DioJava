package TesteDeCodigo1.TesteDeCodigo3;

// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem {
    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		//QUANTIDADE DE CASOS DE TESTE
		int C = leitor.nextInt();
		// o primeiro nome de quem está tentando levantar o Mjölnir
		String nome;
		//e um inteiro N (1 ≤ N ≤ 25000), indicando a força aplicada para cima, em Newtons, ao puxar o martelo, de modo a tentar levantá-lo.
		int N;

// TODO: complete os espaços em branco com sua solução para o problema

		for (int i = 0; i < C; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
    }
	
}
