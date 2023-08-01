public class PlanoOperadoraa {
    public static void main(String[] args) throws Exception {
        /*O sistema terá 03 planos: BASIC, MIDIA , TURBO
BASIC: 100 minutos de ligação
MIDIA: 100 minutos de ligação + Whats e Intagram grátis
TURBO: 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube
*/
        String plano = "T";
        //Aqui não instruimos com o Break a cada case, pois foi criado em uma ordem decrescente, pra que possa ser reutilizado as informaçoes
        switch (plano) {
            case "T":{
                System.out.println("5GB de youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100minutos de ligação.");
            }
            
        }
    }
}
