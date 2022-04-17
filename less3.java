public class less3 {

    public static void main(String args[]) throws InterruptedException {

        for (int i = 10; i > 0; i--){

            System.out.println(i);
            Thread.sleep(1,500_000);
        }
        System.out.println("Поїхали");
    }
}
