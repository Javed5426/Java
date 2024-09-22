public class Javat_14 {
    public static void main(String[] args) {
        // Properly initialize a 3D array
        int[][][] myNumber = {
            { {1, 2, 3}, {4, 5, 6} },  // First 2D array
            { {25, 26, 78},{25,27,36}},    // Second 2D array
            { {36},{78,65,25} }                   // Third 2D array
        };
        
        // Access and print the element at position [0][1][1]
        System.out.println(myNumber[1][1][2]); // Output will be 5
    }
}
