import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("\n\nDigite o primeiro nome!");
        var name1 = scanner.next();
        System.out.println("\n\nDigite a idade: ");
        var age1 = scanner.nextInt();
        System.out.println("\n\nDigite o segundo nome: ");
        var name2 = scanner.next();
        System.out.println("\n\nDigite a idade do segundo: ");
        var age2 = scanner.nextInt();

        var diff = (age1 > age2) ? age1 - age2 : age2 - age1;
        System.out.printf("\n\nA diferença de idade entre %s e %s é de %s anos", name1, name2, diff);



    }
}
