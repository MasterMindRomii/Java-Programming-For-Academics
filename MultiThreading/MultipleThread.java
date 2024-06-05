public class MultipleThread extends Thread{
    public void run()
    {
        System.out.println("Multiple thread is running...");
    }

    public static void main(String[] args)
    {
        MultipleThread m1 = new MultipleThread();
        MultipleThread m2 = new MultipleThread();
        MultipleThread m3 = new MultipleThread();

        m1.start();
        m2.start();
        m3.start();
    }
}