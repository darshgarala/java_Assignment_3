
interface p {
    final int p = 10;

    void display_1();
}

interface p1 extends p {
    final int p1 = 100;

    void display_2();
}

interface p2 extends p {
    final int p2 = 200;

    void display_3();
}

interface p12 extends p1, p2 {
    final int p12 = 300;

    void display_4();
}

class pr3 implements p12 {

    public void display_1() {
        System.out.println("Interface p " + p);
    }

    public void display_2() {
        System.out.println("Interface p1 " + p1);
    }

    public void display_3() {
        System.out.println("Interface p2 " + p2);
    }

    public void display_4() {
        System.out.println("Interface p12 " + p12);
    }
}
