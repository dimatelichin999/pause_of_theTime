import java.util.concurrent.TimeUnit;

public class less4 {

    public static void main(String args[]) throws InterruptedException {

        for (int i = 10; i > 0; i--){

            System.out.println(i);
           TimeUnit.MINUTES.sleep(2);
        }
        System.out.println("Поїхали");
    }
}
