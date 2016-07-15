import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("introduce un numero del 1 al 10");
            num = sc.nextInt();
        } while (!(0 <= num && num <= 10));
        System.out.println("la tabla del " + num + ": ");

    for (int i=1; i<=10; i++)
    {
        System.out.println(num+" x " +i +" = " +(num*i));
    }
}
}
