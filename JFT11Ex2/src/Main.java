/*
Kelly Ryan
5 February 2019

Exercise 2

Create a Java program to model the class relationships as depicted above.

The Vehicle class should have the following instance variables (private scope):

 Manufacturer (String)
 Engine Size (float)
 Registration Number (String)
 NCT (boolean)
Setter and Getter methods should be created.
The Vehicle class should contain the following constructors.

public Vehicle(String manufacturer, float engineSize, String registrationNo, boolean NCT)
public Vehicle(String manufacturer, float engineSize, String registrationNo)
public Vehicle(String manufacturer, float engineSize)
public Vehicle(String manufacturer)
public Vehicle()

The Vehicle class should also contain the following instance methods:

 accelerate(): to return a String, "Accelerating….".
 brake(): to return a String, "Vehicle braking…".

The Car class does not have any unique instance variables of its own.
You will need to create the following constructors however.

public Car(String manufacturer, float engineSize, String registrationNo, boolean NCT)
public Car(String manufacturer, float engineSize, String registrationNo)
public Car(String manufacturer, float engineSize)
public Car(String manufacturer)
public Car()

We would like to keep track of the number of Car objects created from the Car class. Include the appropriate functionality within the Car class to achieve this.
The Car class should override the brake() method and return the String, "Car braking".
The Truck class should extend the Vehicle class and include an instance variable named isTrailer (a boolean – private scope). This variable determines whether the Truck has a trailer.
Include a setter and getter method for this variable.
Include the following constructors in the Truck class.

public Truck(String manufacturer, float engineSize, String registrationNo, boolean NCT)
public Truck(String manufacturer, float engineSize, String registrationNo)
public Truck(String manufacturer, float engineSize)
public Truck(String manufacturer)
public Truck()

Override the brake() method in the Truck class to return the following String, "Truck braking…".
Include a toString() method in the Truck class which:
 Calls the superclass version of toString().
 Includes the state of the boolean variable (isTrailer).

Create a folder named JFT11Ex2 with the following classes.
o Vehicle
o Car
o Truck
o Main

 In the Main class, create the following objects.

1: Car Object (use the four argument constructor)
 Call the following methods:
o toString()
o brake()
o accelerate()

2: Car Object (Use the no-arg constructor and the setter and getter methods)
 Call the following methods:
o toString()
o brake()
o accelerate()

3: Output to the console the number of Car objects produced.

4: Truck Object (use the one argument constructor)
 Call the following methods:
o toString()
o brake()
o accelerate()

5: Truck Object (Use the no-arg constructor and the setter and getter methods)
 Call the following methods:
o toString()
o brake()
o accelerate()
 */

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car("Subaru Hatchback", 53.45f, "89C4545", true);

        Car c2 = new Car();
        c2.setManufacturer("Toyota Carola");
        c2.setEngineSize(45.44f);
        c2.setRegNumber("90C4343");
        c2.setNCT(true);

        Truck t1 = new Truck("Ford Transit");

        Truck t2 = new Truck();
        t2.setManufacturer("Hyundai Pick-Up");
        t2.setEngineSize(89.45f);
        t2.setRegNumber("99C5344");
        t2.setNCT(true);
        t2.setTrailer(false);


        System.out.println(c1.toString() + c1.brake() + "\n" + c1.accelerate() + "\n");
        System.out.println(c2.toString() + c2.brake() + "\n" + c2.accelerate() + "\n");
        System.out.println(Car.getCarCount() + " cars have been produced." + "\n");
        System.out.println(t1.toString() + t1.brake() + "\n" + t1.accelerate() + "\n");
        System.out.println(t2.toString() + t2.brake() + "\n" + t2.accelerate() + "\n");

    }
}
