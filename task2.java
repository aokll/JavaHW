//2) Вывести все простые числа от 1 до 1000
import java.util.ArrayList;
//import java.util.Scanner;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        System.out.print(getPrimes(168));
        }
    public static List<Integer> getPrimes (int count){
            List<Integer> primes = new ArrayList<>();
            if (count > 0){
                primes.add(2);
                for (int i = 3; primes.size() < count; i=i+2) {
                    if(isPrime(i, primes)){
                        primes.add(i);
                    }
                }
            }
        return primes;
    }
    private static boolean isPrime(int number, List<Integer> primes){
            double sqrt = Math.sqrt(number);
            for (Integer n : primes) {
                if(n > sqrt){
                    return true;
                }
                if(number%n == 0){
                    return false;
                }
            }
            return true;
    }    
}
