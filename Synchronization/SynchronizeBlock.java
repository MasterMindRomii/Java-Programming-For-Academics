class SynchronizeBlock {
    void printTable(int n) {
        synchronized(this) {
            for(int i = 1; i <= 5; i++) { 
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread1 extends Thread {
    SynchronizeBlock s;
    MyThread1(SynchronizeBlock s) {
        this.s = s;
    }

    public void run() {
        s.printTable(5);
    }
}

class MyThread2 extends Thread {
    SynchronizeBlock s;
    MyThread2(SynchronizeBlock s) {
        this.s = s;
    }

    public void run() {
        s.printTable(100);
    }
}

public class SynchronizeBlockTest {
    public static void main(String[] args) {
        SynchronizeBlock obj = new SynchronizeBlock();
        MyThread1 m1 = new MyThread1(obj);
        MyThread2 m2 = new MyThread2(obj);
        m1.start();
        m2.start();
    }
}
