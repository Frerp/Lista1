import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i = 1; i <= 20; i++){
            System.out.print("Digite um inteiro: ");
            int num = scan.nextInt();
            if(num >= 8){
                System.out.println(num + " é maior que 20");
            }
        }
        scan.close();
    }
}
