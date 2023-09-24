import java.util.Scanner;

public class Repeticao1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um inteiro: ");
        int num = scan.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + "." + i + " = " + num*i);
        }
        scan.close();
    }
}
