public class Car {

    private boolean turnOn = false;
    private int speed = 0;
    private int currentGear = 0;

    public String turnSide(boolean side, int currentSpeed)
    {
        String chooseSide = "Invalido, carro desligado ou velocidade baixa demais";
        if (side == true && currentSpeed > 0 && turnOn == true)
        {
            chooseSide = "Você virou para o lado esquerdo";
        }
        else if (side == false && currentSpeed > 0 && turnOn == true)
        {
            chooseSide = "Você virou para o lado direito";
        }
        return chooseSide;
    }
    public boolean turnOnOff(){
        if (turnOn == true)
        {turnOn = false;
        System.out.println("Carro desligado!");}
        else{
        turnOn = true;
        System.out.println("Carro ligado!");
        }
        return turnOn;
    }
    public void changeSpeed(int setValue)
    {
        if(setValue == 1 && speed < 120 && turnOn == true)
        {
            System.out.println("Velocidade aumentada em 1km/h");
            speed += 1;
        }
         else if(setValue == -1 && speed > 0 && turnOn == true)
        {
            System.out.println("Velocidade diminuida em 1km/h");
            speed -= 1;
        }
        else if (setValue == 0 || turnOn == false){System.out.println("Velocidade fora de alcance ou carro em estado neutro");}
        
    }
    public int showSpeed()
    {
        return speed;
    }
   

    public int changeGear(boolean set){
        if(set == true && turnOn == true && currentGear < 6)
        {
            currentGear += 1;
        }
        else if(set == false && turnOn == true && currentGear > 0){
            currentGear -= 1;
        }
        return currentGear;
    }

    public int speedExcess(int change){
        boolean outRange = false;
        if (currentGear == 1 && (speed < 0 || speed > 20)) outRange = true;
        else if (currentGear == 2 && (speed < 21 || speed > 40)) outRange = true;
        else if((speed < 41 || speed > 60) && (currentGear == 3)) outRange = true;
        else if (currentGear == 4 && (speed < 61 || speed > 80)) outRange = true;
        else if (currentGear == 5 && (speed < 81 || speed > 100)) outRange = true;
        else if (currentGear == 6 && (speed < 101 || speed > 120)) outRange = true;

        if (!outRange && currentGear != 0) return change;
        else {
            change = 0;
            return change;
        }
    }
    
}
