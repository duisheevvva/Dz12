public class RAM {
    private String volume;
    private String manuFacture;

    public RAM(String volume, String manuFacture) {
        this.volume = volume;
        this.manuFacture = manuFacture;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getManuFacture() {
        return manuFacture;
    }

    public void setManuFacture(String manuFacture) {
        this.manuFacture = manuFacture;
    }
    public String getInfo(){
        return   "Volume: " + volume +"\n"+
                "Manu facture: " + manuFacture;
    }
}
