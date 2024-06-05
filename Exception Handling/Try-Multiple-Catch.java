public class TryMultipleCatch{
    public static void main(String[] args)
    {
        try{

            int arr[]= new int[5];
            arr[3]=50/0; // it gives 1st catch block
            arr[10]=67; //it gives 2nd catch block
            arr[2]=null; // it gives 3rd catch block
            // Note: Make 2 out of 3 as comment for execution of code
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Error...");
        }

        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("ArrayIndexOutOfBound Error...");
        }

        catch(NullPointerException e3)
        {
            System.out.println("NullPointerException Error...");
        }

        System.out.println("Rest of the code...");
    }
}