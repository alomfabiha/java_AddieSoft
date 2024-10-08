package thread_1;

//Bank class to manage account balance
class Bank {
 private int totalAmount; // Total money in the bank

 // Constructor to initialize the bank with a specific amount
 public Bank(int amount) {
     this.totalAmount = amount;
 }

 // Synchronized method to handle withdrawals
 public synchronized void withdraw(String name, int amount) {
     System.out.println(name + " is trying to withdraw " + amount + " Taka.");
     
     // Check if there are enough funds
     if (totalAmount >= amount) {
         // Simulating withdrawal processing time
         try {
             Thread.sleep(500); // Sleep to mimic time taken for withdrawal
         } catch (InterruptedException e) {
             System.out.println("Withdrawal interrupted.");
         }

         totalAmount -= amount; // Deduct the amount from total
         System.out.println(name + " successfully withdrew " + amount + " Taka.");
         System.out.println("Remaining balance: " + totalAmount + " Taka.");
     } else {
         System.out.println(name + " cannot withdraw " + amount + " Taka. Not enough funds.");
     }
 }
}

