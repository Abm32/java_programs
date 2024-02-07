import java.util.*;
class factsum{
    public int factorial(int num){
        int fact = 1;
        for(int i = 1; i<num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public int sumofdigits(int num){
        int sum = 0;
        int n;
        while(num>0){
            n = num%10;
            sum = sum + n;
            num = num/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = sc.nextInt();
        factsum fs = new factsum();
        int factorial = fs.factorial(num1);
        int sum = fs.sumofdigits(num1);
        System.out.println("Factorial : "+factorial);
        System.out .println("Sum of the digits : "+sum);
    }
}