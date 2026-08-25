package day06;

public class new_9 {

    public static void main(String[] args) {

        int[] marks = {80, 75, 90, 85, 70};

        int[] prefixSum = new int[marks.length];

        prefixSum[0] = marks[0];

        for (int i = 1; i < marks.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + marks[i];
        }

        int totalMarks = prefixSum[4];

        System.out.println("Maths = " + marks[0]);
        System.out.println("English = " + marks[1]);
        System.out.println("Java = " + marks[2]);
        System.out.println("DBMS = " + marks[3]);
        System.out.println("Python = " + marks[4]);
        System.out.println("Total Marks = " + totalMarks);
    }
}