package demo1;

interface Atm {
    abstract void depo();
    abstract void with();
}

abstract class Abc implements Atm {

    public void depo() {
        System.out.println("Depos");
    }
}

public class interface1 extends Abc {

    public void with() {
        System.out.println("With");
    }

    public static void main(String[] args) {

        interface1 v = new interface1();

        v.depo();
        v.with();
    }
}
