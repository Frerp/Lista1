import java.util.Scanner;

public class Variaveis3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Seu salário: ");
        double salar = scan.nextDouble();
        int salar_min = 1320;
        int quan_sal = (int)salar/salar_min;  
        System.out.println("Quantidade salarios mínimos: " + quan_sal);
        scan.close();
    }
}
