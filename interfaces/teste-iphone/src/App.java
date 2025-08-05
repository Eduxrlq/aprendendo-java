import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       iPhone meuIPhone = new iPhone();
        Scanner scanner = new Scanner(System.in);
       System.out.println("Bem vindo ao seu Iphone");
        while (true){
            System.out.println("=============");
            System.out.println("1- Selecionar música");
            System.out.println("2- Tocar música");
            System.out.println("3- Pausar música");
            System.out.println("4- Abrir o navegador com link");
            System.out.println("5- Abrir nova aba");
            System.out.println("6- Atualizar página");
            System.out.println("7- Ligar");
            System.out.println("8- Atender ligação");
            System.out.println("9- Correio de Voz");
            var option = scanner.nextInt();
            switch (option) {
                 case 1 ->{
                System.out.println("Digite o nome da música: ");
                var songName = scanner.nextLine();
                meuIPhone.selecionarMusica(songName);}
                case 2 -> meuIPhone.tocar();
                case 3 -> meuIPhone.pausar();
                case 4 ->{ System.out.println("Informe a url: ");
                            var link = scanner.nextLine();
                            meuIPhone.exibirPagina(link);
                        }
                case 5 -> meuIPhone.adicionarNovaAba();
                case 6 -> meuIPhone.atualizarPagina();
                case 7 ->{
                    System.out.println("Informe o número para ligar: ");
                    var numeroSelecionado = scanner.nextLine();
                    meuIPhone.ligar(numeroSelecionado);
                }
                case 8 -> meuIPhone.atender();
                case 9 -> meuIPhone.iniciarCorreioVoz();
                    
                default -> System.out.println("Tente novamente");
                    
            }

       }
    }
    
    
   
  
}
