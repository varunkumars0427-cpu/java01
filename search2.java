package day_8;

public class search2 {

    public static int binarysearch(String[] arr, String target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            System.out.println("Checking: " + arr[mid]);

            if (arr[mid].equals(target)) {
                return mid;

            } else if (target.compareTo(arr[mid]) > 0) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String[] names = {
            "Arun",
            "Anand",
            "Chandru",
            "Kiran",
            "Manoj",
            "Pavan",
            "Rahul",
            "Ravi",
            "Suresh",
            "Varun"
        };

        String target = "Varun";

        int result = binarysearch(names, target);

        if (result != -1) {
            System.out.println("Name found at index: " + result);
        } else {
            System.out.println("Name not found");
        }
    }
}