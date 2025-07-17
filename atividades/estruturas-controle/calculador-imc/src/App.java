import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("\nInforme sua altura em metros: ");
        var height = scanner.nextFloat();
        System.out.println("\nAgora informe seu peso em kg: ");
        var weight = scanner.nextFloat();
        var imc = weight/(height*height);
      

        if(imc <= 18.5)
        {
           System.out.printf( "\n Seu IMC é: %.1f \n Está abaixo do peso", imc);
        }
        else if(imc >= 18.6 && imc <= 24.9)
        {
           System.out.printf( "\nSeu IMC é: %.1f \nPeso ideal", imc);
        }
        else if(imc >= 25.0 && imc <= 29.9)
        {
           System.out.printf( "\n Seu IMC é: %.1f \nLevemente acima do peso", imc);
        }
         else if(imc >= 30.0 && imc <= 34.9)
        {
           System.out.printf( "\nSeu IMC é: %.1f \nObesidade Grau I", imc);
        }
        else if(imc >= 35.0 && imc <= 39.9)
        {
           System.out.printf( "\nSeu IMC é: %.1f \nObesidade Grau II (Severa)", imc);
        }
         else 
        {
           System.out.printf( "Seu IMC é: %.1f \nObesidade Grau III (Mórbida) ", imc);
        }
        
        System.out.println("\nFim da execução");

    }
}
