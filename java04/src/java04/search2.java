package java04;

import java.util.HashSet;

public class search2 {

    public static void main(String[] args) {

        int[] no = {10, 20, 30, 20, 40};

        HashSet<Integer> set = new HashSet<>();

        for (int n : no) {

            if (set.contains(n)) {

                System.out.println("Duplicate: " + n);

            } else {

                set.add(n);
            }
        }
    }
}