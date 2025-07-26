package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
 public static void main(String[] args )
 {
    System.out.println("Processo Seletivo\n");
    seletorCandidatos();
 }

 static boolean atender(){
    return new Random().nextInt(3)==1;
 }
 static void showSelected(String names []){
    System.out.println("\nImprimindo a lista de candidatos selecionados e o índice");
    for(int indice = 0; indice < names.length; indice++) {
        System.out.println("Candidato selecionado nº " + (indice + 1) + ": " + names[indice]);
    }
    System.out.println("Forma abreviada de interação foreach");
    for (String candidato : names){
        System.out.println("Candidato selecionado: " + candidato);
    }


 }
 static void seletorCandidatos()
 {
    String [] candidatos = {"Felipe", "Edu", "Daniel", "Pedro", "Juca", "Robinho","Paulo", "Davi", "Rodrigo", "Lucas"};
    int selected = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    String selecionados [] = new String[5];
    while(selected < 5 && candidatoAtual < candidatos.length)
    {
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = valorPretendido();
        System.out.printf("O candidato %s solicitou o seguinte salário: R$ %.2f",candidato, salarioPretendido);
        if (salarioBase >= salarioPretendido){
            System.out.println("\nO candidato " + candidato + " foi selecionada para a vaga");
            selected++;
            selecionados[selected - 1] = candidato;
            
        }
        candidatoAtual++;
    }
    showSelected(selecionados);  
}
static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
 static void analisarCandidato(double salarioPretendido)
 {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido)
    {
        System.out.println("\nLigar para o candidato");
    }
    else if(salarioBase == salarioPretendido){
        System.out.println("\nLigar para o candidato com contra proposta");
    }
    else{
        System.out.println("\nAguardando o resultado dos demais candidatos");
    }
 }
}
