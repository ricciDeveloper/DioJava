public class ContadorFor {
    public static void main(String[] args) throws Exception {

        //Int carneiros -> a váriavel contadora comeÇa em 0, e só acontece uma vez.
        //carneiros <=25, o programa verifica se a váriavel é menor que 25
        //o programa inicia a contagem, e irá imprimir a mesma
        //Carneiros ++ -> indica que a cada passagem pelo For, será acrescentado+1
        //O fluxo é finalizado assim que Carneiros chega a 25, tornando a condiÇao em FALSE

        
        for(int carneiros = 0; carneiros <=25; carneiros++){
            System.out.println(carneiros+" - Carneiros");
        }
    
    }
}
