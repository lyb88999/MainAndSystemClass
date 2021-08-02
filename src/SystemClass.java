public class SystemClass {
    public static void main(String[] args) {
        long startMS = System.currentTimeMillis();

        int counter = 0;
        for(int i = 0; i < 1000;i++){
            counter++;
        }

        long endMS = System.currentTimeMillis();
        System.out.println("程序执行使用了"+(endMS-startMS)+"ms");

        long startNS = System.nanoTime();

        counter = 0;
        for(int i = 0; i < 1000;i++){
            counter++;
        }

        long endNS = System.nanoTime();
        System.out.println("程序执行使用了"+(endNS-startNS)+"ms");
    }
}
