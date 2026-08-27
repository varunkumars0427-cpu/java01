package day_8;

public class demo5 {

    public static void main(String[] args) {

        int amount = 10000;
        int withdraw = 2000;
        int i = 0;

        while (i < 5) {

            amount = amount - withdraw;

            System.out.println("Withdraw done balance is : " + amount);

            i++;
        }
    }
}