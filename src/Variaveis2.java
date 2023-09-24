//import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class Variaveis2 {
    public static void main(String[] args){
        //Recebendo porcentagem do IPI
        System.out.println();
        Scanner scanner_porc = new Scanner(System.in);
        System.out.print("Porcentagem do IPI (%): ");
        double porcentagem = scanner_porc.nextDouble();
        //System.out.println(porcentagem);

        //Recebendo dados produto 1
        System.out.println();
        Scanner scanner_valor1 = new Scanner(System.in);
        Scanner scanner_quant1 = new Scanner(System.in);
        System.out.print("Valor unidade produto 1 (R$): ");
        Double valor1 = scanner_valor1.nextDouble();
        System.out.print("Quantidade produto 1: ");
        int quant1 = scanner_quant1.nextInt();
        //System.out.println("Valor produto 1: " + valor1);
        //System.out.println("Quantidade produto 1: " + quant1);

        //Recebendo dados produto 2
        System.out.println();
        Scanner scanner_valor2 = new Scanner(System.in);
        Scanner scanner_quant2 = new Scanner(System.in);
        System.out.print("Valor unidade produto 2(R$): ");
        double valor2 = scanner_valor2.nextDouble();
        System.out.print("Quantidade produto 2: ");
        int quant2 = scanner_quant2.nextInt();
        //System.out.println("Valor produto 2: " + valor2);
        //System.out.println("Quantidade produto 2: " + quant2);

        //Exibindo preço total
        System.out.println();
        double preco_total = (valor1 * quant1 + valor2 * quant2) * (porcentagem/100 + 1);
        System.out.println("Preco total sobre os produtos: " + preco_total);

        scanner_porc.close();
        scanner_valor1.close();
        scanner_quant1.close();
        scanner_valor2.close();
        scanner_quant2.close();
    }
}
