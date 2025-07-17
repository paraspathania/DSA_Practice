package Arrays;
import java.util.Scanner;

public class Linearsearch {

    
     int linear(int arr[], int s, int t){
        for(int i = 0; i<s;i++){
            if(arr[i]==t){
                System.out.println("Element found at index: " + i);
                return i; 
            }
        }
        return -1; // Element not found
    }
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = d.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i = 0; i<n; i++){
            arr[i] = d.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target = d.nextInt();

        Linearsearch ls = new Linearsearch();
        int result =ls.linear(arr, n, target);
        System.out.println("Retruned index: " + result);
        d.close();
    }
}
