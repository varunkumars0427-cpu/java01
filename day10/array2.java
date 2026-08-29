package day10;

import java.util.*;

public class array2 {

    public static void main(String[] args) {

        String[] phone = {
            "9876543210",
            "9123456780",
            "9988776655",
            "8765432109",
            "9001122334"
        };

        String search = "98";

        ArrayList<String> result = new ArrayList<>();

        for (String number : phone) {

            if (number.contains(search)) {
                result.add(number);
            }
        }

        System.out.println("Search results:");

        for (String number : result) {
            System.out.println(number);
        }
    }
}