import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        System.out.println(principle*rate*time/100);
    }
}
