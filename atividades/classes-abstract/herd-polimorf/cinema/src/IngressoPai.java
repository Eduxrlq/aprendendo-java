public abstract sealed class IngressoPai permits IngressoFamilia, IngressoNormal, MeiaIngresso, BuyTicket{
    
    private double baseValue = 25.0;
    private String movieName; 
    private String audioOption;
    public double getBaseValue() {
        return baseValue;
    }
    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public String getaudioOption() {
        return audioOption;
    }
    public void setaudioOption(String audioOption) {
        this.audioOption = audioOption;
    }
    
     
}
