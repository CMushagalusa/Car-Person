public class Car {
    private Person driver;
    private Person frontSeatPassenger;
    private Person backSeatPassenger1;
    private Person backSeatPassenger2;
    private Person backSeatPassenger3;
    private String licensePlateNumber;
    private int numOccupant = 0;

    public Car() {
        driver = frontSeatPassenger = backSeatPassenger1 = backSeatPassenger2 = backSeatPassenger3 = null;
    }

    public Car(Person driver) {
        this.driver = driver;
        frontSeatPassenger = backSeatPassenger1 = backSeatPassenger2 = backSeatPassenger3 = null;
        if (driver.getAge() < 18) {
            System.out.println(driver.getName() + " is too young to be a driver.");
            System.exit(0);
        }
        numOccupant++;
    }

    // This method checks if the car has a driver.
    public boolean hasDriver() {
        if (driver == null) {
            System.out.println("The car does not have a driver.");
            return true;
        } else {
            System.out.println("The car has a " + driver.getAge() + " years old " + driver.getGender()
                    + " driver named " + driver.getName() + ".");
            return false;
        }
    }

    // This method checks if there is any passenger in the car.
    public boolean hasPassengers() {
        if (frontSeatPassenger != null || backSeatPassenger1 != null
                || backSeatPassenger2 != null || backSeatPassenger3 != null) {
            System.out.println("There is a passenger in the car.");
            return true;
        } else {
            System.out.println("There is no passenger in the car.");
            return false;

        }
    }

    // This method checks if the car is empty.
    public boolean isEmpty() {
        if (driver == null && frontSeatPassenger == null
                && backSeatPassenger1 == null && backSeatPassenger2 == null
                && backSeatPassenger3 == null) {
            System.out.println("The car is empty.");
            return true;
        } else {
            System.out.println("The car is not empty.");
            return false;
        }
    }

    // This method checks if the car is full.
    public boolean isFull() {
        if (driver != null && frontSeatPassenger != null && backSeatPassenger1 != null && backSeatPassenger2 != null
                && backSeatPassenger3 != null) {
            System.out.println("The car is full");
            return true;
        } else {
            System.out.println("The car is not full");
            return false;
        }
    }

    // This method allocates a driver to a car.
    public boolean setDriver(Person newDriver) {
        if (newDriver.getAge() > 18) {
            this.driver = newDriver;
            // numOccupant++;
            System.out.println("The driver is succefully set.");
            return true;
        } else {
            System.out.println(newDriver.getName() + " is too young to be a driver.");
            return false;
        }
    }
    // This method adds passengers in the car.

    public boolean addPassenger(Person newPassenger) {
        if (frontSeatPassenger == null) {
            frontSeatPassenger = newPassenger;
            System.out.println(newPassenger.getName() + " has been succefully added to the front seat.");
        }

        else if (backSeatPassenger1 == null) {
            backSeatPassenger1 = newPassenger;
            System.out.println(newPassenger.getName() + " has been succefully added to the first back seat.");
        }

        else if (backSeatPassenger2 == null) {
            backSeatPassenger2 = newPassenger;
            System.out.println(newPassenger.getName() + " has been succefully added to the second back seat.");
        } else if (backSeatPassenger3 == null) {
            backSeatPassenger3 = newPassenger;
            System.out.println(newPassenger.getName() + " has been succefully added to the third and last back seat.");
        } else {
            System.out.println("Unfortunately, " + newPassenger.getName() + " connot not be added. The car is full.");
            return false;
        }

        numOccupant++;
        return true;
    }

    // This method return the number of people in the car.
    public int getNumOccupant() {
        return numOccupant;
    }

    /*
     * public String toString() {
     * return ("There are " + numOccupant + " people in the car: A driver who is " +
     * driver + ", "
     * + frontSeatPassenger + " on the front seat, and " + backSeatPassenger1 + ", "
     * + backSeatPassenger2 + ", and " + backSeatPassenger3 +
     * " on the back seats.");
     * }
     */

    // This method reports people who are in the car.

    /*
     * public void listRiders() {
     * if (driver != null)
     * System.out.println(
     * "The driver is a " + driver.getAge() + " years old " + driver.getGender() +
     * " named "
     * + driver.getName()
     * + ".");
     * if (frontSeatPassenger != null)
     * System.out.println("The front seat passenger is a " +
     * frontSeatPassenger.getAge() + " years old "
     * + frontSeatPassenger.getGender() + " named " + frontSeatPassenger.getName() +
     * ".");
     * if (backSeatPassenger1 != null)
     * System.out.println("The first back seat passenger is a " +
     * backSeatPassenger1.getAge() + " years old "
     * + backSeatPassenger1.getGender() + " named " + backSeatPassenger1.getName() +
     * ".");
     * if (backSeatPassenger2 != null)
     * System.out.println("The second back seat passenger is a " +
     * backSeatPassenger2.getAge() + " years old "
     * + backSeatPassenger2.getGender() + " named " + backSeatPassenger2.getName() +
     * ".");
     * if (backSeatPassenger3 != null)
     * System.out.println("The third back seat passenger is a " +
     * backSeatPassenger3.getAge() + " years old "
     * + backSeatPassenger3.getGender() + " named " + backSeatPassenger3.getName() +
     * ".");
     * }
     */

    // This method reports people who are in the car.
    public void listRiders() {
        if (driver != null)
            System.out.println("The driver is a " + driver + ".");
        if (frontSeatPassenger != null)
            System.out.println("The front seat passenger is a " + frontSeatPassenger + ".");
        if (backSeatPassenger1 != null)
            System.out.println("The first back seat passenger is a " + backSeatPassenger1 + ".");
        if (backSeatPassenger2 != null)
            System.out.println("The second back seat passenger is a " + backSeatPassenger2 + ".");
        if (backSeatPassenger3 != null)
            System.out.println("The third back seat passenger is a " + backSeatPassenger3 + ".");
    }
}
