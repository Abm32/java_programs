import java.util.Scanner;

class fasu {
    int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    int sumdig(int num) {
        int sum = 0;
        int n;
        while (num > 0) {
            n = num % 10;
            sum = sum + n;
            num = num / 10;
        }
        return sum;
    }
}

class sumpr {
    int sumn(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    int prime(int num) {
        if (num <= 1)
            return 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}

class threeclass {
    int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int average = sum / arr.length;
        return average;
    }

    int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        threeclass al = new threeclass();
        int average = al.average(arr);
        int largest = al.largest(arr);
        System.out.println("Average of the elements: " + average);
        System.out.println("Largest of the elements: " + largest);
        fasu f = new fasu();
        sumpr s = new sumpr();
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int factorial = f.fact(num);
        int sum = f.sumdig(num);
        int sumn = s.sumn(num);
        int prime = s.prime(num);
        System.out.println("Factorial : " + factorial);
        System.out.println("Sum of the digits : " + sum);
        System.out.println("Sum of the numbers: " + sumn);
        if (prime == 1) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
