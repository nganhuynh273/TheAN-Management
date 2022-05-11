package hpn.thread;

public class Login implements Runnable {
    public static void main(String[] args) {
    }

    @Override
    public void run() {

        String[] list = {
                "❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀",
                "❀               TheAN                ❀",
                "❀------------------------------------❀",
                "❀                                    ❀",
                "❀           CỬA TIỆM BÌNH AN         ❀",
                "❀                                    ❀",
                "❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀",
        };

        for (int i = 0; i< list.length;i++ ){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(list[i]);
        }
    }
}



