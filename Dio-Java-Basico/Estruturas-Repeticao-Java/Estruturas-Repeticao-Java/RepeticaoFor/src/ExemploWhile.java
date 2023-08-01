//importando a classe que vai gerar valores aleatórios para nosso programa

import java.util.concurrent.ThreadLocalRandom;



//classe principal, para comeÇarmos o sistema
public class ExemploWhile {
    
    
    //classe main padrão
    public static void main(String[] args) {
        //declaraÇao da variavel saldo, que recebe o valor de 100
        double saldo = 100.00;
        
            //iniciando o laÇo de repeticÇao while. TRUE enquanto o saldo foi maior que zero
                //se o saldo zerar, se tornará FALSE e encerrará
        while(saldo > 0){

            //chamando o método que foi criado dentro da classe Exemplo While, que gera numeros aleatórios
            double valorDoces = valorAleatorio();
                //Condicional para evitar novas verificaÇoes, e que o saldo se torne negativo.
            if(valorDoces > saldo)
                valorDoces = saldo;
            //decremento do saldo a cada doce comprado, até que se torne zero e feche o laÇo de repetiÇao
            saldo = saldo - valorDoces;
            //imprimindo o valor dos doces adicionados a compra
            System.out.format("Doce do valor: R$%.2f - Adicionado ao carrinho.\n",
            valorDoces);

        }
            //imprimindo o saldo após a compra
        System.out.println("Saldo após a compra: R$"+saldo);
        System.out.println("Gastou todo o dinheiro em doces.");

    }
    //método para aleatorizar numeros para o sistema funcionar
        //numeros DOUBLE aleatórios entre 2 e 17 será gerado
            //feito com a classe java.util.current.ThreadLocalRandom
                    //estudar mais afundo essa classe*****************************
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 17);
    }
}
