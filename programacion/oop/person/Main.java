package oop.person;

public class Main
{
    public static void main(String[] args)
    {
        Person person1 = new Person("John", "Lennon", 32);
        Person person2 = new Person("Ringo", "Starr", 29);
        Person person3 = new Person("Paul", "McCartney", 28);
        Person person4 = new Person("George", "Harrison", 26);

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();

        Employee employee1 = new Employee("Eric", "Clapton", 44, 1200, 450);
        Employee employee2 = new Employee("Robert", "Plant", 24, 1700, 100);
        Employee employee3 = new Employee("Jimmy", "Page", 35, 4200, 350);
        Employee employee4 = new Employee("Albert", "King", 21, 2110, 25);
        Employee employee5 = new Employee("Jimi", "Hendrix", 54, 6000, 1000);

        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
        employee4.displayInfo();
        employee5.displayInfo();
    }
}