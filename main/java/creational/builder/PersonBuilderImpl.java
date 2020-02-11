package main.java.creational.builder;

public class PersonBuilderImpl implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public PersonBuilder setStreet(String street) {
        person.street = street;
        return this;
    }

    @Override
    public PersonBuilder setBuilding(String building) {
        person.building = building;
        return this;
    }

    @Override
    public PersonBuilder setWorkPlace(String workPlace) {
        person.workPlace = workPlace;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
