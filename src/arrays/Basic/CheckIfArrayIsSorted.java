package arrays.Basic;


public class CheckIfArrayIsSorted {
/*
 * https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957
 */
	public static void main(String[] args) {

	}
	
	public static int isSorted(int n, int []a) {
        // Write your code here


       int start=0;
       int cursor=1;

       while(cursor<=a.length-1){
           
           if(a[start]> a[cursor]){
               return 0;
           }
           else{
               start++;
               cursor++;
           }

       }
       return 1; 
    
    }

}
