//importando classe para randomizar um numero inteiro

import java.util.Random;
//classe principal 
public class ExemploDoWhile {
    public static void main(String[] args) {
        //iniciando a discagem
        System.out.println("Discando");
        //bloco do while
            //telefone "toca"
        do {
            System.out.println("Telefone tocando..  ");
            //enquanto o método boleano tocando() não cair em False(o return é a negativa do atendeu !atendeu = false) o laço de repetição continuará rodando
        } while (tocando());
        //impimindo que atendeu
        System.out.println("Alô");
    }
    //método boleando aleatório, para que o telefone toque entre 1 e 5.
        //quando cair em 1, se torna true
                //o retorno é a negativa de atendeu, no caso, false
                    //fechando o laço de repetição DoWhile acima
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(5)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;

    }
}
