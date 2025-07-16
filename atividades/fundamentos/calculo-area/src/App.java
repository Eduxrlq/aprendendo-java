import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o valor do lado: ");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("O valor da área é: %s ", area);


    }
}
