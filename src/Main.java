public class Main {
    public static void main(String[] args) {
Lenovo lenovo= new Lenovo("Lenovo IDEAPAD 3", "black","Intel UHD Graphics","Yes there are keys");

        System.out.println(lenovo.getInfo());

        System.out.println("~~~~~~~~~~~~~~~~Display~~~~~~~~~~~~~~");

        Display display = new Display("15.6/1920x1080 pix.","China","IPS");

        System.out.println(display.getInfo());

        System.out.println("~~~~~~~~~~~~~~~SSD~~~~~~~~~~~~~");

        SSD ssd = new SSD("128GB","9");

        System.out.println(ssd.getInfo());

        System.out.println("~~~~~~~~~~~~~RAM~~~~~~~~~~~");

        RAM ram = new RAM("64GB"," May 19, 2020");

        System.out.println(ram.getInfo());

        System.out.println("~~~~~~~~~~~~~~USB port~~~~~~~~~~~~");
            USBPort usbPort=new USBPort("512 GB SSD",12L);
            System.out.println(usbPort.getInfo());

    }
}