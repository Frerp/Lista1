import java.util.Scanner;

public class Variaveis5 {
    public static void main(String[] args){
        Scanner qtd_max = new Scanner(System.in);
        Scanner qtd_min = new Scanner(System.in);
        System.out.print("Digite a quantidade máxima: ");
        int quantidade_max = qtd_max.nextInt();
        System.out.print("Digite a quantidade mínima: ");
        int quantidade_min = qtd_min.nextInt();
        double media = (quantidade_max + quantidade_min)/2;
        System.out.println("Quantidade média: " + media);
        qtd_max.close();
        qtd_min.close();
    }
}
