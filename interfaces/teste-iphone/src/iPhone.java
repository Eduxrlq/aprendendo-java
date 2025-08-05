/*


Lançamento iPhone 2007

Minutos relevantes: 00:15 até 00:55
Funcionalidades a Modelar
Reprodutor Musical
Métodos: tocar(), pausar(), selecionarMusica(String musica)
Aparelho Telefônico
Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
Navegador na Internet
Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()
 */

public class iPhone implements Navegador, AparelhoTelefone, ReprodutorMusical {
        
    
        @Override
            public void tocar(){
                System.out.println("Música tocando!");
            }
            @Override
        public void pausar(){
                System.out.println("Música pausada!");
        }
        @Override
        public void selecionarMusica(String music){
            System.out.println("Música tocando: " + music);
        }
        @Override
        public void ligar(String numero) throws InterruptedException{
            System.out.println("Chamando..");
            Thread.sleep(3000);

        }
        @Override
        public void atender(){
            System.out.println("Ligação atendida!");

        }
        @Override
        public void iniciarCorreioVoz()throws InterruptedException{
            System.out.println("Iniciando correio de voz..");
            Thread.sleep(5000);
            System.out.println("O correio está vazio agora!");

        }
        @Override
        public void exibirPagina(String url){
            System.out.println("Página aberta: " + url);
        }
        @Override
        public void adicionarNovaAba(){
            System.out.println("Nova aba adicionada");

        }
        @Override
        public void atualizarPagina(){
            System.out.println("Página atualizada!");

 }
}
