package main.qa._2023_02_01;

public class Person {
    Ability ability;

    public Person(Ability ability) {
        this.ability = ability;
    }

    public static void main(String[] args) {
        Person person = new Person(Ability.SING);
    }
}