public class Vehicle {

    private String manufacturer;
    private float engineSize;
    private String registrationNo;
    private boolean NCT;

    public Vehicle(String manufacturer, float engineSize, String registrationNo, boolean NCT) {

        this.manufacturer = manufacturer;
        this.engineSize = engineSize;
        this.registrationNo = registrationNo;
        this.NCT = NCT;
    }

    public Vehicle(String manufacturer, float engineSize, String registrationNo) {

        this(manufacturer, engineSize, registrationNo, false);
    }

    public Vehicle(String manufacturer, float engineSize) {

        this(manufacturer, engineSize, "Not specified", false);
    }

    public Vehicle(String manufacturer) {

        this(manufacturer, 0f,"Not specified", false);
    }

    public Vehicle() {

        this("Not specified", 0f, "Not specified", false);
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public void setEngineSize(float engineSize) {

        this.engineSize = engineSize;
    }

    public void setRegNumber(String registrationNo) {

        this.registrationNo = registrationNo;
    }

    public void setNCT(boolean NCT) {

        this.NCT = NCT;
    }

    public String getManufacturer() {

        return manufacturer;
    }

    public float getEngineSize() {

        return engineSize;
    }

    public String getRegNumber() {

        return registrationNo;
    }

    public boolean getNCT() {

        return NCT;
    }

    public String accelerate() {

        return "Accelerating...";
    }

    public String brake() {

        return "Vehicle braking...";
    }

    public String toString() {

        return "Manufacturer=" + getManufacturer() + "," + "\n" + "EngineSize=" + getEngineSize() + "," + "\n" + "RegistrationNo="
                + getRegNumber() + "," + "\n" + "NCT=" + getNCT() + "\n";

    }
}
