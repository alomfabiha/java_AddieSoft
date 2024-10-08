package thread_1;

//Thread class representing a person trying to withdraw money
class Person extends Thread {
 private Bank bank; // Reference to the bank
 private String name; // Name of the person
 private int amount; // Amount to withdraw

 // Constructor to initialize the thread with bank reference, name, and amount
 public Person(Bank bank, String name, int amount) {
     this.bank = bank;
     this.name = name;
     this.amount = amount;
 }

 // Run method executed when the thread starts
 public void run() {
     bank.withdraw(name, amount); // Call the withdraw method
 }


}
