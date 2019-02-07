public class Human {

    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age){

        this.age = age;

    }

    public void setGender(String gender) {

        this.gender = gender;

    }

    public void setHeight(float height) {

        this.height = height;

    }

    public void setWeight(float weight) {

        this.weight = weight;

    }

    public String getName(){

        return name;

    }

    public int getAge() {

        return age;
    }

    public String getGender() {

        return gender;

    }

    public float getHeight() {

        return height;

    }

    public float getWeight() {

        return weight;

    }

    public String sleep() {

        return "Sleeping soundly...";

    }

    public String eat() {

        return "Eating slowly and chewing carefully...";

    }

    public String swim() {

        return "Arms rotating and pushing body forward...";

    }

    public String toString() {

       return "Name: " + getName() + "\n" + "Age: " + getAge() + "\n" + "Gender: " + getGender() + "\n" + "Height: " +
               getHeight() + "\n" + "Weight: " + getWeight() + "\n" ;

    }

}
