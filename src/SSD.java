public class SSD {
    private String memory;
    private String howManyDisks;

    public SSD(String memory, String howManyDisks) {
        this.memory = memory;
        this.howManyDisks = howManyDisks;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHowManyDisks() {
        return howManyDisks;
    }

    public void setHowManyDisks(String howManyDisks) {
        this.howManyDisks = howManyDisks;
    }
    public String getInfo(){
        return "memory: " + memory + "\n" +
                "How many disks: "+ howManyDisks;
    }
}
