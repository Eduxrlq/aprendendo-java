import java.util.Scanner;
import java.time.LocalDate;
public class App {
    public static void main(String[] args) throws Exception {
       LocalDate ano = LocalDate.now();
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: \n");
        var name = scanner.next();
        System.out.println("Informe seu ano de nascimento: \n");
        var year = scanner.nextInt();
        int age = ano.getYear() - year;
        System.out.printf("Olá %s , você tem %s anos", name , age); 
    }
}
