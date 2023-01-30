package main.qa._2023_01_30;

public class Getter {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main1 {
    public static void main(String[] args) {
        Getter getter = new Getter();
//        getter.age = 11;
//        System.out.println(getter.age);
        getter.setAge(11);
        System.out.println(getter.getAge());
    }
}
