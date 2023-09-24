import java.util.Scanner;

public class Condicionais1 {
    public static void main(String[] args){
        Scanner scan_peso = new Scanner(System.in);
        Scanner scan_altura = new Scanner(System.in);
        System.out.print("Digite o peso: ");
        double peso = scan_peso.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scan_altura.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("IMC calculado: " + imc);
        if(imc < 20){
            System.out.println("Abaixo do peso");
        }else if((20 <= imc) && (imc < 25)){
            System.out.println("Peso normal");
        }else if((25 <= imc) && (imc < 30)){
            System.out.println("Sobre Peso");
        }else if((30 <= imc) && (imc < 40)){
            System.out.println("Obeso");
        }else if(40 <= 40){
            System.out.println("Obeso Mórbido");
        }
        scan_altura.close();
        scan_peso.close();
    }
}
