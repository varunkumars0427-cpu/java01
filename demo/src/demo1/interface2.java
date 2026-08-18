package demo1;

interface Atm2 {
    abstract void depo();
}

interface Atm3 {
    abstract void min();
}

public class interface2 implements Atm2, Atm3 {

    public void depo() {
        System.out.println("dep");
    }

    public void min() {
        System.out.println("min");
    }

    public static void main(String[] args) {

        interface2 v = new interface2();

        v.min();
        v.depo();
    }
}