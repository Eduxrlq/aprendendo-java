import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("\n\nInforme a base do retângulo: ");
        var base = scanner.nextInt();
        System.out.println("\n\nDigite a altura do retângulo: ");
        var altura = scanner.nextInt();
        int area = base * altura;
        System.out.printf("\n\nA área do retângulo é: " + area);

    }
}
