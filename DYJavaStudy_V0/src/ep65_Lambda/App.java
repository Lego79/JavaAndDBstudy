package ep65_Lambda;

public class App {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.print("1");
                    try {
                        Thread.sleep(3000); // 1초 동안 일시 정지
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        //======= Lambda ========
        Runnable r2 = () -> {
            while (true) {
                System.out.print("2");
                try {
                    Thread.sleep(6000); // 1초 동안 일시 정지
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(r2);
        t2.start();
        
        Runnable r3 = () -> {
            while (true) {
                System.out.print("3");
                try {
                    Thread.sleep(9000); // 1초 동안 일시 정지
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t3 = new Thread(r3);
        t3.start();
        
    }
}
