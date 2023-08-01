import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        //criando o Objeto scanner para que possamos ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        //tipagem e declaração da variavel
        double saldo;
        double saque;

        //Mensagem no console solicitando os dados do usuário de saque e saldo
        System.out.println("Digite seu saldo: ");
        saldo = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o valor que deseja sacar: ");
        saque = Double.parseDouble(sc.nextLine());

        //controle de fluxo, via estrutura condicional para validar se a conta tem fundos para o saque
        if (saque <= saldo){
            saldo = saldo-saque;
            System.out.println("Seu saque foi de R$"+saque+" Seu saldo restante na conta é de R$"+saldo);
        }
    }
}
