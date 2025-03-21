import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Person person0 = new Person("Clovis", 10, "male");
        Person person1 = new Person("Clovis", 12, "male");
        Person person2 = new Person("Clovis", 12, "male");
        Person person3 = new Person("Mushagalusa", 13, "male");
        Person person4 = new Person("Divine", 13, "female");
        Person person5 = new Person("Pascal", 14, "male");
        Person human = new Person();

        System.out.println("Report: " + human);

        human.setName("Mushaga");
        human.setAge(15);
        human.setGender("male");
        System.out.println("Report: " + human);

        System.out.println("Report: " + person0);

        // Testing the equals() method: Two persons are equals if they have the same
        // NAME and AGE.

        if (person1.equals(person2)) {
            System.out.println(person1.getName() + " and " + person2.getName() + " are equals.");
        } else {
            System.out.println(person1.getName() + " and " + person2.getName() + " are not equals.");
        }

        if (person4.equals(person5)) {
            System.out.println(person4.getName() + " and " + person5.getName() + " are equals.");
        } else {
            System.out.println(person4.getName() + " and " + person5.getName() + " are not equals.");
        }

        person1.equals0(person2);
        person4.equals0(person5);

        // Testing the comparePerson() methods. It compares
        person1.comparePerson(person2);
        person2.comparePerson(person5);
        person3.comparePerson(person1);
        person4.comparePerson(person3);

        // This bloc of code sets a new object of Person type by taking information from
        // the user.
        String name, gender;
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name: ");
        name = keyboard.next();
        person.setName(name);

        System.out.print("Enter the age: ");
        age = keyboard.nextInt();
        person.setAge(age);

        System.out.print("Enter the gender: ");
        gender = keyboard.next();
        person.setGender(gender);

        person.setPerson(name, age, gender);

        System.out.println("The person is called " + person.getName() +
                ", he/ she is " + person.getAge()
                + " years old and he/she is a " + person.getGender());

    }
}