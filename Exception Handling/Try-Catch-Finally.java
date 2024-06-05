public class TryCatchFinally{
    public static void main(String[] args)
    {
        try{
            int data= 50/0;
            int empty = null;
            int arr[] = new int[6];
            int arr[10]=45;
            // Note: Make 3 out of 4 as comment for execution of code
        }
        
        catch(ArithmeticException e1){
            System.out.println("Error Handled...");
        }

        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("ArrayIndexOutOfBound Error...");
        }

        catch(NullPointerException e3)
        {
            System.out.println("NullPointerException Error...");
        }

        finally{
            System.out.println("It always print either exception handle or not");
        }
    }
}