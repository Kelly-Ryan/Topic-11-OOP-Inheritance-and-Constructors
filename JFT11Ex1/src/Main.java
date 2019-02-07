/*
Kelly Ryan
5 February 2019

Exercise 1

Create a Java program with a Human super class and Adult, Child and Baby sub classes.

The Human class should have the following instance variables. The scope of the variables should be private.
 name - String
 age - int
 gender - String
 height - float
 weight – float
Include setter and getter methods in the Human class.

The Human class should also contain the following methods or actions:

 sleep() to return a String, "Sleeping soundly….".
 eat() to return a message, "Eating slowly and chewing carefully…".
 swim() to return a message, "Arms rotating and pushing the body forward…".

The Adult class should extend the Human class and in addition add the following instance variables (private scope):

 ppsNo - String
 occupation - String
 isMarried - boolean
 isCarOwner - boolean

Include setter and getter methods in the Adult class.

The Adult class should also contain the following methods:

 drive() to return a message, "Driving a car safely….".
 procreate() to return a message, "Procreating....".

The Child class should also extend the Human class and add the following instance variable (private scope):

 schoolCardNo – String (set default value as N/A)

Include setter and getter methods in the Child class.

A child of 5 years of age or younger will need to wear arm bands and requires parental supervision when swimming.
The swim() method for a child under 5 must return the following message, "As the child is 5 years old or younger,
armbands must be worn and parental supervision is required. Arms rotating and pushing the body forward…".

 For a child older than five years of age, the standard swim functionality as defined in the Human class should be used.
In this regard, call the super class version of swim() by coding super.swim();

Therefore, you are required to override the implementation of the swim() method in the Child class. If a class overrides
a method it overwrites or replaces the functionality of the inherited method (it replaces the inherited method with its
own version of the method). It can still call the inherited version of the method by using the super keyword.

The Baby class should also extend the Human class and add the following instance variable (private scope):

 isTeething - boolean

A baby who is teething does not sleep soundly. Override the sleep() method and return an appropriate message.
A baby cannot swim (safely!). The swim() method must also be overridden to return the following message, "A baby cannot swim safely…".

Create a new folder named JFT11Ex1 and include the following classes.

 Human
 Adult
 Child
 Baby
 Main

In the Main class, which is to hold the main method, create an object from each of the subclasses of Human.

Adult:
Create an Adult object and call its toString(), eat() and drive() methods.

Hint: The Adult class is a subclass of Human. Both classes should have a toString() method included to return the values
of the instance variables declared in the respective classes. In the toString() method of the Adult class, include a call
to the super class’s toString() method by writing super.toString(). You will append the string returned by the super class’s
toString() method to this class’s toString() method.

Child:
Create a Child object and call its toString(), eat() and swim() methods. The child is 3 years old.

Baby:
Create a Baby object and call its toString(), sleep() and swim() methods. The child is 1 year old.

 */

public class Main {

    public static void main (String[] args) {

        Adult a = new Adult();

        a.setName("Billy White");
        a.setAge(30);
        a.setGender("Male");
        a.setHeight(6.5f);
        a.setWeight(11.0f);
        a.setPpsNo("5645614F");
        a.setOccupation("Software Developer");
        a.setIsMarried(true);
        a.setIsCarOwner(true);

        System.out.println (a.toString() + a.eat() + a.drive() + "\n");

        Child c = new Child();

        c.setName("Frank Davis");
        c.setAge(3);
        c.setGender("Male");
        c.setHeight(1.5f);
        c.setWeight(3.0f);

        System.out.println(c.toString()+ c.eat() + "\n" + c.swim() + "\n");

        Baby b = new Baby();

        b.setName("Gillian Taylor");
        b.setAge(1);
        b.setGender("female");
        b.setHeight(0.6f);
        b.setWeight(1.0f);
        b.setIsTeething(true);

        System.out.println(b.toString() + b.sleep() + "\n" + b.swim() + "\n");

    }
}
