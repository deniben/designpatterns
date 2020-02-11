package main.java.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilderImpl()
                .setName("Denis")
                .setAge(22)
                .setBuilding("21")
                .build();
        System.out.println(person.name + " " + person.age);
    }


}
