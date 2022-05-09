package divisao;

public class Numero {
    public static void dividir(int a, int b){
       int x = 0;

       try {
           x = a/b;
       }catch(ArithmeticException e){
           System.out.println("Nao eh possivel dividir por zero");
       }finally {
           System.out.println(
                   a + " / " + b + " = " + x
           );
       }

    }
}
