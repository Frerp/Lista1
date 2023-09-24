import java.util.Scanner;

public class Variaveis7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println("Temperatura em fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em celsius: " + celsius);
        scan.close();
    }
}
