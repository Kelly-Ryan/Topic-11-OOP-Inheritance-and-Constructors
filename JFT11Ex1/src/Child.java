public class Child extends Human{

    private String schoolCardNo = "N/A";

    public void setSchoolCardNo(String schoolCardNo) {

        this.schoolCardNo = schoolCardNo;

    }

    public String getSchoolCardNo() {

        return schoolCardNo;

    }

    public String swim() {

        if(super.getAge() > 5) {

            return "As the child is 5 years old or younger, armbands must be worn and parental supervision is required." + super.swim();

        } else {

            return super.swim();
        }

    }

    public String toString() {

        return super.toString() + "School Card No: " + getSchoolCardNo() + "\n";

    }

}
