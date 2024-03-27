package p1

class A
{
    private void display()
    {
        System.out.println("Hello World!");
    }
}

class B
{
    public static void main(String args[])
    {
        A obj = new A();
    }
}

// Output - error: display() has private access in A
// obj.display();