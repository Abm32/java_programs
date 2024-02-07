import java.util.Scanner;

class fs {
    int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    int sumd(int num) {
        int sum = 0;
        int n;
        while (num > 0) {
            n = num % 10;
            sum += n;
            num = num / 10;
        }
        return sum;
    }
}

class twoclass {
    int sum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    int primen(int num) {
        int flag = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        fs f = new fs();
        twoclass t = new twoclass();
        int sum = t.sum(num);
        int prime = t.primen(num);
        int factorial = f.fact(num);
        int sumd = f.sumd(num);
        System.out.println("Sum of the numbers: " + sum);
        if (prime == 1) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
        System.out.println("Factorial of the number: " + factorial);
        System.out.println("Sum of the digits: " + sumd);
    }
}
