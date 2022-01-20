public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void speak(){
        System.out.println("Hello my name is " +this.firstName+ " " +this.lastName);
    }
}
