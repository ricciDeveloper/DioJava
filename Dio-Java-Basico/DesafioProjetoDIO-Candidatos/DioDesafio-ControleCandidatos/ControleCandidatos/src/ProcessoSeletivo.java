import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo de Contratação.");
        
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos){
            ligacaoSelecionados(candidato);
        }
        
    }

    //método para a seleÇao dos candidatos
    static void selecaoCandidato(){
        //Array de strings com 10 candidados
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        //variavel de candidatos selecionados baseado no salario, iniciado em zero selecionados
        int candidatosSelecionados = 0;
        //candidato atual, é a variavel que irá contabilizar no array, será incrementada
        int candidatoAtual = 0;
        //salario base do processo seletivo
        double salarioBase = 2000.00;
        //estrutura condicional
                                        //deixando em sua regra de negócio, que limitamos no tamanho do array [lenght = 10]
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            //selecionando o candidato no array candidados, em seu primeiro indice (zero = felipe)
            String candidato = candidatos[candidatoAtual];
            //variavel de salario pretendido, com a a chamada do método aleatorizador de numeros
            double salarioPretendido = valorPretendidoSalario();
            System.out.format("O candidato %s, solicitou o salário de R$%.2f\n", candidato, salarioPretendido);
            //controle de fluxo pra caso o salario seja compativel com o salarioBase fornecido
            if(salarioBase > salarioPretendido){
                System.out.println("O candidato " + candidato +" foi selecionado para a vaga");
                //incrementando a contadora de candidatos selecionados, caso aprovado pela validaÇao do salario
                candidatosSelecionados++;
            }
            //incremento da variavel de indice do array, para que possa ser passado por todos indices
            candidatoAtual++;
        }
    }
    static void ligacaoSelecionados(String candidatos){

        int tentativasContato = 1;
        boolean ligarMais = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            ligarMais= !atendeu;
            if(ligarMais){
                tentativasContato++;
            }else{
                System.out.println("CONTATO REALIZADO");
            }
        }while(ligarMais && tentativasContato < 5);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM O CANDIDATO "+ candidatos + " NA " + tentativasContato +"ª TENTATIVA DE CONTATO");
            
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO "+ candidatos + " EM "+ tentativasContato +"TENTATIVAS DE CONTATO");

        }
   
    }
     static boolean atender(){
        return new Random().nextInt(5)==1;
    }
    static void imprimirSelecionados(){
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo os candidatos selecionados pelo seu nº de indíce.");
        for (int i = 0; i < candidatosSelecionados.length; i++){
            System.out.println((i+1) + "º Candidato é "+ candidatosSelecionados[i] );

        }
    }
    //método para análise de candidato pelos salario pretendido vs salario base disponibilizado
    static void analiseCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }

    }

    //método simulador de salario com ThreadLocalRandom
    static double valorPretendidoSalario(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
