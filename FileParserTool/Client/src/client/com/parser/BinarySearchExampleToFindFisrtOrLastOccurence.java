package client.com.parser;

public class BinarySearchExampleToFindFisrtOrLastOccurence {
    /*
     * This algorithm is the same as the binary search algorithm but searching for the first or last occurence
     * of an element if the element repeated in the array
     * Instead of returning the index if the number is equal to the mid , we will adjust start or the end to be mid-1 or mid+1 respectivly
     * 
     * */
    
    public int searchForNumber(int arr [] , int length , int number){
        int start = 0;
        int end = length-1;
        int result = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == number){
                result = mid;
               // end = mid-1;// if we are searching for the first occurence
                start = mid+1 ;// if we are searching for the last occurence
                }
            else if(number < arr[mid]){
                end = mid-1;
                }
            else if(number > arr[mid]){
                start = mid+1;
                }
            }
        return result ;
        }
    public static void main(String[] args) {
        BinarySearchExampleToFindFisrtOrLastOccurence binarySearchExampleToFindFisrtOrLastOccurence =
            new BinarySearchExampleToFindFisrtOrLastOccurence();
        int arr [] = {1,2,3,4,5,6,7,7,9,10};
        System.out.println(  binarySearchExampleToFindFisrtOrLastOccurence.searchForNumber(arr, arr.length, 7));
    }
}
