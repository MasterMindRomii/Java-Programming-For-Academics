public class ThreadExample implements Runnable{
    public void run()
    {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args)
    {
        ThreadExample t1 = new ThreadExample();
        Thread m1 = new Thread(t1);
        m1.start();
    }
}