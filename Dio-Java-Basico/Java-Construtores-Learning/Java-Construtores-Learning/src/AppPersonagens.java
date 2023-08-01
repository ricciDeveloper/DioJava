//classe da aplicação
import EstudoConstrutores.PersonagensNaruto;

public class AppPersonagens{
    public static void main (String[] args) throws Exception{

        //com o método construtor criado na classe Personagens naruto, estamos criando 3 novos objetos
        //objeto naruto
        PersonagensNaruto naruto = new PersonagensNaruto("Naruto", "Folha");
        naruto.setNome("Naruto");
        naruto.setIdade(15);
        naruto.setChackra("vento");
        naruto.ImprimePersonagens();

        //objeto sasuske
        PersonagensNaruto sasuske = new PersonagensNaruto("Sasuske", "Akatsuki");
        sasuske.setNome("Sasuske");
        sasuske.setIdade(18);
        sasuske.setChackra("Raio");
        sasuske.setAldeia("Akatsuki");
        sasuske.ImprimePersonagens();
        //objeto kakashi
        PersonagensNaruto kakashi = new PersonagensNaruto("kakashi", "Folha");
        kakashi.setNome("Kakashi");
        kakashi.setIdade(40);
        kakashi.setChackra("Raio");
        kakashi.ImprimePersonagens();

    }
}