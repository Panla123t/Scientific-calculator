import java.util.Scanner;
import java.lang.Math;
public class Scientificcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
        int x = sc.nextInt();
        if (x == 1) {
            mean();
            menu();
        } else if (x == 2) {
            fibonacci();
            menu();
        } else if (x == 3) {
            log();
            menu();
        } else if (x == 4) {
            Cnr();
            menu();
        } else if (x == 5) {
            Pnr();
            menu();
        } else if (x == 6) {
            Stdevpop();
            menu();
        } else if (x == 7) {
            Stdevex();
            menu();
        } 

    }
    public static void menu() {
        System.out.println("-----------------------");
        System.out.println("-Scientific calculator-");
        System.out.println("1.) Mean ");
        System.out.println("2.) Fibonacci ");
        System.out.println("3.) Logarithm ");
        System.out.println("4.) Cnr ");
        System.out.println("5.) Pnr ");
        System.out.println("6.) Logarithm ");
        System.out.println("7.) Stdev (population) ");
        System.out.println("7.) Stdev (example) ");
        System.out.println("8.) Exit ");
        System.out.println("Choose the function : ");
    }
    public static void mean() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers? : ");
        int count = sc.nextInt();
        int n = count;
        float sum = 0;
        int i = 0;
        int j = 1;
        while (i != count) {
            System.out.println("Enter number " + j + ":");
            float x = sc.nextInt();
            sum += x;
            i += 1;
            j += 1;
        }
        System.out.println("Mean = " + (sum / n));
    }

    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which position would you like to know? :");
        int n = sc.nextInt();
        int[] main = new int[n + 2];
        main[0] = 0;
        main[1] = 1;
        for (int i = 2; i < n; i++) {
            main[i] = main[i - 1] + main[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(main[i] + " ");
        }
    }

    public static void log() {
        Scanner sc = new Scanner(System.in);
        System.out.println("log (1/base) N");
        System.out.print("base : ");
        int base = sc.nextInt();
        System.out.print("N : ");
        double N = sc.nextDouble();
        double log = (Math.log(N)) / (Math.log(base));
        System.out.print("log = " + log);
    }

    public static void Cnr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("r : ");
        int r = sc.nextInt();
        int cnr;
        int nfac = 1;
        int nminr = n - r;
        int rfac = 1;
        int nminrfac = 1;
        for (int i = 1; i < n + 1; i++) {
            nfac *= i;
        }
        for (int i = 1; i < r + 1; i++) {
            rfac *= i;
        }
        for (int i = 1; i < nminr + 1; i++) {
            nminrfac *= i;
        }
        cnr = ((nfac) / (rfac * (nminrfac)));
        System.out.println("Cnr = " + cnr);
    }

    public static void Pnr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        System.out.print("r : ");
        int r = sc.nextInt();
        int pnr;
        int nfac = 1;
        int nminr = n - r;
        int nminrfac = 1;
        for (int i = 1; i < n + 1; i++) {
            nfac *= i;
        }
        for (int i = 1; i < nminr + 1; i++) {
            nminrfac *= i;
        }
        pnr = ((nfac) / (nminrfac));
        System.out.println("Pnr = " + pnr);
    }

    public static void Stdevpop() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? : ");
        int n = sc.nextInt();
        int x;
        float summean = 0;
        double sum = 0;
        float mean;
        int[] main = new int[n];
        for (int i = 0; i < main.length; i++) {
            System.out.print("Input index " + i + " : ");
            x = sc.nextInt();
            main[i] = x;
            summean += x;
        }
        mean = (summean / n);
        for (int i = 0; i < main.length; i++) {
            sum += Math.pow(((main[i]) - (mean)), 2);
        }
        sum /= (n - 1);
        sum = Math.sqrt(sum);
        System.out.print("Stdev = " + sum);
    }

    public static void Stdevex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? : ");
        int n = sc.nextInt();
        int x;
        float summean = 0;
        double sum = 0;
        float mean;
        int[] main = new int[n];
        for (int i = 0; i < main.length; i++) {
            System.out.print("Input index " + i + " : ");
            x = sc.nextInt();
            main[i] = x;
            summean += x;
        }
        mean = (summean / n);
        for (int i = 0; i < main.length; i++) {
            sum += Math.pow(((main[i]) - (mean)), 2);
        }
        sum /= (n);
        sum = Math.sqrt(sum);
        System.out.print("Stdev = " + sum);
    }
}
