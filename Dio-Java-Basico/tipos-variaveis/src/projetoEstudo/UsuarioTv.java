package projetoEstudo;

//objeto usario que interage com o objeto smarTv
public class UsuarioTv {
    public static void main (String[] args) throws Exception{

        //Chamando a classe principal
        SmartTvProject SmartTvProject = new SmartTvProject();


         //exibição do estado inicial da televisão
        System.out.println("A TV está ligada? " + SmartTvProject.ligada);//Já esta na chamada do método acima
        System.out.println("Qual o canal atual? " + SmartTvProject.canal);
        System.out.println("Qual o volume? " + SmartTvProject.volume);
      
      
      
        //chamada do método de ligar a televisão, contido na classe principal
        SmartTvProject.ligarTv();
        System.out.println("A TV está ligada? " + SmartTvProject.ligada);



        SmartTvProject.aumentarVolume();//chamada do método para aumentar o volume em +1
        SmartTvProject.aumentarVolume();//chamada do método para aumentar o volume em +1
        SmartTvProject.aumentarVolume();//chamada do método para aumentar o volume em +1
        SmartTvProject.diminuirVolume();//chamada do método para diminuir o volume em -1
        //Mostrando o volume atual após chamada do método de mudar volume
        System.out.println("Qual o volume? " + SmartTvProject.volume);




        SmartTvProject.canalAbaixo();//chamada do método para trocar o canal abaixo
        System.out.println("Qual o canal atual? " + SmartTvProject.canal);//mostrando o canal após o método ser chamado

        SmartTvProject.canalAcima();//chamada do método para trocar o canal acima
        System.out.println("Qual o canal atual? " + SmartTvProject.canal);//mostrando o canal após o método ser chamado


        //Chamada do método de escolha do canal, definida pelo usuário
        //Método com parametros, definido na classe SmartTv
        SmartTvProject.escolherCanal(15);
        //Mostrando aplicação do canal escolhido
        System.out.println("Qual o canal atual? " + SmartTvProject.canal);


        //chamada do método de desligar a televisão, contido na classe principal
        SmartTvProject.desligarTv();
        //Mostrando o estado da tv após o méotodo
        System.out.println("A TV está ligada? " + SmartTvProject.ligada);

       


    }
}