public class Car extends Vehicle{

    static int carCount;

    public Car(String manufacturer, float engineSize, String registrationNo, boolean NCT) {

        super(manufacturer, engineSize, registrationNo, NCT);
        carCount++;
    }

    public Car(String manufacturer, float engineSize, String registrationNo) {

        super(manufacturer,engineSize,registrationNo);
        carCount++;
    }

    public Car(String manufacturer, float engineSize) {

        super(manufacturer, engineSize);
        carCount++;
    }

    public Car(String manufacturer) {

        super(manufacturer);
        carCount++;
    }

    public Car() {

        super();
        carCount++;
    }

    public String brake() {

        return "Car braking.";
    }

    public static int getCarCount() {

        return carCount;
    }

}
