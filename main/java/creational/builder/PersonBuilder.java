package main.java.creational.builder;

public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setStreet(String street);
    PersonBuilder setBuilding(String building);
    PersonBuilder setWorkPlace(String workPlace);
    Person build();
}
