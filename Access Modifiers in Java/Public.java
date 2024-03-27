package p1;

public class A 
{
    public void Display()
    {
        System.out.println("Public Access Modifier!");
    }
}

package p2;
import p1.*;

public class B
{
    public static void main(String args[])
    {
        A obj = new A();
        A.Display();
    }
}