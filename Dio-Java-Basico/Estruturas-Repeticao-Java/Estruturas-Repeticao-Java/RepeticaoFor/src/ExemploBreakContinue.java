public class ExemploBreakContinue {
    public static void main(String[] args) {

        //aqui iniciamos a variavel contadora I em 0, o laÇo permanexe até que i seja igual ou maior que 10.    
        //cada iteraÇão, i é incrementado em +1
        for (int i = 1; i <=10 ; i++){
            //caso i seja igual a 5, o progrma para. Sem printar o 5
            //Se a instruÇão fosse Continue, o programa iria seguir imprimindo os numeros, mas sem o 5, pois ali é onde o fluxo foi dado continuidade
            if (i ==5){
                break;
                
            }    
            System.out.println(i);
        }
      
    }
}
