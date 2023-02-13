package main.qa._2023_02_08;

public class SE {
    static void m1() {
        System.out.println("M1 --> put");
        System.out.println("M1 --> get");
    }

    static void m2() {
        System.out.println("M2 --> put");
        m1();
        System.out.println("M2 --> get");
    }

    static void m3() {
        System.out.println("M3 --> put");
        m2();
        System.out.println("M3 --> get");
    }

    public static void main(String[] args) {
        System.out.println("MAIN START");
        m3();
        System.out.println("MAIN END");
    }
}
