class Student 
{
    private String Name;
    private int Age;

    public Student(String Name, int Age)
    {
        this.Name=Name;
        this.Age=Age;
    }

    public void display()
    {
        System.out.println("Person Name: "+Name);
        System.out.println("Person Age: "+Age);
    }

    public static void main(String args[])
    {
        Student student = new Student("Romi",20);
        student.display();
    }
}

