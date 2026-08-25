package day06;

public class name {
    public static void main(String[] args) {

        String[] name = {"varun", "vaishak", "vijay"};
        String[] name1 = {"yashwanth", "yashwanth sk", "chummy"};

        String[] joined = new String[name.length + name1.length];

        for (int i = 0; i < name.length; i++) {
            joined[i] = name[i];
        }

        for (int i = 0; i < name1.length; i++) {
            joined[name.length + i] = name1[i];
        }

        System.out.println("Joined Array:");

        for (int i = 0; i < joined.length; i++) {
            System.out.print(joined[i] + " ");
        }
    }
}
