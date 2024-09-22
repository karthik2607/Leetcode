public class PrimeFactor {  
    // Method to find and print prime factors  
    public static void findPrimeFactors(int num) {  
        // Step 1: Handle factors of 2  
        while (num % 2 == 0) {  
            System.out.print(2 + " "); // Print 2 as a prime factor  
            num /= 2; // Divide num by 2  
        }  
        // Step 2: Check for odd prime factors up to square root of num  
        for (int i = 3; i <= Math.sqrt(num); i += 2) {  
            while (num % i == 0) {  
                System.out.print(i + " "); // Print i as a prime factor  
                num /= i; // Divide num by i  
            }  
        }  
        // Step 3: If num is greater than 2, it's also a prime factor  
        if (num > 2) {  
            System.out.print(num);  
        }  
    }  
    public static void main(String[] args) {  
        int num = 56; // Define the number to find prime factors  
        System.out.print("Prime factors of " + num + " are: ");  
        findPrimeFactors(num); // Call the method to find and print prime factors  
    }  
}  
