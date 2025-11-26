class Overloads {
    String uniqueID;

    public int addNums(int a, int b) {
        return a + b;
    }

    public double addNums(double a, double b) {
        return a + b;
    }

    public void setUniqueID(String theID) {
        uniqueID = theID;
    }

    public void setUniqueID(int ssNumber) {
        String numString = "" + ssNumber;
        setUniqueID(numString);
    }
}

public class MethodOverloadExample {
    void main() {
        Overloads ol = new Overloads();

        // Test addNums with integers
        int sumInt = ol.addNums(5, 10);
        System.out.println("Sum of integers (5, 10): " + sumInt);

        // Test addNums with doubles
        double sumDouble = ol.addNums(5.5, 10.2);
        System.out.println("Sum of doubles (5.5, 10.2): " + sumDouble);

        // Test setUniqueID with a String
        ol.setUniqueID("ABC123");
        System.out.println("Unique ID after setting with String: " + ol.uniqueID);

        // Test setUniqueID with an int
        ol.setUniqueID(7890);
        System.out.println("Unique ID after setting with int: " + ol.uniqueID);
    }
}