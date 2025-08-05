public final class BuyTicket extends IngressoPai {
    private double totalValue = 0;

    public double setTotalValue(int normal, int half, int family){
        totalValue += (normal * getBaseValue()) + half * (getBaseValue()/2);
        if (family > 3) totalValue += family * (getBaseValue() * 0.95);
        else totalValue += family * getBaseValue();  
        return totalValue;
    }
}
