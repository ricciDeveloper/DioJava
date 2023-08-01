package projetoEstudo;
//Exercitando
//Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
//Ela tenha as características: ligada (boolean), canal (int) e volume (int)
//Nossa TV poderá ligar e desligar e assim mudar o estado ligada
//Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
//Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

  //nosso objeto
public class SmartTvProject {
//atributos da nossa smart tv, ela se iniciará dessa forma
  boolean ligada = false;
  int canal = 8;
  int volume = 12;




  //Méotodo de ligar a TV
  public void ligarTv (){
    ligada = true;
  }

//Méotodo de desligar a TV
  public void desligarTv (){
    ligada = false;
  }



//Método para escolher o canal definindo-o.
                //Esse método precisa de um parametro
                //Pois o usuário quem vai informar o canal que deseja assistir
  public void escolherCanal (int novoCanal){
    canal = novoCanal;
  }

//Método para trocar para o canal acima
  public void canalAcima(){
    canal++;
    System.out.println("Next channel "+canal);
  }
  //Método para trocar para o canal abaixo
  public void canalAbaixo(){
    canal--;
    System.out.println("Previous channel "+canal);
  }



//Méotodo de aumentar o volume da TV
  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para "+volume);

  }
  //Méotodo de diminuir o volume da TV
    public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo o volume para "+volume);
  }
}
