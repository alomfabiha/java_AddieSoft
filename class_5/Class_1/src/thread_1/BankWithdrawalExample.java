package thread_1;

public class BankWithdrawalExample {

	public static void main(String[] args) {
		Bank bank = new Bank(50000); 

        // Creating three threads for three people
        Person person1 = new Person(bank, "Fabiha", 30000); 
        Person person2 = new Person(bank, "Momo", 20000);   
        Person person3 = new Person(bank, "Meem", 10000); 

        // Starting the threads
        person1.start();
        person2.start();
        person3.start();
        
     // Optionally, wait for all threads to finish (not strictly necessary in this example)
        try {
            person1.join();
            person2.join();
            person3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All withdrawal attempts complete.");
	}

}
