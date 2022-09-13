import java.util.*;
public class SPrime {

    public boolean checkPrime(int number) {
        if (number <= 1) {  
            return false;  
        }  
        for (int i = 2; i <= Math.sqrt(number); i++) {  
            if (number % i == 0) {  
                return false;  
            }  
        }  
        return true; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SPrime p1 = new SPrime();
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = n; i > n/2; i--) {
            if(p1.checkPrime(i)) {
                count++;
            }
        }
        System.out.println("SPrime: " + count);
        sc.close();
    }
}
