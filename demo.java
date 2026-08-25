package day06;

public class demo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i);
        }

        char first = sb.charAt(0);
        System.out.println("first character: " + first);

        System.out.println("stringBuilder: " + sb);
        
        sb.deleteCharAt(2);
        System.out.println("after deleting: " +sb);
    }
}