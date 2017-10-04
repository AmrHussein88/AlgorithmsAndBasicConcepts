package Alghorithms;
/*
The recursion has a base case—we always include a conditional statement as the ?rst statement in the program that has a return
*/
public class Recursion {
    //This method prints number decending by decreasing the entered number by 1 
    static int countDownTheEnteredNumber(int number) {
        if (number == 0) {
            System.out.println( "Number now is : " + number);

            return 0;
        } else
            System.out.println("Number now is : " +number);

        return countDownTheEnteredNumber(number-1);

    }
    //This method prints the factorial of a number

    static int factorialOfANumber (int number){
        if(number==1)
        return 1;
        
        return number*factorialOfANumber(number-1);
        
        }
    //This method prints Fibonacci Series according to number of iterations we enter
   static int number1 = 0 ,  number2 = 1, fiboSum = 0;
    static void fibonacciSeries(int counter){
        if(counter > 0){
                fiboSum = number1 + number2 ;
                number1 = number2 ;
                number2 = fiboSum ;
                System.out.println("Fibonacci Series is  : " +fiboSum);
                fibonacciSeries(counter-1);

            }
        
        }

    public static void main(String[] args) {
        countDownTheEnteredNumber(10);
        System.out.println("Factorial number is : " +factorialOfANumber(6));
        fibonacciSeries(8);
        
    }
}
