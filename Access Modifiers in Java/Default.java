package p1
class Geek{
    void Display()
    {
        System.out.println("Hello World!");
    }
}

package p2
import p1.*

class NewGeek{

    public static void main(String args[])
    {
        Geek obj = new Geek();

        obj.Display();
    }
}

// Output - Compile time error