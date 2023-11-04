class bikee {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike splendar = new Splendar();

        bike.run();      // Calls the run() method of Bike
        splendar.run();  // Calls the run() method of Splendar (Runtime Polymorphism)
    }
}
class Bike {
    int speedlimit = 80;

    void run() {
        System.out.println("Bike's speed limit is " + speedlimit + " km/h");
    }
}

class Splendar extends Bike {
    int speedlimit = 100;

    @Override
    void run() {
        System.out.println("Splendar's speed limit is " + speedlimit + " km/h");
    }
}


