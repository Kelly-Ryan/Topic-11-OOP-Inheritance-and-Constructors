public class Adult extends Human {

    private String ppsNo;
    private String occupation;
    private boolean isMarried;
    private boolean isCarOwner;

    public void setPpsNo(String ppsNo){

        this.ppsNo = ppsNo;

    }

    public void setOccupation(String occupation) {

        this.occupation = occupation;

    }

    public void setIsMarried(boolean isMarried) {

        this.isMarried = isMarried;

    }

    public void setIsCarOwner(boolean isCarOwner) {

        this.isCarOwner = isCarOwner;

    }

    public String getPpsNo() {

        return ppsNo;

    }

    public String getOccupation() {

        return occupation;

    }

    public boolean getIsMarried() {

        return isMarried;

    }

    public boolean getIsCarOwner() {

        return isCarOwner;

    }

    public String drive() {

        return "Driving a car safely...";

    }

    public String procreate(){

        return "Procreating...";

    }

    public String toString() {

        return super.toString() + "PPS No: " + getPpsNo() + "\n" + "Occupation: " + getOccupation() + "\n" +
                "Marriage Status: " + getIsMarried() + "\n" + "Car Owner: " + getIsCarOwner() + "\n";

    }

}
