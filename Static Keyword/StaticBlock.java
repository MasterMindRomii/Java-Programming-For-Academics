class Initialization {
    // Static variable
    private static int value;

    // Static block
    static {
        value = 10;
        System.out.println("Static block executed. Value: " + value);
    }

    public static int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Value from static block: " + Initialization.getValue());
    }
}
