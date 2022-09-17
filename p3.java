interface P1 {
    int a = 1;

    void displayP1();
}

interface P2 {
    int b = 2;

    void displayP2();
}

interface P12 extends P1, P2 {
    int c = 12;

    void displayP12();
}

class implementingInterface implements P12 {
    public void displayP1() {
        System.out.println("P1 = " + a);
    }

    public void displayP2() {
        System.out.println("P2 = " + b);
    }

    public void displayP12() {
        System.out.println("P12 = " + c);
    }
}
