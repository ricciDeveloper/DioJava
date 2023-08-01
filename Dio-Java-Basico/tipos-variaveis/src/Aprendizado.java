public class Aprendizado {
    public static void main (String[] args){
        String nomeUser = "João";
        String nomeDev = "João";
        int idadeUser = 24;
        boolean doadorOrgao = false;
        double peso = 68.5;;
        System.out.println("Meu nome é "+ nomeUser +", Minha idade é " + idadeUser + " anos");  
        System.out.println(nomeUser.equals(nomeDev));

        if (nomeUser == "joão" || nomeDev == "joão") {
            System.out.print("Um dos dois se chama João");
        }
        if (nomeUser == "Pedro" && nomeDev == "joão") {
            System.out.print("Os dois se chama João\n");
        }else{
            System.out.print("Um dos usuários não se chamam joão \n");
        }

        if (doadorOrgao == false){
            System.out.print("Precisa começar a pensar no próximo!\n");
        }else{
            System.out.print("Parabéns! \n");
        }
        if (peso > 65.0 && idadeUser>20){
            System.out.print("Precisa cuidar do shape amigão \n");
        }
    }    
}
