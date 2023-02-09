import java.util.Arrays;
import java.util.Scanner;

public class Question_8 {

    public static void main(String[] args) {
           	Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++)
		{
			arr[i] = s.nextInt();
		    
		}

        int len = arr.length;

        for(int i=0;i<len-1;i++) {

            for(int j=i+1;j<len;j++) {

                if(arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("Insertion sort array: ");
        for(int i=0;i<len;i++) {
            System.out.print(arr[i]+ " ");
        }

    }

}

