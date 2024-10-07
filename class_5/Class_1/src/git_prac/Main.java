package git_prac;

//Interface definition
interface Animal {
 void sound(); // Abstract method to be implemented by subclasses
}

//Superclass definition
class Mammal {
 // Instance variable for the superclass
 private String name;

 // Constructor for the superclass
 public Mammal(String name) {
     this.name = name;
 }

 // Method in the superclass
 public String getName() {
     return name;
 }
}

//Subclass definition that extends the Mammal class and implements the Animal interface
class Dog extends Mammal implements Animal {
 // Constructor for the subclass
 public Dog(String name) {
     // Call the constructor of the superclass
     super(name);
 }

 // Implementation of the sound method from the Animal interface
 @Override
 public void sound() {
     System.out.println(getName() + " says: Woof!");
 }

 // Additional method specific to Dog
 public void fetch() {
     System.out.println(getName() + " is fetching the ball.");
 }
}

//Main class to demonstrate the functionality
public class Main {
 public static void main(String[] args) {
     // Create an instance of Dog
     Dog myDog = new Dog("Buddy");

     // Call methods from the Dog class
     myDog.sound(); // Calls the sound method implemented from the Animal interface
     myDog.fetch(); // Calls the fetch method specific to Dog
 }
}


