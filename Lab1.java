import java.util.Scanner;

//my student's book #1317
public class Lab1 {
    public static void main(String[] args) {
        short C = 0;
        short i, j, a, n, b, m;

        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter record book number: ");
            short bookNumber = scan.nextShort();
            double S = 0;
            System.out.print("Result: \n" + "C2: " + bookNumber % 2 + "\n" + "C3: " + bookNumber % 3 + "\n" + "C5: " + bookNumber % 5 + "\n" + "C7: " + bookNumber % 7 + "\n");

            do {
                System.out.print("a: ");
                a = scan.nextShort();
                System.out.print("n: ");
                n = scan.nextShort();
                if (n <= a) System.out.println("Invalid input. n must bet greater the a.");
                if (a <= 0 && n >= 0) System.out.println("ERROR. Upcoming division by zero. a and n must be greater than 0.");
            } while (a <= 0 && n >= 0 || n <= a);

            do {
                System.out.print("b: ");
                b = scan.nextShort();
                System.out.print("m: ");
                m = scan.nextShort();
                if (m <= b) System.out.println("Invalid input. m must bet greater the b.");
                if (b <= 0 && m >= 0) System.out.println("ERROR. Upcoming division by zero. b and m must be greater than 0.");
            } while (b <= 0 && m >= 0 || m <= b);

            for (i = a; i <= n; i++) {
                for (j = b; j <= m; j++) {
                    S += ((float) i % j) / (i - C);
                }
            }
            System.out.println("S = " + S);
        } catch (Exception e) {
            System.out.println("ERROR. Invalid input type.");
        }
    }
}