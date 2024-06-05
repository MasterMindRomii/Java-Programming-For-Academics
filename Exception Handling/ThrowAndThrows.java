public class ThrowExample{
    public static void validate(int age) throws IllegalArgumentException {
        if(age<18){
        throw new IllegalArgumentException("Age must be 18 or 18+");
    }
}

    public static void main(String[] args){
    int age=16;

    try{
        validate(age);
    }
    catch(IllegalArgumentException e)
    {
        System.out.println("Error Message: "+ e.getMessage());
    } 
}
}