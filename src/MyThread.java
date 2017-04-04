/**
 * Created by RMSI on 2017/4/4.
 */
public class MyThread extends Thread {
    private String message;
    public MyThread(String message)
    {
        this.message=message;
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
                 System.out.println(message);
        }
    }
}
