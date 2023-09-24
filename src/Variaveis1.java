import java.util.Scanner;

public class Variaveis1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos ler sua idade em anos meses e dias...");
        System.out.print("Anos: ");
        Scanner sc1 = new Scanner(System.in);
        int anos = sc1.nextInt();
        sc1.close();
        System.out.print("Meses: ");
        Scanner sc2 = new Scanner(System.in);
        int meses = sc2.nextInt();
        sc2.close();
        System.out.print("Dias: ");
        Scanner sc3 = new Scanner(System.in);
        int dias = sc3.nextInt();
        sc3.close();
        int total_dias = anos * 365 + meses * 30 + dias;
        System.out.println("Total de dias: " + total_dias);
    }
}
