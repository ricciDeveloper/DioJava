import java.text.NumberFormat;
import java.text.ParseException;

public class TryCatchExececoes {
    public static void main(String[] args) throws Exception {
      try {
          Number valor = NumberFormat.getInstance().parse("a1.21");
          System.out.println(valor);
      } catch (ParseException e) {
            System.out.println("deu ruim zé!");
      }
        
    }
}
