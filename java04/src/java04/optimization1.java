package java04;

public class optimization1 {
    public static void main(String[] args) {
        int n = 1000;
        int[] students = new int[n];
        int target = 1000;
        boolean found = false;

        // Combined initialization and search into a single loop
        for (int i = 0; i < n; i++) {
            students[i] = i + 1;
            
            if (students[i] == target) {
                found = true;
                // Note: We do not break here because we still need 
                // to finish initializing the rest of the array.
            }
        }

        System.out.println("student found: " + found);
    }
}
