import java.util.Scanner;

public class Condicionais2 {
    public static void main(String[] args){
        System.out.println("Monte sua refeição...");
        // Cardápio de pratos
        System.out.println("\nPrato");
        System.out.println("Vegetariano [1]");
        System.out.println("Peixe [2]");
        System.out.println("Frango [3]");
        System.out.println("Carne [4]");
        System.out.print("Sua escolha: ");
        Scanner scan_prato = new Scanner(System.in);
        int int_prato = scan_prato.nextInt();
        int calorias_prato = 0;
        String prato = "";
        if (int_prato == 1){
            prato = "Vegetariano";
            calorias_prato = 180;
        }else if(int_prato == 2){
            prato = "Peixe";
            calorias_prato = 230;
        }else if(int_prato == 3){
            prato = "Frango";
            calorias_prato = 250;
        }else if(int_prato == 4){
            prato = "Carne";
            calorias_prato = 350;
        }else{
            System.out.println("Entrada inválida");
        }

        // Cardápio de sobremesa
        System.out.println("\nSobremesa");
        System.out.println("Abacaxi [1]");
        System.out.println("Sorvete diet [2]");
        System.out.println("Mousse diet [3]");
        System.out.println("Mousse chocolate [4]");
        System.out.print("Sua escolha: ");
        Scanner scan_sobremesa = new Scanner(System.in);
        int int_sobremesa = scan_sobremesa.nextInt();
        int calorias_sobremesa = 0;
        String sobremesa = "";
        if(int_sobremesa == 1){
            sobremesa = "Abacaxi";
            calorias_sobremesa = 75;
        }else if(int_sobremesa == 2){
            sobremesa = "Sorvete diet";
            calorias_sobremesa = 110;
        }else if(int_sobremesa == 3){
            sobremesa = "Mousse diet";
            calorias_sobremesa = 170;
        }else if(int_sobremesa == 4){
            sobremesa = "Mousse chocolate";
            calorias_sobremesa = 200;
        }else{
            System.out.println("Entrada inválida");
        }

        // Cardápio de bebida
        System.out.println("\nBebida");
        System.out.println("Chá [1]");
        System.out.println("Suco de laranja [2]");
        System.out.println("Suco de melão [3]");
        System.out.println("Refrigerante diet [4]");
        System.out.print("Sua escolha: ");
        Scanner scan_bebida = new Scanner(System.in);
        int int_bebida = scan_bebida.nextInt();
        int calorias_bebida = 0;
        String bebida = "";
        if (int_bebida == 1){
            bebida = "Chá";
            calorias_bebida = 20;
        }else if(int_bebida == 2){
            bebida = "Suco de laranja";
            calorias_bebida = 70;
        }else if(int_bebida == 3){
            bebida = "Suco de melão";
            calorias_bebida = 100;
        }else if(int_bebida == 4){
            bebida = "Refrigerante diet";
            calorias_bebida = 65;
        }else{
            System.out.println("Entrada inválida");
        }

        // Exibindo refeiçao e calorias
        int calorias_totais = calorias_prato + calorias_sobremesa + calorias_bebida;
        System.out.println("\nPrato: " + prato);
        System.out.println("Sobremesa: " + sobremesa);
        System.out.println("Bebida: " + bebida);
        System.out.println("Calorias totais: " + calorias_totais);
        scan_prato.close();
        scan_sobremesa.close();
        scan_bebida.close();
    }
}
