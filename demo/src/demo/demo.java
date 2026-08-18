package demo;

public class demo {
	int a = 66;          // instance variable
    static int cc = 99;  // static variable

    void m1() {
        int a = 10;
        System.out.println("gsdfgsdkl" + a);
    }

    public demo() {
        int b = 10;
        System.out.println("sdf" + b);
    }

    public static void main(String[] args) {

        demo test = new demo(); // object

        test.m1();

        System.out.println("tyhank you" + test.a);

        System.out.println(cc);

        System.out.println(demo.cc);
    }
}


