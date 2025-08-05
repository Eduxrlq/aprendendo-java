import java.util.Scanner;
public class App {
    /*Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
1 Ligar o carro;
2 Desligar o carro;
3 Acelerar;
4 diminuir velocidade;
5 virar para esquerda/direita
6 verificar velocidade;
7 trocar a marcha
Siga as seguintes regras na implementação

Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
O carro desligado não pode realizar nenhuma função;
Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
A velocidade do carro deve respeitar os seguintes limites para cada velocidade
se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;
 */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println(" Simulador de Carro  ");
        System.out.println("--------------------");
        Car carro = new Car();
        while (true) {
            System.out.println("1- Ligar o carro       ");
            System.out.println("2- Acelerar            ");
            System.out.println("3- Diminuir            ");
            System.out.println("4- Virar para esquerda ");
            System.out.println("5- Virar para direita  ");
            System.out.println("6- Verificar velocidade");
            System.out.println("7- Aumentar marcha     ");
            System.out.println("8- Diminuir marcha     ");
            System.out.println("0- Sair do programa    ");
            var option = scanner.nextInt();

            switch(option)
            {
                case 1 -> carro.turnOnOff();
                case 2 -> carro.changeSpeed(carro.speedExcess(1));
                case 3 -> carro.changeSpeed(carro.speedExcess(-1));
                case 4 -> System.out.println(carro.turnSide(true, carro.showSpeed()));
                case 5 -> System.out.println(carro.turnSide(false, carro.showSpeed())); 
                case 6 -> System.out.println("Velocidade atual: " + carro.showSpeed());
                case 7 -> System.out.println("Marcha atual: "+ carro.changeGear(true));
                case 8 -> System.out.println("Marcha atual: "+ carro.changeGear(false));
                case 0 -> {
                    System.out.println("Encerrando o simulador...");
                    scanner.close();
                    System.exit(0);
                }
            }
        }
        
    }
}
