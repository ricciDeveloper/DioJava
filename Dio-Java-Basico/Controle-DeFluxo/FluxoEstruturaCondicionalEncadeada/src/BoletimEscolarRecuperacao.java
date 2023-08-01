import java.util.Scanner;


public class BoletimEscolarRecuperacao {
    public static void main(String[] args) throws Exception {
        
        //criação do objeto scanner para que possa ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        //Declaração da variável junto a sua tipagem
        int mediaAprovacao = 7;
        double mediaAluno;
        //Solicitando informação de média das notas ao usuário
        System.out.println("Qual sua média de notas? ");
        //Convertendo a resposta String do usuário para double
        mediaAluno = Double.parseDouble(scanner.nextLine());
        //Estrutura condicional composta.
        if(mediaAluno >= mediaAprovacao)
        {
            System.out.println("Parabéns, você está aprovado!");
        }
        else if(mediaAluno >= 5 && mediaAluno <7){
            System.out.println("Você está de recuperação! ");
        }else
        {
            System.out.println("Você foi reprovado! Estude mais e você irá conseguir!");
        }
   }
}
