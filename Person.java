public class Person {

    String firstName;
    String lastName;
    int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void Speak() {

        System.out.printf("Hello! My name is %s %s ", this.firstName, this.lastName);

    }



}
