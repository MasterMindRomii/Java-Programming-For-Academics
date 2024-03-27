package p1;

public class A 
{
    protected void display()
    {
        System.out.println("Welcome to Java");
    }
}

package p2;
import p1.*;

class B extends class A 
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.display();
    }
}

// Output - Welcome to Java