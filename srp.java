import java.util.*;
class srp{
    int sumn(int num){
        int sum = 0;
        for(int i = 0;i<num;i++){
            sum = sum + i;
        }
        return sum;
    }
    int reverse(int num){
        int rev = 0;
        int n;
        while(num>0){
            n = num%10;
            rev = rev*10 + n;
            num = num/10;
        }
        return rev;
    }
    int prime(int num){
        int flag = 0;
        for (int i =2; i<num/2;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if (flag==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numeber: ");
        int num = sc.nextInt();
        srp s = new srp();
        int sum = s.sumn(num);
        int rev = s.reverse(num);
        int prime = s.prime(num);
        System.out.println("Sum of the numbers: "+sum);
        System.out.println("Reverse of the number: "+rev);
        if(prime==1){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}