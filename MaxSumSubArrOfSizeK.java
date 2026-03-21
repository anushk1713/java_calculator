import java.util.Scanner;

public class MaxSumSubArrOfSizeK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //accepting n
        System.out.println("Enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //array values 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //k value for subarray
        System.out.println("Enter k");
        int k =sc.nextInt();
        int Sum_of_k = 0;
        //sum of sub array
        for(int i=0;i<k;i++){
            Sum_of_k = Sum_of_k + arr[i];
        }
        //maximum sum
        int max_sum = Sum_of_k;
        //removing and adding the elements for slide window
        for(int i=k;i<n;i++){
            Sum_of_k = Sum_of_k - arr[i-k]+arr[i];//slide window
            //Sum_of_k > max_sum condition check
            if(Sum_of_k > max_sum){
                //assigning sum_of_k to max_sum
                max_sum = Sum_of_k;
            }
        }
        //print the max_sum
        System.out.println(max_sum);
    }
}
