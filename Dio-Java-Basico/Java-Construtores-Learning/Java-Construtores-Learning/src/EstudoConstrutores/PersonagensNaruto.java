package EstudoConstrutores;

public class PersonagensNaruto{
        //atributos da classe
    private String nome;
    private int idade;
    private String chackra;
    private String aldeia;
    
            //construtor da classe, para que possamos gerar novos objetos persongens,
        public PersonagensNaruto(String nome, String aldeia)
    {
        this.nome = nome;
        this.idade = 1;
        this.chackra = "vento";
        this.aldeia = aldeia;

    }

    //método para imprimir os personagens
    public void ImprimePersonagens()
    {
        System.out.format("\nNome do ninja: %s\nIdade do ninja: %d anos\nChackra que o ninja possui: %s\nAldeia que ele(a) pertence: %s\n",
        nome,
        idade,
        chackra,
        aldeia
    

        );
    }
        //getter and setters dos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getChackra() {
        return chackra;
    }

    public void setChackra(String chackra) {
        this.chackra = chackra;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }


}