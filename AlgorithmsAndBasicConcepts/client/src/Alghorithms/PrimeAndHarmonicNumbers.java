package Alghorithms;

public class PrimeAndHarmonicNumbers {
    //Prime numbers
    //A Prime Number can be divided evenly only by 1, or itself. And it must be a whole number greater than 1
    public static boolean isPrime(int n){
        boolean isPrime=false ;
        if(n<2)
            return isPrime;
                for(int i = 2; i*i <=n ; i++){
                    if(n%i==0)
                    return isPrime;
                    }
        return !isPrime;
        }
//Harmonic Numbers
    //Harmonic numbers sum is the sum of for example if we choose the entered value as 5 , will be 1+1/2+1/3+1/4+1/5 , etc
    public static double harmonicNumber(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++)
            sum += 1.0 / i;
        return sum;
    }


    public static void main(String[] args) {
        
        System.out.println("Is it a prime numer ? "+ isPrime(1) );
        System.out.println("Sum of harmonic number is : "+ harmonicNumber(10) );
       





    }
}
