public class TestCar {
    public static void main(String[] arges) {
        Car car0 = new Car();
        Car car1 = new Car(new Person("Clovis", 22, "male"));

        // System.out.println("The state of the car is as follows: " + car0);

        /*
         * car0.isEmpty();
         * car0.isFull();
         * car0.hasDriver();
         * 
         * car0.setDriver(new Person("Divine", 19, "female"));
         * car0.hasDriver();
         * car0.isEmpty();
         * 
         * car0.addPassenger(new Person("Pascal", 17, "male"));
         * 
         * car0.getNumOccupant();
         * car0.listRiders();
         */

        car1.hasDriver();
        System.out.println(" ");
        car1.hasPassengers();
        car1.getNumOccupant();

        car1.setDriver(new Person("Mushagalussa", 15, "male"));
        car1.hasDriver();

        car1.addPassenger(new Person("Daniel", 5, "male"));
        car1.addPassenger(new Person("Janet", 24, "female"));

        car1.addPassenger(new Person("Collins", 19, "male"));
        car1.addPassenger(new Person("Marie", 50, "female"));

        car1.addPassenger(new Person("Gaspard", 24, "male"));

        car1.setDriver(new Person("Mushagalussa", 20, "male"));

        car1.isEmpty();
        car1.isFull();
        System.out.println("The car has " + car1.getNumOccupant() + " occupants.");
        car1.hasPassengers();
        car1.getNumOccupant();

        // car1.listRiders();
        car1.listRiders();

        // System.out.println("The state of the car is as follows: " + car1);

        // System.out.println("The state of the car is as follows: " + car1);

    }

}