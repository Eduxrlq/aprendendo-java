import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("\nDigite um número: ");
        var number = scanner.nextInt();
        System.out.println("\nInforme o multiplicador limite da tabuada: ");
        var multiplier = scanner.nextInt();
        for(int i = 1; i <= multiplier;i++)
        {
            System.out.printf("%s x %s = %s \n",number, i , number * i);
        }
        System.out.println("\nFim da execução");

    }
}
