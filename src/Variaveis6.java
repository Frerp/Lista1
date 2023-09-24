import java.util.Scanner;

public class Variaveis6 {
    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        int num1 = scan1.nextInt();
        System.out.print("Digite outro inteiro: ");
        int num2 = scan2.nextInt();
        System.out.println(num1 + " = " + num2);
        System.out.println(num1 + " != " + num2);
        System.out.println(num1 + " >= " + num2);
        System.out.println(num1 + " > " + num2);
        System.out.println(num1 + " <= " + num2);
        System.out.println(num1 + " < " + num2);
        scan1.close();
        scan2.close();
    }
}
