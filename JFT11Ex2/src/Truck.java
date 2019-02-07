public class Truck extends Vehicle{

    private boolean isTrailer;

    public void setTrailer(boolean isTrailer) {

        this.isTrailer = isTrailer;
    }

    public boolean getTrailer() {

        return isTrailer;
    }

    public Truck(String manufacturer, float engineSize, String registrationNo, boolean NCT) {

        super(manufacturer, engineSize, registrationNo, NCT);
    }

    public Truck(String manufacturer, float engineSize, String registrationNo) {

        super(manufacturer, engineSize, registrationNo);
    }

    public Truck(String manufacturer, float engineSize) {

        super(manufacturer,engineSize);
    }

    public Truck(String manufacturer) {

        super(manufacturer);
    }

    public Truck() {

        super();
    }

    public String brake() {

        return "Truck braking...";
    }

    public String toString() {

        return super.toString() + "Has Trailer? " + getTrailer() + "\n";
    }

}
