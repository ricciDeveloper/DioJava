public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String meuCep = formatarCep("87083150");
            System.out.println(meuCep);
        } catch (CepInvalidoException e) {
      
            System.out.println("CEP inválido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length()!= 8)
            throw new CepInvalidoException();
            return "12.345-120";
        
    }
}
