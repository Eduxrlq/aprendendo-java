public final class MeiaIngresso extends IngressoPai {

    public double finalValue(int amount)
    {
        double ticketsValue = (this.getBaseValue() * amount)/2;
        return ticketsValue;
    }
}
