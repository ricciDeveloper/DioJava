public class ForEmArray {
    public static void main(String[] args) {

        // Um array em String de nomes de "alunos, com 5 index"
            //array , o indice incia em zero.
        String alunos []= {"JOÃO" , "VITOR", "MARIA","JOSÉ","PEDRO","STELLA"};
            //Criando o laço de for
                    //começando com a variavel contadora X em, enquanto x for menor que o tamanho "length" do array, será incrementado em +1
        for (int x = 0; x<alunos.length;x++){
                        //imprimindo o aluno no indíce, solicitando o indíce de X.
                        //o indíce de X que será incrementado a cada passada pelo for, até que a contadora X tenha o tamanho de indices do array alunos
            System.out.println("O aluno no indíce X= "+x+ " é " + alunos[x]);

        }

        //Uma outra forma de interagir em um array com o for

        String clientes [] = {"CARLOS" , "TIAGO", "WILLIAM", "PAULO"};
        
        for (String cliente : clientes){
            System.out.println("É nosso cliente: "+ cliente);
        }
    }
}
