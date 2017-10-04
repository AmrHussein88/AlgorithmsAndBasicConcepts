package Alghorithms;

public class ArrayOperations {

    public static void main(String[] args) {

        //Finding the max value in an array
        int[] arrValues = new int[] { 1, 7, 3, 5, 10, 12, 4, 35 ,42};
        double sum = 0.0;
        double average = 0.0;
        int max = arrValues[0];
        for (int value : arrValues) {
            if (max < value) {
                max = value;
            }
            //Computing the average of array values
            sum += value;

        }
        average = sum / arrValues.length;
        System.out.println("Max value in the array is : " + max);
        System.out.println("Sum of values in the array is : " + sum);
        System.out.println("Average of values in the array is : " + average);
        
        
        //Copy the array to another array
        int[] copiedArrValues = new int[arrValues.length];
        for (int i = 0; i < arrValues.length; i++) {

            // for (int i : arrValues){
            copiedArrValues[i] = arrValues[i];
        }
        System.out.println("Copied array is : " + copiedArrValues[7]);
        
        
        //Reversing the elements in the array 
        
        for(int i = 0; i < arrValues.length/2; i++){
            int temp = arrValues[i];
            arrValues[i]=arrValues[arrValues.length-1-i];
                arrValues[arrValues.length-1-i] = temp ;
            }
        System.out.println("first element in the reversed array is : " + arrValues[0] + "And Last element is :" + arrValues[8] + "  and the middle value is :" +arrValues[4]);

    }
}
