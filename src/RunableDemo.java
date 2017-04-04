/**
 * Created by RMSI on 2017/4/4.
 */
public class RunableDemo implements Runnable {
    private String message;

    public RunableDemo(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(message);
        }
    }
}
