class Animal 
{
    private String Species;

    public Animal(String Species)
    {
        this.Species=Species;
    }

    public void displaySpecies()
    {
        System.out.println("Species: "+ Species);
    }

    public static void main()
    {
        Animal animal = new Animal("Canine");
        animal.displaySpecies();
    }
}

public class Dog extends Animal
{
    private String Name;

    public Dog(String Name, String Species)
    {
        super(Species);
        this.Name = Name;
    }

    public void displayDetails()
    {
        super.displaySpecies();
        System.out.println("Name: "+Name);
    }
    public static void main(String[] args)
    {
        Dog dog = new Dog("Canine","Buddy");
        dog.displayDetails();
    }
    
}