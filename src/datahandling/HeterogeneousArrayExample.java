package datahandling;

public class HeterogeneousArrayExample {
    public static void main(String[] args) {
        Object[] hArray = new Object[5]; // Array of Object type
        
        hArray[0] = "Hello";     // String
        hArray[1] = 25;          // Integer (Autoboxed to Integer object)
        hArray[2] = 3.14;        // Double (Autoboxed to Double object)
        hArray[3] = true;        // Boolean (Autoboxed to Boolean object)
        hArray[4] = new int[]{1, 2, 3}; // Array of int
        
        for (Object obj : hArray) {
            System.out.println(obj);
        }
    }
}
