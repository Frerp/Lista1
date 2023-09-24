import java.util.Scanner;

public class Variaveis4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        int num = scan.nextInt();
        int ant = num - 1;
        int suc = num + 1;
        System.out.println("Número: " + num);
        System.out.println("Antecessor: " + ant);
        System.out.println("Sucessor: " + suc);
        scan.close();
    }
}
