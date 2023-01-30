import java.util.Scanner;
public class Main {

    static class Operation {


        private static void add(int a, int b) {

            System.out.println("The addition is: " + (a + b));
        }

        private static void subtract(int a, int b) {

            System.out.println("The subtraction is: " + (a - b));
        }

        private static void multiply(int a, int b) {

            System.out.println("The multiplication is: " + (a * b));
        }

        private static void divide(int a, int b) {

            System.out.println("The division is: " + (a / b));
        }

        public static void display(int choice, int a, int b) {


            switch (choice) {
                case 1:
                    add(a, b);
                case 2:
                    subtract(a, b);
                case 3:
                    multiply(a, b);
                case 4:
                    divide(a, b);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the operation to be performed ");
        System.out.print("The operations are \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("Enter the numbers you want to perform operations on (2 numbers): ");
        int a = sc.nextInt() ;
        int b = sc.nextInt();

        Operation.display(choice,a,b);

    }
    }
