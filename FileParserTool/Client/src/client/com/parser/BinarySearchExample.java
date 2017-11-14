package client.com.parser;

public class BinarySearchExample {
    /*
     * Binary search takes a sorted array and divide this array into two halves 
     * if the number we want to search for is in the middle , then it returns the mid as the index 
     * if the number we want to search for is smaller that the mid , then we move the end cursor to the mid-1
     * if the number we want to search for is greater than the mis , then we move the start to the mid+1
     * and we keep dividing the sub arrays into halves till the number we are searching for is in the mid position
     * this algorithm take complexity O(log n)
     * */
    public int searchForNumber(int arr [] , int length , int number){
        int start = 0;
        int end = length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == number){
                return mid;
                }
            else if(number < arr[mid]){
                end = mid-1;
                }
            else if(number > arr[mid]){
                start = mid+1;
                }
            }
        return -1 ;
        }
    public static void main(String[] args) {
        BinarySearchExample binarySearchExample = new BinarySearchExample();
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
      System.out.println(  binarySearchExample.searchForNumber(arr, arr.length, 8));
    }
}
