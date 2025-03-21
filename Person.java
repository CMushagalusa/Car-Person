public class Person {
  private String name;
  private int age;
  private String gender;

  public Person() {
    name = "No name yet";
    age = 0;
    gender = "male";
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String toString() {
    return (age + " years old " + gender + " named " + name);
  }

  public void setName(String newName) {
    name = newName;
  }

  public void setAge(int newAge) {
    if (newAge >= 0) {
      age = newAge;
    } else {
      System.out.println("You should enter a positive number to refer to the age.");
      System.exit(0);
    }
  }

  public void setGender(String newGender) {

    if (newGender.toLowerCase().equals("male")) {
      gender = newGender;
    } else if (newGender.toLowerCase().equals("female")) {
      gender = newGender;
    } else {
      System.out.println("The gender you have just entered is not recognized.");
      System.exit(0);
    }
  }

  public void setPerson(String newName, int newAge, String newGender) {
    setName(newName);
    setAge(newAge);
    setGender(newGender);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  // This method determines whether two perons are equals based on their names and
  // ages.

  public boolean equals(Person otherPerson) {
    return (this.name.equals(otherPerson.name) && this.age == otherPerson.age);
  }

  public boolean equals0(Person otherPerson) {
    if (this.name.equals(otherPerson.name) && this.age == otherPerson.age) {
      System.out.println(name + " and " + otherPerson.getName() + " are equals.");
      return true;
    } else {
      System.out.println(name + " and " + otherPerson.getName() + " are not equals.");
      return false;
    }
  }

  // This method campares two persons.

  public void comparePerson(Person otherPerson) {
    if (this.name.equals(otherPerson.name)) {
      System.out.println(name + " and " + otherPerson.getName() + " have the same name.");
    }
    if (this.age == otherPerson.age) {
      System.out.println(name + " and " + otherPerson.getName() + " have the same age.");
    }
    if (this.age > otherPerson.age) {
      System.out.println(name + " is older than " + otherPerson.getName() + ".");
    }
    if (this.age < otherPerson.age) {
      System.out.println(name + " is younger than " + otherPerson.getName() + ".");
    }

  }
}
