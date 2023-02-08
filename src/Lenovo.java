public class Lenovo {
    private String marca;
    private String color;
    private String videoCard;

    private String keyboard;

    public Lenovo(String marca, String color, String videoCard, String keyboard) {
        this.marca = marca;
        this.color = color;
        this.videoCard = videoCard;
        this.keyboard = keyboard;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getInfo() {
        return "Marka: " + marca + "\n" +
                "Color: " + color + "\n" +
                "Vidiocard: " + videoCard + "\n" +
                "keyboard: " + keyboard;
    }
}
