import java.util.*;

class student {
    int rollno;
    String name;
    int[] marks;

    void students() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        this.rollno = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Enter the name: ");
        this.name = sc.nextLine();
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        this.marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of subject " + (i + 1) + ": ");
            this.marks[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("Roll number: " + rollno);
        System.out.println("Name: " + name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of subject " + (i + 1) + ": " + marks[i]);
        }
    }

    public static void main(String args[]) {
        student s = new student();
        s.students();
        s.display();
    }
}
