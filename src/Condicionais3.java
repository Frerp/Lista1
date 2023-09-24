import java.util.Scanner;

public class Condicionais3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um inteiro de 1 a 7: ");
        int dia_semana = scan.nextInt();
        if (dia_semana == 1){
            System.out.println("Domingo");
        }else if(dia_semana == 2){
            System.out.println("Segunda");
        }else if(dia_semana == 3){
            System.out.println("Terça");
        }else if(dia_semana == 4){
            System.out.println("Quarta");
        }else if(dia_semana == 5){
            System.out.println("Quinta");
        }else if(dia_semana == 6){
            System.out.println("Sexta");
        }else if(dia_semana == 7){
            System.out.println("Sábado");
        }else{
            System.out.println("Não existe dia da semana equivalente a esse número");
        }
        scan.close();
    }
}
