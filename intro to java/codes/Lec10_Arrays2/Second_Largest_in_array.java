package Lec10_Arrays2;

import java.util.Scanner;

public class Second_Largest_in_array {
	public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int max2=Integer.MIN_VALUE;
        int n=arr.length;
        if(n>0){
            int max1=arr[0]; 
            for(int i=1;i<arr.length;i++){
                    if(arr[i]>max1){
                        max2=max1;
                        max1=arr[i];
                    }
                    else if(arr[i]<max1 && arr[i]>max2){
                        max2=arr[i];
                    }
                
            }
        }
        return max2;
    }
	static Scanner s=new Scanner(System.in);
    public static int[] takeInput(){	//Function for taking input
        int size = s.nextInt();
        int[] input = new int[size];
        if (size == 0) {
            return input;
        }
        for (int i = 0; i < size; ++i) {
            input[i] = s.nextInt();
        }
        return input;
    }

    public static void main(String[] args){	//Main Function
    	int t = s.nextInt();
        while(t > 0) {
            int[] input = takeInput();
            System.out.println(secondLargestElement(input));
            t -= 1;
        }
    }
}
