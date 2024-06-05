class SynchronizationMethod{
    synchronized void printTable(int n){
        for(int i=0;i<=n;i++)
        {
            System.out.println(i*n);
        }

        try{
            Thread.sleep(400);
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}

class Thread1 extends Thread{
    SynchronizationMethod s;
    Thread1(SynchronizationMethod s)
    {
        this.s=s;
    } 

    public void run()
    {
        s.printTable(5);
    }
}

class Thread2 extends Thread{
    SynchronizationMethod s;
    Thread2(SynchronizationMethod s)
    {
        this.s=s;
    }

    public void run(){
        s.printTable(100);
    }
}

public class SynchronizationMethodTest{
    public static void main(String[] args)
    {
        SynchronizationMethod obj = new SynchronizationMethod();
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}