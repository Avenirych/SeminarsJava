package org.example;
public class Main {

    public static void main(String[] args) {

        Person[] people = new Person[]{new Person("Petr", "Bashiriv", 47, "M", "89061234567"),
                new Person("Nikolai", "Ivanov", 31, "M", "89061234568"),
                new Person("Katja", "Novicova", 22, "F", "89061234569"),
                new Person("Jorg", "Simenon", 18, "M", "89061234560"),
                new Person("Vera", "Brejneva", 16, "F", "89061234566"),

        };

        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }

        for (Person person : people) {
            if (person.getGender() == "M") {
                person.sayHello();
            }
        }
    }
}