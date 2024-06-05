// Define the user-defined exception
class AgeValidationException extends Exception
{    public AgeValidationException(String Message){
        super(Message);
    }
}

public class VoterValidation {
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be 18 or older to vote. Provided age: " + age);
        }
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            validateAge(age);
        } catch (AgeValidationException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
