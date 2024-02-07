import java.util.*;
class averagelarge{
    int average(int[] arr){
        int sum = 0;
        for (int i =0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        int average = sum / arr.length;
        return average;
    }
    int largest(int[] arr){
        int largest = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        averagelarge al = new averagelarge();
        int average = al.average(arr);
        int largest = al.largest(arr);
        System.out.println("Average of the elements: "+average);
        System.out.println("Largest of the elements: "+largest);
    }
}