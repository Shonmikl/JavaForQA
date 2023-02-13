package main.qa._2023_02_08;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

//    @Override
//    public int compareTo(Person another) {
////        if(this.age == another.age) {
////            return 0;
////        } else if(this.age < another.age) {
////            return -1;
////        } else return 1;
//
////        return this.age - another.age;
//        int res = this.age - another.age;
//        if(res == 0) {
//            res = this.name.compareTo(another.name);
//        }
//        return res;
//    }
}