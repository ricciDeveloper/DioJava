public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String nome = "joao";
        int idade = 24;
        final int NASCIMENTO = 1999; //constantes por conveção são em maiúsculo. E com a tag Final no inicio de sua declaração, após sua tipagem.

        // váriaveis são altamente tipadas em Java. Lembre sempre de verificar se foi determinado o tipo da mesma
        System.out.println("O nome é "+ nome +", a idade é " + idade + " anos\nE seu nascimento foi no ano de " + NASCIMENTO );
    }
}
